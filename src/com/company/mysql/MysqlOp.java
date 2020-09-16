package com.company.mysql;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MysqlOp {
    public static void main(String[] args){
        UserDao userDao = new UserDaoImpl();
//        boolean isLogin = userDao.login("caogang","123456");
//        System.out.println(isLogin);

//        User user = new User();
//        user.setId(7);
//        user.setHome("sx");
//        user.setInfo("111");
//        user.setName("caogang");
//        user.setPwd("123");
//        user.setSex("1");
//        boolean isRegister = userDao.register(user);
//        System.out.println(isRegister);

        //内部为对象的list
        Iterator<User> it = userDao.getUserAll().iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }

        boolean isDelete = userDao.delete(3);
        System.out.println(isDelete);

//        boolean isUpdate = userDao.update(4,"name","123456","1","home","updateInfo");
//        System.out.println(isUpdate);

    }
}
