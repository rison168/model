package com.model.demo.singleton;

import lombok.Data;

/**
 * @author Rison_Lee on 2020/7/29 8:47.
 * @version 1.0
 */
@Data
public class Person {
    private static Person person;
    private String name;

    public static Person getPerson(){
        if (person == null){
            synchronized (Person.class){
                if (person == null){
                    person = new Person();
                }
            }
        }
        return person;
    }

}
