package com.company.studentAdmin;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;


public class DbPress {
    public Connection con = null;
    public Statement sta=null;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/studentDb?useSSL=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "............";
    public DbPress(){
        try {
            //mysql数据库设置驱动程序类型
            Class.forName(JDBC_DRIVER);
            System.out.println("连接数据库...");
            System.out.println("mysql数据库驱动加载成功");

        }
        catch(java.lang.ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public void executeUpdate(String sql)
    {
        connect();
        try{
            sta=con.createStatement();
            sta.execute(sql);
        }
        catch(SQLException ex) {
            System.err.println(ex.getMessage());
        }
        disconnect();
    }

    public void queryall(String sql)
    {
        connect();
        String s1="select change_code.DSRPIN,chang.REC_TIME,chang.DSRPIN as REASON from chang join change_code on change_code.CODE = chang.CHAN";
        s1=s1+" where STUDENTID = "+sql;
        System.out.println(s1);

        String s2="select reward_levels.DSRPIN,reward.REC_TIME,reward.DSRPIN as REASON from reward join reward_levels on reward_levels.CODE=reward.LEVELS";
        s2=s2+" where STUDENTID = "+sql;
        System.out.println(s2);

        String s3="select punish_levels.DSRPIN,punishment.REC_TIME,punishment.DSRPIN as REASON,punishment.ENABLE from punishment join punish_levels on punish_levels.CODE=punishment.LEVELS";
        s3=s3+" where STUDENTID = "+sql;
        System.out.println(s3);

        try{
            sta=con.createStatement();
            ResultSet RS1=sta.executeQuery(s1);
            while(RS1.next())
            {
                String P1=RS1.getString("DSRPIN");
                String P2=RS1.getString("REC_TIME");
                String P3=RS1.getString("REASON");
                System.out.println(P1);System.out.println(P2);System.out.println(P3);
            }
        }
        catch(SQLException ex) {
            System.err.println(ex.getMessage());
        }
        disconnect();
    }



    public void connect()
    {
        try{
            //mysql数据库
            con = DriverManager.getConnection(DB_URL,USER,PASS);


            if(con!=null){
                System.out.println("数据库连接成功");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public void disconnect(){
        try{
            if(con != null){
                System.out.println("数据库断开成功");
                con.close();
                con = null;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
