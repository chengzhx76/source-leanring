package com.github.chengzhx76.jdk;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/30
 */
public class ArrayListClone {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        User user1 = new User("Tome", 18);
        User user2 = new User("Jack", 22);
        users.add(user1);
        users.add(user2);

        List<User> users2 = (List<User>) users.clone();

        User user3 = users2.get(0);
        user3.age = 99;

        System.out.println(users);
        System.out.println(users2);
    }
}

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}