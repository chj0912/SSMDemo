package com.Test;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class test3_1 {

    /*
     * 服务端
     * */
    public static void main(String[] args) throws IOException {
        System.out.println("服务启动，等待连接");
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        while (true){

            byte[] b = new byte[1024];
            int len = is.read(b);

            if(new String(b, 0, len).equals("over")){
                /*
                 * 回写数据
                 * */
                os.write("服务关闭".getBytes());
                break;

            }
            System.out.println("客户端发过来的消息是：" + new String(b, 0, len));
            OutputStream os2 = socket.getOutputStream();
            os2.write("收到你发的消息了".getBytes());
        }
        os.close();
        is.close();
        socket.close();
    }

}