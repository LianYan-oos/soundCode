package com.company.demo08;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDown {

    @Test
    public void testFun(){
        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<MiniCat> miniCats = new ArrayList<>();
        showAnimal(animals);
        showAnimal(cats);
//        showAnimal(miniCats);
    }

    /**
     * 类型通配符的下限，要求集合只能Cat或Cat的父类类型
     *
     * 1.可以填充元素 但是不可以填充父类类型
     * 2.但是不保证元素数据类型的约束要求
     * @param list
     */
    public  static void showAnimal(List<? super Cat> list){
//        list.add(new Animal());

//        list.add(new Cat());
//        list.add(new MiniCat());
//        for (Object o : list) {
//            System.err.println(o);
//        }
    }
}
