package com.model.demo.simpleFactory;

/**
 * @author Rison_Lee on 2020/7/27 14:08.
 * @version 1.0
 */
public class FruitFactory {
    /**
     * 获取apple类的实例
     */
    public Fruit getApple(){
        return new Apple();
    }

    /**
     * 获取Banana类的实例
     */
    public Fruit getBanana(){
        return new Banana();
    }

    public Fruit getFruit(String type){
        if (type.equals("apple")){
            return new Apple();
        }else if (type.equals("banana")){
            return new Banana();
        }else{
            System.out.println("找不到相应的实例化类");
            return null;
        }
    }

}
