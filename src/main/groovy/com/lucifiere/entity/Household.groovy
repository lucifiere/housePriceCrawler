package com.lucifiere.entity

/**
 * Created by @author XD.Wang
 * 2018-06-11
 * Func:楼户
 */
class Household {

    private Integer id

    private Integer no

    private BigDecimal unitPrice

    private BigDecimal totalPrice

    private Float acreage

    Household() {}

    Household(Integer id, Integer no, BigDecimal unitPrice, BigDecimal totalPrice, Float acreage) {
        this.id = id
        this.no = no
        this.unitPrice = unitPrice
        this.totalPrice = totalPrice
        this.acreage = acreage
    }

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    Integer getNo() {
        return no
    }

    void setNo(Integer no) {
        this.no = no
    }

    BigDecimal getUnitPrice() {
        return unitPrice
    }

    void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice
    }

    BigDecimal getTotalPrice() {
        return totalPrice
    }

    void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice
    }

    Float getAcreage() {
        return acreage
    }

    void setAcreage(Float acreage) {
        this.acreage = acreage
    }
}
