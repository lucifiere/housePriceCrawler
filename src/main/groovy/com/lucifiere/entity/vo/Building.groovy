package com.lucifiere.entity.vo

/**
 * Created by @author XD.Wang
 * 2018-06-11
 * Func:楼栋
 */
class Building {

    /**
     * 楼栋号
     */
    private Integer no

    /**
     * 该楼栋中所有的楼户
     */
    private List<Household> households

    Building() {}

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
