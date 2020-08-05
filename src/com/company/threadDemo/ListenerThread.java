package com.company.threadDemo;

public class ListenerThread extends Thread{
   public boolean waiting= true;
   public boolean ready= false;
    public ListenerThread() {
    }
    public void run() {
        String thrdName = Thread.currentThread().getName();
        System.out.println(thrdName + " starting.");
        while(waiting)
            System.out.println("waiting:"+waiting);
        System.out.println("waiting...");
        startWait();
        try {
            Thread.sleep(1000);
        }
        catch(Exception exc) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }
    synchronized void startWait() {
        try {
            while(!ready) wait();
        }
        catch(InterruptedException exc) {
            System.out.println("wait() interrupted");
        }
    }
    public synchronized void notice() {
        ready = true;
        notify();
    }
}
