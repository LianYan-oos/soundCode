package com.company.demo05;

/**
 * 实现泛型接口的类，不是泛型，需要明确实现泛型接口的数据类型
 */
public class Apple implements Generator<String> {

    @Override
    public String getKey() {
        return "hello generator";
    }
}
