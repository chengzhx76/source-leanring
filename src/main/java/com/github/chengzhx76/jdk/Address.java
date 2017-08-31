package com.github.chengzhx76.jdk;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/31
 */
public class Address implements Cloneable {

    String city;
    Integer people;
    long avgAge;

    public Address(String city, Integer people, long avgAge) {
        this.city = city;
        this.people = people;
        this.avgAge = avgAge;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Address{");
        sb.append("city='").append(city).append('\'');
        sb.append(", people=").append(people);
        sb.append(", avgAge=").append(avgAge);
        sb.append('}');
        return sb.toString();
    }
}
