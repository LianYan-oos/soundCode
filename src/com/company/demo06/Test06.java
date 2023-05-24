package com.company.demo06;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test06 {

    @Test
    public void testFun(){
        ProductGetter<Integer> productGetter = new ProductGetter<>();

        int[] intProducts = {10000,5000,3000,500,30000};
        for (int intProduct : intProducts) {
            productGetter.addProduct(intProduct);
        }
        //泛型类的成员方法调用
        Integer product2 = productGetter.getProduct();
        System.err.println(product2+"\t"+product2.getClass().getSimpleName());

        System.err.println("==================>> 区分 <<==================");

        List<String> strList = new ArrayList<>();
        strList.add("笔记本电脑");
        strList.add("苹果手机");
        strList.add("扫地机器人");
        //泛型方法的调用，类型是通过调用方法的时候来指定的。
        String product = productGetter.getProduct(strList);
        System.err.println(product+"\t"+product.getClass().getSimpleName());

        System.err.println("==================>> 区分 <<==================");

        List<Integer> intList = new ArrayList<>();

        intList.add(1000);
        intList.add(5000);
        intList.add(3000);
        Integer product1 = productGetter.getProduct(intList);
        System.err.println(product1+"\t"+product1.getClass().getSimpleName());

        System.err.println("==================>> 区分 <<==================");

        //调用多个泛型类型的静态泛型方法
        ProductGetter.printType(100,"JAVA",true);

        System.err.println("==================>> 区分 <<==================");

        //调用泛型可变参数的静态泛型方法
        ProductGetter.print(1,2,3,4);

        System.err.println("==================>> 区分 <<==================");

        ProductGetter.print("A","B","C","D");

    }

}
