package com.company.demo2;

import com.company.demo2.Generic;
import org.junit.Test;

public class Main {

    @Test
    public void testFun() {
        //泛型类在创建对象的时候 来指定操作的具体数据类型
        Generic<String> strGeneric = new Generic<>("abc");
        String key = strGeneric.getKey();
        System.err.println("获取出来的key：="+key);

        System.err.println("==================>> 区分 <<==================");

        Generic<Integer> intGeneric = new Generic<>(100);
        Integer key1 = intGeneric.getKey();
        System.err.println("获取出来的key1：= "+key1);

        System.err.println("==================>> 区分 <<==================");

        //泛型类在创建对象的时候，没有指定类型，将按照Object 类型来操作
        Generic objGeneric = new Generic("11111");
        Object key2 = objGeneric.getKey();
        System.err.println("获取出来的key2：="+key2);

        //泛型类，不支持基本数据类型
//        Generic<int> generic = new Generic<int>(100);

        System.err.println("==================>> 区分 <<==================");

        //同一泛型类，根据不同的类型创建的对象，本质上是同一类型
        System.err.println(strGeneric.getClass());
        System.err.println(intGeneric.getClass());
        System.err.println(strGeneric.getClass() == intGeneric.getClass());

    }
}
