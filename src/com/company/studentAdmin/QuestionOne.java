package com.company.studentAdmin;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionOne extends JFrame {
    JPanel jap =null;

    JPanel jap1=null;
    JTextField JaTF1=null;JLabel jab1 = null;

    JPanel jap2=null;
    JTextField JaTF2=null;JLabel jab2 = null;

    JPanel jap3=null;
    JTextField JaTF3=null;JLabel jab3 = null;

    JPanel jap4=null;
    JTextField JaTF4=null;JLabel jab4 = null;

    JPanel jap5=null;
    JTextField JaTF5=null;JLabel jab5 = null;

    JPanel jap6=null;
    JTextField JaTF6=null;JLabel jab6 = null;

    JPanel jap7=null;
    JTextField JaTF7=null;JLabel jab7 =null;

    JPanel jap8=null;
    JButton jab=null;


    JPanel jap9=null;JLabel jab9=null;


    JPanel jbp =null;

    JPanel jbp1=null;JTextField JbTF1=null;JLabel jbb1 = null;
    JPanel jbp2=null;JTextField JbTF2=null;JLabel jbb2 = null;
    JPanel jbp3=null;JTextField JbTF3=null;JLabel jbb3 = null;
    JPanel jbp4=null;JTextField JbTF4=null;JLabel jbb4 = null;
    JPanel jbp5=null;JTextField JbTF5=null;JLabel jbb5 = null;
    JButton jbb=null;


    JPanel jcp =null;

    JPanel jcp1=null;JTextField JcTF1=null;JLabel jcb1 = null;
    JPanel jcp2=null;JTextField JcTF2=null;JLabel jcb2 = null;
    JPanel jcp3=null;JTextField JcTF3=null;JLabel jcb3 = null;
    JPanel jcp4=null;JTextField JcTF4=null;JLabel jcb4 = null;
    JPanel jcp5=null;JTextField JcTF5=null;JLabel jcb5 = null;
    JButton jcb=null;


    JPanel jdp =null;

    JPanel jdp1=null;JTextField JdTF1=null;JLabel jdb1 = null;
    JPanel jdp2=null;JTextField JdTF2=null;JLabel jdb2 = null;
    JPanel jdp3=null;JTextField JdTF3=null;JLabel jdb3 = null;
    JPanel jdp4=null;JTextField JdTF4=null;JLabel jdb4 = null;
    JPanel jdp5=null;JTextField JdTF5=null;JLabel jdb5 = null;
    JPanel jdp6=null;JTextField JdTF6=null;JLabel jdb6 = null;
    JButton jdb=null;


    JPanel jep =null;

    JPanel jep1=null;JTextField JeTF1=null;JLabel jeb1 = null;
    JPanel jep2=null;JButton JeB1=null;
    JPanel jep3=null;JButton JeB2=null;
    JPanel jep4=null;JTextField JeTF4=null;JLabel jeb4 = null;
    JPanel jep5=null;JTextField JeTF5=null;JLabel jeb5 = null;
    JPanel jep6=null;JTextField JeTF6=null;JLabel jeb6 = null;
    JPanel jep7=null;JTextField JeTF7=null;JLabel jeb7 = null;
    JPanel jep8=null;JTextField JeTF8=null;JLabel jeb8 = null;
    JPanel jep9=null;JTextField JeTF9=null;JLabel jeb9 = null;
    JPanel jep10=null;JTextField JeTF10=null;JLabel jeb10 = null;
    JPanel jep11=null;JTextField JeTF11=null;JLabel jeb11 = null;
    JPanel jep12=null;JTextField JeTF12=null;JLabel jeb12 = null;
    JPanel jep13=null;JTextField JeTF13=null;JLabel jeb13 = null;
    JTabbedPane JTP =null;

    DbPress dbprocess=new DbPress();
    public QuestionOne (){
        jap=new JPanel();//return jap;

        jap1=new JPanel();
        JaTF1=new JTextField(8);
        jab1 = new JLabel("学号");
        jab1.setFont(new Font(null, Font.PLAIN,20));
        jap1.add(jab1);
        jap1.add(JaTF1);

        jap2=new JPanel();
        JaTF2=new JTextField(8);
        jab2 = new JLabel("姓名");
        jab2.setFont(new Font(null,Font.PLAIN,20));
        jap2.add(jab2);
        jap2.add(JaTF2);

        jap3=new JPanel();
        JaTF3=new JTextField(8);
        jab3 = new JLabel("性别");
        jab3.setFont(new Font(null,Font.PLAIN,20));
        jap3.add(jab3);
        jap3.add(JaTF3);

        jap4=new JPanel();
        JaTF4=new JTextField(8);
        jab4 = new JLabel("生日");
        jab4.setFont(new Font(null,Font.PLAIN,20));
        jap4.add(jab4);
        jap4.add(JaTF4);

        jap5=new JPanel();
        JaTF5=new JTextField(8);
        jab5 = new JLabel("籍贯");
        jab5.setFont(new Font(null,Font.PLAIN,20));
        jap5.add(jab5);
        jap5.add(JaTF5);

        jap6=new JPanel();
        JaTF6=new JTextField(8);
        jab6 = new JLabel("院系");
        jab6.setFont(new Font(null,Font.PLAIN,20));
        jap6.add(jab6);
        jap6.add(JaTF6);

        jap7=new JPanel();
        JaTF7=new JTextField(8);
        jab7 = new JLabel("班级");
        jab7.setFont(new Font(null,Font.PLAIN,20));
        jap7.add(jab7);
        jap7.add(JaTF7);

        jap8=new JPanel();
        jab=new JButton("输入");
        jab.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getActionCommand().equals("输入")
                        &&!JaTF1.getText().isEmpty()
                        &&!JaTF2.getText().isEmpty()
                        &&!JaTF3.getText().isEmpty()
                        &&!JaTF4.getText().isEmpty()
                        &&!JaTF5.getText().isEmpty()
                        &&!JaTF6.getText().isEmpty()
                        &&!JaTF7.getText().isEmpty())
                {
                    System.out.println("actionPerformed(). 输入");
                    String sNo=JaTF1.getText().trim();
                    String sName=JaTF2.getText().trim();
                    String sSex=JaTF3.getText().trim();
                    String sBir=JaTF4.getText().trim();
                    String sHom=JaTF5.getText().trim();
                    String sDep=JaTF6.getText().trim();
                    String sCla=JaTF7.getText().trim();
                    String sql = "insert into student(STUDENTID,NAME,SEX,CLASS,DEPARTMENT,BIRTHDAY,NATIVE_PLACE) values(";
                    sql = sql + sNo + ",'"+ sName + "','" + sSex + "'," + sCla + "," + sDep + ",'" + sBir + "','" + sHom + "')";
                    System.out.println(sql);
                    new DbPress().executeUpdate(sql);
                }
            }
        });
        Dimension preferredSize = new Dimension(150,20);
        jab.setPreferredSize(preferredSize);
        jap8.add(jab);

