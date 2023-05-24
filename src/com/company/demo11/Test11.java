package com.company.demo11;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.List;

/**
 * 泛型和反射
 */
public class Test11 {

    @Test
    public void testFun() throws Exception {
//        Class<Person> personClass = Person.class;
//        Constructor<Person> constructor = personClass.getConstructor();
//        Person person = constructor.newInstance();

        Class<Person> personClass = Person.class;
        Constructor constructor = personClass.getConstructor();
        Object o = constructor.newInstance();

        Class<? extends Person> aClass = new Person().getClass();

    }   

}
