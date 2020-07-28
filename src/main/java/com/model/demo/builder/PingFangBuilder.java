package com.model.demo.builder;

/**
 * @author Rison_Lee on 2020/7/28 15:17.
 * @version 1.0
 */
public class PingFangBuilder implements HouseBuilder {
    House house = new House();

    public void makeFloor() {
        house.setFloor("平房——地板");
    }

    public void makeHouseTop() {
        house.setHouseTop("平房-屋顶");
    }

    public void makeWall() {
        house.setWall("平房-墙");
    }

    public House getHouse() {
        return house;
    }
}
