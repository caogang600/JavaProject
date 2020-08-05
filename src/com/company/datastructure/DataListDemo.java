package com.company.datastructure;

import java.util.LinkedList;
import java.util.List;

public class DataListDemo {
    public void operationListDatasource(){
        LinkedList<String> llist = new LinkedList<String>();
        llist.add("1");
        llist.add("2");
        llist.add("3");
        llist.add("1");
        llist.addFirst("0");
        llist.addLast("4");
        System.out.println(llist + "first:" + llist.getFirst() + "last：" + llist.getLast());
        llist.subList(2,3).clear();
        System.out.println(llist);
        System.out.println("元素 2 第一次出现的位置：" + llist.indexOf("1"));
        System.out.println("元素 2 最后一次出现的位置："+ llist.lastIndexOf("1"));
        llist.set(2,"5");
        System.out.println(llist);
    }
}
