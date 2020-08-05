package com.company;

import com.company.datastructure.DataAdd;
import com.company.datastructure.DataListDemo;
import com.company.test.CollectionDemo;
import com.company.test.NetworkDemo;
import com.company.test.NetworkImpl;
import com.company.threadDemo.*;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args)  throws Exception{
        //集合相关
        CollectionDemo collection = new CollectionDemo();
//        collection.runCollection();
        //网络实例
        NetworkDemo network = new NetworkImpl();
//        network.getHostIp();
//       network.getHostNewIp();
//       network.getFileSize();
//       network.catchWebView();
//       network.getURLConnection();
//        network.createServiceSocket();
//        network.createClientSocket();
        //多线程
//        TwoThreadAlive tta = new TwoThreadAlive();
//        tta.testThreadT();
//
//        Main main = new Main();
//        main.testListenerTd();
//        main.pcCubbyhole();
        //数据结构
//        DataAdd add = new DataAdd();
//        add.addData();
        DataListDemo dld = new DataListDemo();
        dld.operationListDatasource();
    }

    private void pcCubbyhole (){
        CubbyHole c = new CubbyHole();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);
        p1.start();
        c1.start();
    }
    private void testListenerTd() throws InterruptedException {
        ListenerThread thrd = new ListenerThread();
        thrd.setName("MyThread #1");
        showThreadStatus(thrd);
        thrd.start();
        Thread.sleep(50);
        showThreadStatus(thrd);
        thrd.waiting = false;
        Thread.sleep(50);
        showThreadStatus(thrd);
        thrd.notice();
        Thread.sleep(50);
        showThreadStatus(thrd);
        while(thrd.isAlive())
            System.out.println("alive");
        showThreadStatus(thrd);
    }
    static void showThreadStatus(Thread thrd) {
        System.out.println(thrd.getName() + "Alive:=" + thrd.isAlive() + " State:=" + thrd.getState());
    }
}
