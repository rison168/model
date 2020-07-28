package com.model.demo.simpleFactory;

/**
 * @author Rison_Lee on 2020/7/27 10:48.
 * @version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit banana = new Banana();
        apple.get();
        banana.get();

        //实例化一个apple
        Fruit apple1 = new FruitFactory().getApple();
        Fruit banana1 = new FruitFactory().getBanana();
        apple1.get();
        banana1.get();

        Fruit apple2= new FruitFactory().getFruit("apple");
        Fruit banana2 = new FruitFactory().getFruit("banana");
        apple2.get();
        banana2.get();
    }
}
