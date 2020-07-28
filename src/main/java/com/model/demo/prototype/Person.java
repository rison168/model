package com.model.demo.prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rison_Lee on 2020/7/28 14:14.
 * @version 1.0
 */
@Data
public class Person  implements Cloneable{
    private String name;
    private int age;
    private String sex;
    private List<String> friends;

//    @Override
//    public Person clone(){
//        try {
//            return (Person) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    /**
     * 浅度克隆 引入类型同一份值无法修改
     * @return
     */
    @Override
    public Person clone(){
        try {
            Person person = (Person) super.clone();
            List<String> friends = new ArrayList<String>();
            for (String friend : this.getFriends()){
                friends.add(friend);
            }
            person.setFriends(friends);
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
