package com.company.datastructure;

public class DataAdd {
    public  void addData(){
        //sum方法.
        int limit = 1000;
        int i = 1;
        int sum = 0;
        do{
            sum = sum + i;
            i ++;
        }
        while (i <= limit);
        System.out.println(sum);
    }
}
