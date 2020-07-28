package com.model.demo.factoryMethod;

/**
 * @author Rison_Lee on 2020/7/27 10:48.
 * @version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new AppleFactory();
        Fruit apple = fruitFactory.getFruit();
        apple.get();

        FruitFactory fruitFactory2 = new BananaFactory();
        Fruit banana = fruitFactory2.getFruit();
        banana.get();
    }
}
