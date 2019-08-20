package com.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a.txt");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("D:\\test2" + "\\" + file.getName());
        byte[] b = new byte[1024];
        while (fis.read(b) != -1) {
            fos.write(b);
        }
        fos.close();
        fis.close();
    }
}
