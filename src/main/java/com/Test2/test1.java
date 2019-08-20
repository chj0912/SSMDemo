package com.Test2;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入游戏人数");
        int player=sc.nextInt();

        int [] players=new int[player];

        for(int i=0;i<players.length;i++){
            players[i]=1;
        }
        int leftcount=player;
        int count=0;
        int index=0;
        while (leftcount>1){
            //值为1的才可以游戏
            if(players[index]==1){
                count++;//喊数
                if(count==3){
                    count=0;
                    players[index]=0;
                    leftcount--;//离开一个人
                }
            }
            index++;
            if(index==players.length){
                index=0;
            }
        }

            for(int i=0;i<players.length;i++){
                System.out.println(players[i]);
                if (players[i]==1){
                    System.out.println("最后留下的是原来的"+(i+1)+"号位");
                }

        }
















    }


}
