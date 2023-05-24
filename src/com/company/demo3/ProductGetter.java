package com.company.demo3;

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
}
