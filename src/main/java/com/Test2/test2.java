package com.Test2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串字符");
        String str=sc.nextLine();
        char [] chars=str.toCharArray();

        int english=0;
        int number=0;
        int space=0;
        int el=0;

        for(char c:chars){
            if(c==32){
               space++;
            }else if(c>=48&&c<=57){
               number++;
            }else if(c>=65&&c<=90||c>=97&&c<=122){
               english++;
            }else {
                el++;
            }

        }

        System.out.println("字母有："+english+"个");
        System.out.println("数字有："+number+"个");
        System.out.println("空格有："+space+"个");
        System.out.println("其他有："+el+"个");
    }

}
