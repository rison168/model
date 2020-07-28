package com.model.demo.builder;

/**
 * @author Rison_Lee on 2020/7/28 15:01.
 * @version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
//        House house = new House();
//        house.setFloor("地板");
//        house.setHouseTop("屋顶");
//        house.setWall("墙");
//        //工程队来修
//        PingFangBuilder houseBuilder = new PingFangBuilder();
//        //调用工程队
//        houseBuilder.makeFloor();
//        houseBuilder.makeHouseTop();
//        houseBuilder.makeWall();
//        House house = houseBuilder.getHouse();
//        System.out.println(house);
        //工程队
        PingFangBuilder pingFangBuilder = new PingFangBuilder();
        //设计者
        HouseDirector houseDirector = new HouseDirector();
        houseDirector.makeHouse(pingFangBuilder);

        House house = pingFangBuilder.getHouse();
        System.out.println(house);
    }
}
