package com.lucifiere.entity.bo

class BuildingReport {

    private BigDecimal totalPrice

    private List<Float> acreage

    BigDecimal getTotalPrice() {
        return totalPrice
    }

    void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice
    }

    List<Float> getAcreage() {
        return acreage
    }

    void setAcreage(List<Float> acreage) {
        this.acreage = acreage
    }
}
