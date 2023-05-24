package com.company.demo09;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test09 {

    @Test
    public void testFun(){
        List<Integer> intList = new ArrayList<>();
        List<String> strList = new ArrayList<>();

        System.err.println(intList.getClass().getSimpleName());
        System.err.println(strList.getClass().getSimpleName());

        System.err.println(intList.getClass() == strList.getClass());
    }

    /**
     * 无限制类型擦除 针对类
     */
    @Test
    public void test02(){
        Erasure<Integer> erasure = new Erasure<>();
        //通过反射,获取Erasure类的字节码文件
        Class<? extends Erasure> aClass = erasure.getClass();
        //获取所有的成员变量
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            //打印成员变量的名称和类型
            System.err.println(declaredField.getName() +":"+ declaredField.getType().getSimpleName());
        }
    }

    /**
     * 有限制类型擦除 针对类
     */
    @Test
    public void test03(){
        Erasure02<Integer> erasure = new Erasure02<>();
        //通过反射,获取Erasure类的字节码文件
        Class<? extends Erasure02> aClass = erasure.getClass();
        //获取所有的成员变量
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            //打印成员变量的名称和类型
            System.err.println(declaredField.getName() +":"+ declaredField.getType().getSimpleName());
        }
    }

    /**
     * 擦除方法中类型定义的参数
     */
    @Test
    public void test04(){
        Erasure03<Integer> erasure = new Erasure03<>();
        //通过反射,获取Erasure类的字节码文件
        Class<? extends Erasure03> aClass = erasure.getClass();
        //获取所有的方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            //打印方法名 和返回值类型
            System.err.println(declaredMethod.getName() +":"+declaredMethod.getReturnType().getSimpleName());
        }

    }

    /**
     * 桥接方法 保持接口和类的实现关系
     */
    @Test
    public void test05(){
        //通过反射,获取Erasure类的字节码文件
        Class<InfoImpl> infoClass = InfoImpl.class;
        //获取所有方法
        Method[] infoImpl = infoClass.getDeclaredMethods();
        for (Method declaredMethod : infoImpl) {
            //打印方法名 和返回值类型
            System.err.println(declaredMethod.getName()+":"+declaredMethod.getReturnType().getSimpleName());
        }
    }
}
