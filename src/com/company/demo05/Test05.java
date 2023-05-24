package com.company.demo05;

import org.junit.Test;

public class Test05 {

    @Test
    public void testFun(){
        Apple apple = new Apple();
        String key = apple.getKey();
        System.err.println(key);
    }

    @Test
    public void testFun01(){
        Pair<String,Integer> pair = new Pair<>("count",100);
        String key = pair.getKey();
        Integer value = pair.getValue();

        System.err.println(key+" == "+value);

    }
}
