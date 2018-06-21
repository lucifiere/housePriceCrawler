package com.lucifiere.entity

/**
 * 楼盘
 */
class HousingEstate {

    private String name

    private List<Building> buildings

    HousingEstate() {

    }

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
