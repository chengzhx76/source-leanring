package com.github.chengzhx76.jdk;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/31
 */
public class StringClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("zhangsamn", 10);
        user.address = new Address("sd", 200, 36);
        User userClone = (User) user.clone();
        user.name = "lisi";
//        user.age = 12;
        user.address.avgAge = 28;
        user.address.people = 260;

        System.out.println("User=> "+user);
        System.out.println("userClone==> "+userClone);
    }

}
