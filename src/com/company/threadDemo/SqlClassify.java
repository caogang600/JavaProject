package com.company.threadDemo;

import com.mysql.cj.util.StringUtils;

public class SqlClassify {
    public static void main(String[] args) {
        //获取sql语句表字段的属性，格式和备注
        String str = "";
        int lenth = str.length();
        str = str.substring(1,lenth);
        str = str.replace("\\n\" +","");
        str = str.replace("`"," ");
        str = str.replace("'"," ");
        str = str.replace(",","");
        str = str.replace("\n","");
        str = str.replace("  ","&");
        System.out.println(str);
        String[] newStr = str.split("&");
        String str4 = "";
        String str3 = "";
        String str2 = "";
        String str1 = "";
        for(int i=0; i<newStr.length;i++){
            if ((i+1)%4==0){
                str3 +="\n"+newStr[i];
            }else if ((i+2)%4==0){
                String str5 = newStr[i];
                int sl = str5.indexOf(" ");
                str4 +="\n"+str5.substring(0,sl);
                str2 +="\n"+str5.substring(sl+1);
            }else if ((i+3)%4==0) {
                str1 +="\n"+newStr[i];
            }
        }
        System.out.println(str1);
        System.out.println(str4);
        System.out.println(str2);
        System.out.println(str3);

    }

}
