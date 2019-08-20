package com.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class test3 {
    /*
     * 客户端
     * */
    public static void main(String[] args)throws IOException {
        System.out.println("客户端启动");
        Scanner sc=new Scanner(System.in);
        Socket socket=new Socket("localhost",6666);
        while (true){
            OutputStream os=socket.getOutputStream();
            String msg=sc.nextLine();
            if(msg.equals("over")){
                os.write(msg.getBytes());
                break;
            }
            os.write(msg.getBytes());
            /*
             * 接收服务端传来的数据
             * */
            InputStream is=socket.getInputStream();
            byte[] b=new byte[1024];
            int len=is.read(b);
            System.out.println("服务端的数据："+new String(b,0,len));
            is.close();
            os.close();
        }
        socket.close();
    }

}