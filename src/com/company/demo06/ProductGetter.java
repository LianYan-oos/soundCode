package com.company.demo06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 模拟抽奖器
 * @param <T>
 */
public class ProductGetter<T> {
    /**
     * 产生随机数
     */
    Random random = new Random();

    /**
     * 奖品
     */
    private T product;

    /**
     * 奖品池
     */
    List<T> list = new ArrayList<>();

    /**
     * 添加奖品
     * @param t 泛型类型
     */
    public void addProduct(T t){
        list.add(t);
    }

    /**
     * 获取奖品
     * @return 随机某一个奖品
     */
    public T getProduct(){
        product = list.get(random.nextInt(list.size()));
        return product;
    }

    /**
     * 定义泛型方法
     * @param list 参数
     * @param <T>  泛型标识，具体类型，由调用方法的时候来指定。
     * @return 返回数据
     */
    public <T> T getProduct(List<T> list){
        return list.get(random.nextInt(list.size()));
    }

    /**
     * 静态的泛型方法，采用多个泛型类型
     * @param t
     * @param e
     * @param k
     * @param <T>
     * @param <E>
     * @param <K>
     */
    public static <T,E,K> void  printType(T t,E e,K k){
        System.err.println(t+"\t"+t.getClass().getSimpleName());
        System.err.println(e+"\t"+e.getClass().getSimpleName());
        System.err.println(k+"\t"+k.getClass().getSimpleName());
    }

    /**
     * 泛型可变参数定义
     * @param e
     * @param <E>
     */
    public static <E> void print(E... e){
        for (int i = 0; i < e.length; i++) {
            System.err.println(e[i]);
        }
    }
}
