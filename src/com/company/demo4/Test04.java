package com.company.demo4;

import org.junit.Test;

import java.util.List;

public class Test04 {

    @Test
    public void testFun(){
        ChildFirst<String> childFirst = new ChildFirst<>();
        childFirst.setValue("abc");
        String value = childFirst.getValue();
        System.err.println(value);
    }

    @Test
    public void testFun2(){
        ChildSecond childSecond = new ChildSecond();
        childSecond.setValue(10000);
        Integer value = childSecond.getValue();
        System.err.println(value);
    }
}
