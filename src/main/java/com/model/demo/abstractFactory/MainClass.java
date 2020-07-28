package com.model.demo.abstractFactory;

/**
 * @author Rison_Lee on 2020/7/27 10:48.
 * @version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new NorthFruitFactory();
        Fruit apple = fruitFactory.getApple();
        apple.get();

        Fruit banana = fruitFactory.getBanana();
        banana.get();

        FruitFactory fruitFactory2 = new SouthFruitFactory();
        Fruit apple2 = fruitFactory2.getApple();
        apple2.get();

        Fruit banana2 = fruitFactory2.getBanana();
        banana2.get();



    }
}
