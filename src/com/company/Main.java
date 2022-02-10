package com.company;

import com.company.datastructure.DataAdd;
import com.company.datastructure.DataListDemo;
import com.company.test.CollectionDemo;
import com.company.test.NetworkDemo;
import com.company.test.NetworkImpl;
import com.company.test.ResponseMsg;
import com.company.threadDemo.*;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.*;

public class Main {

    public static void main(String[] args)  throws Exception{
        //
        //集合相关
//        CollectionDemo collection = new CollectionDemo();
//        collection.runCollection();
        //网络实例
//        NetworkDemo network = new NetworkImpl();
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
//        DataListDemo dld = new DataListDemo();
//        dld.operationListDatasource();

//        Main main = new Main();
//        main.propertiesDemo();
    }

    private void  propertiesDemo(){
        Properties capitals = new Properties();
        Set states;
        String str;
        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");
        // Show all states and capitals in hashtable.
        states = capitals.keySet(); // get set-view of keys
        Iterator itr = states.iterator();
        while(itr.hasNext()) {
            str = (String) itr.next();
            System.out.println("The capital of " +
                    str + " is " + capitals.getProperty(str) + ".");
        }
        System.out.println();
        // look for state not in list -- specify default
        str = capitals.getProperty("Florida", "Not Found");
        System.out.println("The capital of Florida is "
                + str + ".");
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
