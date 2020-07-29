package com.model.demo.singleton;

/**
 * @author Rison_Lee on 2020/7/29 8:55.
 * @version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        Person person = Person.getPerson();
        person.setName("li");
        Person person2 =  Person.getPerson();
        person2.setName("wang");
        System.out.println(person);
        System.out.println(person2);
    }
}
