package com.model.demo.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Rison_Lee on 2020/7/28 15:46.
 * @version 1.0
 */
@Data
@AllArgsConstructor
public class HouseDirector {
    public void makeHouse(HouseBuilder houseBuilder){
        houseBuilder.makeFloor();
        houseBuilder.makeHouseTop();
        houseBuilder.makeWall();
    }

}
