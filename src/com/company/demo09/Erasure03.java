package com.company.demo09;

import java.util.List;

public class Erasure03<T extends Number> {

    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    /**
     *
     * @param t
     * @param <T>
     * @return
     */
    public <T extends List> T show(T t){
        return t;
    }
}
