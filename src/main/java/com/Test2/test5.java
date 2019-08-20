package com.Test2;

import java.util.HashSet;
import java.util.Set;

public class test5 {
    public static void main(String[] args) {
        String [] arr={"1","2","3","4"};
        Set<String> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                for (int k=0;k<arr.length;k++){
                    if(i!=j&&i!=k&&j!=k){
                        set.add(arr[i]+arr[j]+arr[k]);
                    }
                }
            }
        }
        System.out.println("有"+set.size()+"个");

        for(String s:set){
            System.out.println(s);
        }

    }

}
