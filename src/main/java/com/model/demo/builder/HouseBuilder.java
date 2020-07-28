package com.model.demo.builder;

/**
 * @author Rison_Lee on 2020/7/28 15:15.
 * @version 1.0
 */
public interface HouseBuilder {
    public void makeFloor();
    public void makeHouseTop();
    public void makeWall();
    public House getHouse();

}
