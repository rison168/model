package com.model.demo.factoryMethod;

/**
 * @author Rison_Lee on 2020/7/27 14:50.
 * @version 1.0
 */
public class AppleFactory implements FruitFactory{
    public Fruit getFruit() {
        return new Apple();
    }
}
