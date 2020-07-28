package com.model.demo.factoryMethod;

/**
 * @author Rison_Lee on 2020/7/27 14:50.
 * @version 1.0
 */
public class BananaFactory implements FruitFactory{
    public Fruit getFruit() {
        return new Banana();
    }
}
