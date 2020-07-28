package com.model.demo.abstractFactory;

/**
 * @author Rison_Lee on 2020/7/27 15:38.
 * @version 1.0
 */
public class NorthFruitFactory implements FruitFactory {
    public Fruit getApple() {
        return new NorthApple();
    }

    public Fruit getBanana() {
        return new NorthBanana();
    }
}
