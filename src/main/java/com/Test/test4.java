package com.Test;
import java.io.IOException;
import java.io.InputStream;

public class test4 {

    public static void main(String[] args)throws IOException {
        InputStream is = test4.class.getResourceAsStream("person.properties");
        byte b[] = new byte[1024];
        int len;
        while ((len = is.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
        is.close();
    }
}
