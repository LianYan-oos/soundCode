package com.company.demo08;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestUp {
    public static void main(String[] args) {
        
    }

    @Test
    public void  testFun(){

        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<MiniCat> miniCats = new ArrayList<>();

//        cats.addAll(animals);
        cats.addAll(cats);
        cats.addAll(miniCats);

//        showAnimal(animals);
        showAnimal(cats);
        showAnimal(miniCats);

    }

    /**
     * 泛型上限通配符，传递的集合类型，只能是Cat或Cat的子类
     *  不能去填充元素
     *  要求该泛型类型，只能是实参，或实参类型的子类类型
     * @param list
     */
    public  static void showAnimal(List<? extends Cat> list){
//        list.add(new Animal());
//        list.add(new Cat());
//        list.add(new MiniCat());

        for (int i = 0; i < list.size(); i++) {
            Cat cat = list.get(i);
            System.err.println(cat);
        }
    }
}
