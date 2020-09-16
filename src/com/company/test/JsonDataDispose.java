package com.company.test;

public class JsonDataDispose {
    public static void main(String[] args) {
        String dataStr = "";
        dataStr = dataStr.replaceAll("\",\"label\":\"","&&&\"");
        dataStr = dataStr.replaceAll("\"fieldId\":\"","&&&");
        dataStr = dataStr.replaceAll(",\"showLabel\"","&&&");
        String [] s = dataStr.split("&&&");
        String newData = "";
        for (int i = 0; i < s.length;i++) {
            if (s[i].length()<100){
                newData += s[i];
            }
        }
        System.out.println(newData);
        String [] ns = newData.split("\"");
        String unique = "";
        String name = "";
        for (int i = 0;i < ns.length; i++){
            if (i%2==0){
                unique +="\n" + ns[i];
            }else {
                name += "\n" + ns[i];
            }
        }
        System.out.println(unique);
        System.out.println(name);
    }
}
