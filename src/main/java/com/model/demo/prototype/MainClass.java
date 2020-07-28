package com.model.demo.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rison_Lee on 2020/7/28 14:23.
 * @version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(10);
        person1.setName("李峰");
        person1.setSex("男");
//
//        Person person2 = new Person();
//        person2.setAge(10);
//        person2.setName("李一");
//        person2.setSex("男");

//        Person person2 = person1.clone();
//        person1.setName("汪峰");
//        System.out.println(person2.getName());

        Person person3 = new Person();
        List<String> friends = new ArrayList<String>();
        friends.add("James");
        friends.add("YaoMing");
        person3.setFriends(friends);
        Person person4 = person3.clone();

        System.out.println(person3.getFriends());
        System.out.println(person4.getFriends());

        friends.add("Nike");
        person3.setFriends(friends);

        System.out.println(person3.getFriends());
        System.out.println(person4.getFriends());



    }
}
