package com.company.threadDemo;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str1 = "";
        str1 = str1.replaceAll("\",\"label\":\"","&\"");
        str1 = str1.replaceAll("\"fieldId\":\"","&");
        str1 = str1.replaceAll(",\"showLabel\"","&");
        String[] s = str1.split("&");
        String l = "";
        for(int i=0; i<s.length;i++){
            if(s[i].length()<100){
                l += s[i];
            }
        }
        String arrString = Arrays.toString(s);

        System.out.println(l);
        String[] lll = l.split("\"");
        String m = "";
        String n = "";
        for(int i=0; i<lll.length;i++){
            if(i%2==0){
                m += "\n"+lll[i];
            }else{
                n += "\n"+lll[i];
            }

        }
        System.out.println(m);//字段
        System.out.println(n);//中文
    }
}
