package com.github.chengzhx76.jdk;

import java.util.Arrays;
import java.util.List;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/31
 */
public class Test {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("test");
        Object[] strList=stringList.toArray();
        System.out.println(strList.getClass());
    }
}
