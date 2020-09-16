package com.company.threadDemo;

public class threadalive implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (this){
                if (i == 0){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"synchronized loop " + i);
            }
        }
    }

    public static void main(String[] args) {
        threadalive tha = new threadalive();
        tha.run();
    }
}
