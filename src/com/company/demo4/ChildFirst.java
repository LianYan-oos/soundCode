package com.company.demo4;

/**
 * 泛型类攀升子类，子类也是泛型类型，那么子类的泛型标识要和父类的一致。
 * @param <T>
 */
public class ChildFirst<T> extends Parent<T> {
    @Override
    public T getValue() {
        return super.getValue();
    }
}
