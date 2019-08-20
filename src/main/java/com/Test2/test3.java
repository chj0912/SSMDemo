package com.Test2;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入某年某月某日：（格式：2019-08-03）");
        String data = sc.nextLine();
        String[] datas = data.split("-");

        int year = Integer.parseInt(datas[0]);
        int month = Integer.parseInt(datas[1]);
        int day = Integer.parseInt(datas[2]);
        int dayNum=0;
        for (int i = 1; i < month; i++) {
            int days = 0;
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                    default:
                        System.out.println("错误日期");
                        break;
            }
            dayNum +=days;
        }


        System.out.println("这一天是这一年的第："+dayNum+day+"天");


    }


}
