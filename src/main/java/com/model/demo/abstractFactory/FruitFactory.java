package com.model.demo.abstractFactory;

/**
 * @author Rison_Lee on 2020/7/27 14:08.
 * @version 1.0
 */
public interface FruitFactory {
    //实例化Apple
    public Fruit getApple();

    //实例化香蕉
    public Fruit getBanana();

}
