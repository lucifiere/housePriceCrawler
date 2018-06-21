package com.lucifiere.entity

/**
 * 楼栋
 */
class Building {

    private Integer no

    private List<Household> households

    Building() {

    }

    Building(Integer no, List<Household> households) {
        this.no = no
        this.households = households
    }

    Integer getNo() {
        return no
    }

    void setNo(Integer no) {
        this.no = no
    }

    List<Household> getHouseholds() {
        return households
    }

    void setHouseholds(List<Household> households) {
        this.households = households
    }

}
