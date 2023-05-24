package com.company.demo07;

import org.junit.Test;

public class Test07 {

    @Test
    public void testFun(){
        Box<Number> box1 = new Box<>();
        box1.setFirst(100);
        showBox(box1);

        System.err.println("==================>> 区分 <<==================");

        Box<Integer> box2 = new Box<>();
        box2.setFirst(100);
        showBox(box2);
    }

    /**
     * 类型通配符一般是使用 ？ 代替具体类型的参数
     *
     * 所以类型通配符是类型实参，而不是类型形参
     * @param box
     */
    public static void showBox(Box<?> box){
        Object first = box.getFirst();
        System.err.println(first);
    }

//    public static void showBox(Box<Number> box){
//        Number first = box.getFirst();
//        System.err.println(first);
//    }

//    public static void showBox(Box<Integer> box){
//        Number first = box.getFirst();
//        System.err.println(first);
//    }
}
