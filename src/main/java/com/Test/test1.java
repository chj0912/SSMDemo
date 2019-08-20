package com.Test;

public class test1 {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        new Thread(t, "窗口一").start();
        new Thread(t, "窗口二").start();
        new Thread(t, "窗口三").start();
    }
}
class Ticket implements Runnable{
    private int ticket=100;
    Object lock=new Object();
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        while (true){
            synchronized (lock){
                if(ticket<=0){
                    break;
                }
                try {
                    Thread.sleep(500);
                    if(ticket>0){
                        System.out.println(name+"卖出第"+--ticket+"张票");
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}