package com.company.threadDemo;

public class TwoThreadAlive extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            printMsg();
        }
    }
    public void printMsg() {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name=" + name);
    }
    public void  testThreadT(){
        TwoThreadAlive tt = new TwoThreadAlive();
        tt.setName("Thread");
        System.out.println("before start(), tt.isAlive()=" + tt.isAlive());
        tt.start();
        System.out.println("just after start(), tt.isAlive()=" + tt.isAlive());
        for (int i = 0; i < 10; i++) {
            tt.printMsg();
        }
        System.out.println("The end of main(), tt.isAlive()=" + tt.isAlive());
    }
    public static void main(String[] args) {
//        TwoThreadAlive tha = new TwoThreadAlive();
//        tha.printMsg();
//        tha.testThreadT();
        String power_unid="test";
        String lawCondition="power_unid ='"+power_unid+"'";
        System.out.println(lawCondition);
        String width="test";
    }
}
