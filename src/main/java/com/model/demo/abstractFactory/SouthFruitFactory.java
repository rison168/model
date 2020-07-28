package com.model.demo.abstractFactory;

/**
 * @author Rison_Lee on 2020/7/27 15:39.
 * @version 1.0
 */
public class SouthFruitFactory implements FruitFactory{

    public Fruit getApple() {
        return new SouthApple();
    }

    public Fruit getBanana() {
        return new SouthBanana();
    }
}
