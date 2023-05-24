package com.company.demo10;

import java.lang.reflect.Array;

public class Fruit<T> {
    //不会通过
//    private T[] array = new T[3];

    private T[] array;

    public Fruit(Class<T> clz, int length){
        //通过Array.newInstance创建泛型数组
        array = (T[]) Array.newInstance(clz,length);
    }

    /**
     * 填充数组
     * @param index
     * @param item
     */
    public  void  put(int index,T item){
        array[index] = item;
    }

    /**
     * 获取数组元素
     * @param index
     * @return
     */
    public T get(int index){
        return array[index];
    }

    /**
     * 获取所有元素
     * @return
     */
    public T[] getArray(){
        return array;
    }
}
