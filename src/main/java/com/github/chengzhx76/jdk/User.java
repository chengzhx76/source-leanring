package com.github.chengzhx76.jdk;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/31
 */
public class User implements Cloneable {
    String name;
    int age;

    Address address;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.address = (Address) address.clone();
        return user;
    }
}
