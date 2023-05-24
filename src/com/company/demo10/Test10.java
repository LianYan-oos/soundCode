package com.company.demo10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 泛型数组的创建
 */
public class Test10 {

    /**
     * 可以声明带泛型的数组引用,但是不能直接创建带泛型的数组对象
     */
    @Test
    public void testFun(){
        //可以声明带泛型的数组引用,但是不能直接创建带泛型的数组对象
//        ArrayList<String>[] listArry = new ArrayList<String>[5];

        //有弊端 数据不安全
//        ArrayList[] lists = new ArrayList[5];
//        ArrayList<String>[] listArry = lists;
//
//        ArrayList<Integer> intList = new ArrayList<>();
//        intList.add(100);
//
//        lists[0]=intList;
//        String s = listArry[0].get(0);
//        System.err.println(s);

        //解决弊端

        ArrayList<String>[] listArry = new ArrayList[5];

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("abc");

        listArry[0] = strList;
//        listArry[0] = intList;
//        lists[0]=intList;
        String s = listArry[0].get(0);
        System.err.println(s);


    }

    /**
     * 可以通过java.lang.reflect.Array的newInstance(Class<T>,int) 创建T[]数组
     */
    @Test
    public void test02(){
        Fruit<String> fruit = new Fruit<>(String.class,3);
        fruit.put(0,"苹果");
        fruit.put(1,"西瓜");
        fruit.put(2,"香蕉");

        System.err.println(Arrays.toString(fruit.getArray()));

        String s = fruit.get(2);
        System.err.println(s);
    }
}
