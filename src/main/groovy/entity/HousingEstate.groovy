package entity

/**
 * 楼盘
 */
class HousingEstate {

    private String name

    private Integer no

    private List<Household> households

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
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