//        jab9=new JLabel("<html>作者：ZTY</html>");
//        jap9=new JPanel(new FlowLayout());
//        jap9.add(jab9);

        jap.add(jap1);
        jap.add(jap2);
        jap.add(jap3);
        jap.add(jap4);
        jap.add(jap5);
        jap.add(jap6);
        jap.add(jap7);
        jap.add(jap8);
//        jap.add(jap9);


        jbp=new JPanel();//return jbp;
        jbp1=new JPanel();
        jbp2=new JPanel();
        jbp3=new JPanel();
        jbp4=new JPanel();
        jbp5=new JPanel();

        JbTF1=new JTextField(8);
        jbb1=new JLabel("记录号");
        jbb1.setFont(new Font(null,Font.PLAIN,20));
        jbp1.add(jbb1);jbp1.add(JbTF1);

        JbTF2=new JTextField(8);
        jbb2=new JLabel("学号");
        jbb2.setFont(new Font(null,Font.PLAIN,20));
        jbp2.add(jbb2);jbp2.add(JbTF2);

        JTextField JbTF3=new JTextField(4);
        JLabel jbb3=new JLabel("变更代码");
        jbb3.setFont(new Font(null,Font.PLAIN,20));
        jbp3.add(jbb3);jbp3.add(JbTF3);

        JbTF4=new JTextField(6);
        jbb4=new JLabel("记录时间");
        jbb4.setFont(new Font(null,Font.PLAIN,20));
        jbp4.add(jbb4);jbp4.add(JbTF4);

        JbTF5=new JTextField(11);
        jbb5=new JLabel("描述");
        jbb5.setFont(new Font(null,Font.PLAIN,20));
        jbp5.add(jbb5);jbp5.add(JbTF5);
        jbb=new JButton("输入");
        Dimension preferredSize2 = new Dimension(136,20);
        jbb.setPreferredSize(preferredSize2);
        jbp5.add(jbb);


        jbp.add(jbp1);jbp.add(jbp2);jbp.add(jbp3);jbp.add(jbp4);jbp.add(jbp5);
        jbb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getActionCommand().equals("输入")
                        &&!JbTF1.getText().isEmpty()
                        &&!JbTF2.getText().isEmpty()
                        &&!JbTF3.getText().isEmpty()
                        &&!JbTF4.getText().isEmpty()
                        &&!JbTF5.getText().isEmpty())
                {
                    System.out.println("actionPerformed(). 输入");
                    String ID=JbTF1.getText().trim();
                    String SI=JbTF2.getText().trim();
                    String CE=JbTF3.getText().trim();
                    String R_T=JbTF4.getText().trim();
                    String DSRPIN=JbTF5.getText().trim();

                    String sql = "insert into chang(ID,STUDENTID,CHAN,REC_TIME,DSRPIN) values(";
                    sql=sql +ID+','+SI+','+CE+','+"'"+R_T+"'"+ ','+"'"+DSRPIN+"')";
                    System.out.println(sql);
                    new DbPress().executeUpdate(sql);
                }
            }
        });

        jcp=new JPanel();//return jcp;
        jcp1=new JPanel();
        jcp2=new JPanel();
        jcp3=new JPanel();
        jcp4=new JPanel();
        jcp5=new JPanel();

        JcTF1=new JTextField(8);
        jcb1=new JLabel("记录号");
        jcb1.setFont(new Font(null,Font.PLAIN,20));
        jcp1.add(jcb1);jcp1.add(JcTF1);

        JcTF2=new JTextField(8);
        jcb2=new JLabel("学号");
        jcb2.setFont(new Font(null,Font.PLAIN,20));
        jcp2.add(jcb2);jcp2.add(JcTF2);

        JcTF3=new JTextField(4);
        jcb3=new JLabel("级别代码");
        jcb3.setFont(new Font(null,Font.PLAIN,20));
        jcp3.add(jcb3);jcp3.add(JcTF3);

        JcTF4=new JTextField(6);
        jcb4=new JLabel("记录时间");
        jcb4.setFont(new Font(null,Font.PLAIN,20));
        jcp4.add(jcb4);jcp4.add(JcTF4);

        JcTF5=new JTextField(11);
        jcb5=new JLabel("描述");
        jcb5.setFont(new Font(null,Font.PLAIN,20));
        jcp5.add(jcb5);jcp5.add(JcTF5);
        jcb=new JButton("输入");
        Dimension preferredSize3 = new Dimension(136,20);
        jcb.setPreferredSize(preferredSize3);
        jcp5.add(jcb);

        jcp.add(jcp1);jcp.add(jcp2);jcp.add(jcp3);jcp.add(jcp4);jcp.add(jcp5);
        jcb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getActionCommand().equals("输入")
                        &&!JcTF1.getText().isEmpty()
                        &&!JcTF2.getText().isEmpty()
                        &&!JcTF3.getText().isEmpty()
                        &&!JcTF4.getText().isEmpty()
                        &&!JcTF5.getText().isEmpty())
                {
                    System.out.println("actionPerformed(). 输入");
                    String ID=JcTF1.getText().trim();
                    String SI=JcTF2.getText().trim();
                    String LEVELS=JcTF3.getText().trim();
                    String R_T=JcTF4.getText().trim();
                    String DSRPIN=JcTF5.getText().trim();

                    String sql = "insert into reward(ID,STUDENTID,LEVELS,REC_TIME,DSRPIN) values(";
                    sql=sql +ID+','+SI+','+LEVELS+','+"'"+R_T+"'"+ ','+"'"+DSRPIN+"')";
                    System.out.println(sql);
                    new DbPress().executeUpdate(sql);
                }
            }
        });


        jdp=new JPanel();//	return jdp;
        jdp1=new JPanel();
        jdp2=new JPanel();
        jdp3=new JPanel();
        jdp4=new JPanel();
        jdp5=new JPanel();
        jdp6=new JPanel();

        JdTF1=new JTextField(8);
        jdb1=new JLabel("记录号");
        jdb1.setFont(new Font(null,Font.PLAIN,20));
        jdp1.add(jdb1);jdp1.add(JdTF1);

        JdTF2=new JTextField(8);
        jdb2=new JLabel("学号");
        jdb2.setFont(new Font(null,Font.PLAIN,20));
        jdp2.add(jdb2);jdp2.add(JdTF2);

        JdTF3=new JTextField(5);
        jdb3=new JLabel("级别代码");
        jdb3.setFont(new Font(null,Font.PLAIN,20));
        jdp3.add(jdb3);jdp3.add(JdTF3);

        JdTF4=new JTextField(6);
        jdb4=new JLabel("记录时间");
        jdb4.setFont(new Font(null,Font.PLAIN,20));
        jdp4.add(jdb4);jdp4.add(JdTF4);

        JdTF5=new JTextField(10);
        jdb5=new JLabel("描述");
        jdb5.setFont(new Font(null,Font.PLAIN,20));
        jdp5.add(jdb5);jdp5.add(JdTF5);

        JdTF6=new JTextField(4);
        jdb6=new JLabel("是否生效");
        jdb6.setFont(new Font(null,Font.PLAIN,20));
        jdp6.add(jdb6);jdp6.add(JdTF6);

        jdb=new JButton("输入");
        Dimension preferredSize4 = new Dimension(136,20);
        jdb.setPreferredSize(preferredSize4);

        jdp.add(jdp1);jdp.add(jdp2);jdp.add(jdp3);jdp.add(jdp4);jdp.add(jdp5);jdp.add(jdp6);jdp.add(jdb);
        jdb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getActionCommand().equals("输入")
                        &&!JdTF1.getText().isEmpty()
                        &&!JdTF2.getText().isEmpty()
                        &&!JdTF3.getText().isEmpty()
                        &&!JdTF4.getText().isEmpty()
                        &&!JdTF5.getText().isEmpty()
                        &&!JdTF6.getText().isEmpty())
                {
                    System.out.println("actionPerformed(). 输入");
                    String ID=JdTF1.getText().trim();
                    String SI=JdTF2.getText().trim();
                    String LEVELS=JdTF3.getText().trim();
                    String R_T=JdTF4.getText().trim();
                    String DSRPIN=JdTF5.getText().trim();
                    String ENABLE=JdTF6.getText().trim();

                    String sql = "insert into punishment(ID,STUDENTID,LEVELS,REC_TIME,ENABLE,DSRPIN) values(";
                    sql=sql +ID+','+SI+','+LEVELS+','+"'"+R_T+"'"+ ','+ "'" + ENABLE + "',"+"'"+DSRPIN+"')";
                    System.out.println(sql);
                    new DbPress().executeUpdate(sql);
                }//输入级别为0-4之间不能超过4
            }
        });


        jep=new JPanel();//	return jep;
        jep1=new JPanel();
        jep2=new JPanel();
        jep3=new JPanel();
        jep4=new JPanel();
        jep5=new JPanel();
        jep6=new JPanel();
        jep7=new JPanel();
        jep8=new JPanel();
        jep9=new JPanel();
        jep10=new JPanel();
        jep11=new JPanel();
        jep12=new JPanel();
        jep13=new JPanel();

        JeTF1=new JTextField(8);
        jeb1=new JLabel("学号");
        jeb1.setFont(new Font(null,Font.PLAIN,20));
        jep1.add(jeb1);jep1.add(JeTF1);

        JeB1=new JButton("查询");
        Dimension preferredSize5 = new Dimension(136,20);
        JeB1.setPreferredSize(preferredSize5);
        JeB1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getActionCommand().equals("查询")&&!JeTF1.getText().trim().isEmpty())
                {
                    String sql=JeTF1.getText().trim();
                    queryall(sql);
                }
            }
        });
        jep2.add(JeB1);

        JeB2=new JButton("修改");
        Dimension preferredSize6 = new Dimension(136,20);
        JeB2.setPreferredSize(preferredSize6);
        JeB2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getActionCommand().equals("修改")&&!JeTF1.getText().trim().isEmpty())
                {
                    String sql=JeTF1.getText().trim();
                    changeall(sql);
                }
            }
        });

        jep3.add(JeB2);

        JeTF4=new JTextField(8);
        jeb4=new JLabel("学籍变动");
        jeb4.setFont(new Font(null,Font.PLAIN,20));
        jep4.add(jeb4);jep4.add(JeTF4);

        JeTF5=new JTextField(8);
        jeb5=new JLabel("记录时间");
        jeb5.setFont(new Font(null,Font.PLAIN,20));
        jep5.add(jeb5);jep5.add(JeTF5);

        JeTF6=new JTextField(8);
        jeb6=new JLabel("描述");
        jeb6.setFont(new Font(null,Font.PLAIN,20));
        jep6.add(jeb6);jep6.add(JeTF6);

        JeTF7=new JTextField(8);
        jeb7=new JLabel("奖励");
        jeb7.setFont(new Font(null,Font.PLAIN,20));
        jep7.add(jeb7);jep7.add(JeTF7);

        JeTF8=new JTextField(8);
        jeb8=new JLabel("记录时间");
        jeb8.setFont(new Font(null,Font.PLAIN,20));
        jep8.add(jeb8);jep8.add(JeTF8);

        JeTF9=new JTextField(8);
        jeb9=new JLabel("描述");
        jeb9.setFont(new Font(null,Font.PLAIN,20));
        jep9.add(jeb9);jep9.add(JeTF9);

        JeTF10=new JTextField(4);
        jeb10=new JLabel("处罚");
        jeb10.setFont(new Font(null,Font.PLAIN,20));
        jep10.add(jeb10);jep10.add(JeTF10);

        JeTF11=new JTextField(3);
        jeb11=new JLabel("记录时间");
        jeb11.setFont(new Font(null,Font.PLAIN,20));
        jep11.add(jeb11);jep11.add(JeTF11);

        JeTF12=new JTextField(8);
        jeb12=new JLabel("描述");
        jeb12.setFont(new Font(null,Font.PLAIN,20));
        jep12.add(jeb12);jep12.add(JeTF12);

        JeTF13=new JTextField(2);
        jeb13=new JLabel("是否生效");
        jeb13.setFont(new Font(null,Font.PLAIN,20));
        jep13.add(jeb13);jep13.add(JeTF13);

        jep.add(jep1);jep.add(jep2);jep.add(jep3);
        jep.add(jep4);jep.add(jep5);jep.add(jep6);
        jep.add(jep7);jep.add(jep8);jep.add(jep9);
        jep.add(jep10);jep.add(jep11);jep.add(jep12);jep.add(jep13);

        JTP=new JTabbedPane();
        JTP.addTab("学生个人信息输入界面 ",jap);
        JTP.addTab("学籍变更情况输入界面",jbp);
        JTP.addTab("奖励信息输入界面",jcp);
        JTP.addTab("处罚情况输入界面",jdp);
        JTP.addTab("学生个人情况查询和修改界面",jep);
        JTP.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("当前选中的选项卡: " + JTP.getSelectedIndex());
            }
        });
        // 设置默认选中的选项卡
        JTP.setSelectedIndex(0);
        this.add(JTP);
        this.setLayout(new GridLayout(2, 1));
        this.setContentPane(JTP);
        this.setSize(600,400);
        this.setLocation(400, 180);
        this.setTitle("学生信息管理系统");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String args[]){
        // TODO Auto-generated method stub
        QuestionOne hh= new QuestionOne();
    }

    public void queryall(String sql)
    {
        String s1="select change_code.DSRPIN,chang.REC_TIME,chang.DSRPIN as REASON from chang join change_code on change_code.CODE = chang.CHAN";
        s1=s1+" where STUDENTID = "+sql;

        String s2="select reward_levels.DSRPIN,reward.REC_TIME,reward.DSRPIN as REASON from reward join reward_levels on reward_levels.CODE=reward.LEVELS";
        s2=s2+" where STUDENTID = "+sql;

        String s3="select punish_levels.DSRPIN,punishment.REC_TIME,punishment.DSRPIN as REASON,punishment.ENABLE from punishment join punish_levels on punish_levels.CODE=punishment.LEVELS";
        s3=s3+" where STUDENTID = "+sql;
        try{
            dbprocess.connect();
            dbprocess.sta=dbprocess.con.createStatement();
            ResultSet RS1=dbprocess.sta.executeQuery(s1);
            while(RS1.next())
            {
                String P1=RS1.getString("DSRPIN");
                String P2=RS1.getString("REC_TIME");
                String P3=RS1.getString("REASON");
                System.out.println(P1);System.out.println(P2);System.out.println(P3);
                JeTF4.setText(P1);JeTF5.setText(P2);JeTF6.setText(P3);
            }
        }
        catch(SQLException ex) {
            System.err.println(ex.getMessage());
        }
        dbprocess.disconnect();

        try {
            dbprocess.connect();
            dbprocess.sta=dbprocess.con.createStatement();
            ResultSet RS1=dbprocess.sta.executeQuery(s2);
            while(RS1.next())
            {
                String P4=RS1.getString("DSRPIN");
                String P5=RS1.getString("REC_TIME");
                String P6=RS1.getString("REASON");
                System.out.println(P4);System.out.println(P5);System.out.println(P6);
                JeTF7.setText(P4);JeTF8.setText(P5);JeTF9.setText(P6);
            }
        }
        catch(SQLException ex) {
            System.err.println(ex.getMessage());
        }
        dbprocess.disconnect();
        try {
            dbprocess.connect();
            dbprocess.sta=dbprocess.con.createStatement();
            ResultSet RS1=dbprocess.sta.executeQuery(s3);
            while(RS1.next())
            {
                String P7=RS1.getString("DSRPIN");
                String P8=RS1.getString("REC_TIME");
                String P9=RS1.getString("REASON");
                String P10=RS1.getString("ENABLE");
                System.out.println(P7);System.out.println(P8);System.out.println(P9);
                JeTF10.setText(P7);JeTF11.setText(P8);JeTF12.setText(P9);JeTF13.setText(P10);
            }
        }
        catch(SQLException ex) {
            System.err.println(ex.getMessage());
        }
        dbprocess.disconnect();
    }
    public void changeall(String sql)
    {
        String changchan=JeTF4.getText();
        String changtime=JeTF5.getText();
        String changedes=JeTF6.getText();
        String rew=JeTF7.getText();
        String rewtime=JeTF8.getText();
        String rewdesc=JeTF9.getText();
        String pun=JeTF10.getText();
        String puntime=JeTF11.getText();
        String pundesc=JeTF12.getText();
        String punfun=JeTF13.getText();


        String d1="delete from chang where STUDENTID = ";
        d1=d1+sql;;
        System.out.println(d1);

        String a1="insert into chang(STUDENTID,CHAN,REC_TIME,DSRPIN) values ("
                + sql +","+ changchan +","+"'" +changtime+"','"+changedes+ "') ";
        System.out.println(a1);


        String d2="delete from reward where STUDENTID = ";
        d2=d2+sql;
        System.out.println(d2);

        String a2="insert into reward(STUDENTID,LEVELS,REC_TIME,DSRPIN) values("
                + sql + "," + rew + ",'" + rewtime + "','" + rewdesc + "')";
        System.out.println(a2);


        String d3="delete from punishment where STUDENTID = ";
        d3=d3+sql;
        System.out.println(d3);

        String a3="insert into punishment(STUDENTID,LEVELS,REC_TIME,ENABLE,DSRPIN) values("
                + sql + "," + pun + ",'" + puntime +"','" + punfun +"','" + pundesc + "')" ;
        System.out.println(a3);


        try {
            dbprocess.connect();
            dbprocess.sta=dbprocess.con.createStatement();
            dbprocess.sta.execute(d1);
            dbprocess.sta.execute(a1);
            JeTF4.setText("");JeTF5.setText("");JeTF6.setText("");
        }
        catch(SQLException ex) {
            System.err.println(ex.getMessage());
        }
        dbprocess.disconnect();

        try {
            dbprocess.connect();
            dbprocess.sta=dbprocess.con.createStatement();
            dbprocess.sta.execute(d2);
            dbprocess.sta.execute(a2);
            JeTF7.setText("");JeTF8.setText("");JeTF9.setText("");
        }
        catch(SQLException ex) {
            System.err.println(ex.getMessage());
        }
        dbprocess.disconnect();

        try {
            dbprocess.connect();
            dbprocess.sta=dbprocess.con.createStatement();
            dbprocess.sta.execute(d3);
            dbprocess.sta.execute(a3);
            JeTF10.setText("");JeTF11.setText("");JeTF12.setText("");JeTF13.setText("");
        }
        catch(SQLException ex) {
            System.err.println(ex.getMessage());
        }
        dbprocess.disconnect();
    }

}
