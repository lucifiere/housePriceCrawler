package com.lucifiere.entity.vo

/**
 * Created by @author XD.Wang
 * 2018-03-31
 * Func:楼盘信息
 */
class HousingEstate {

    /**
     * 楼盘名称
     */
    private String name

    /**
     * 该楼盘下所有的楼栋
     */
    private List<Building> buildings

    HousingEstate() {}

    HousingEstate(String name, List<Building> buildings) {
        this.name = name
        this.buildings = buildings
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    List<Building> getBuildings() {
        return buildings
    }

    void setBuildings(List<Building> buildings) {
        this.buildings = buildings
    }

}
