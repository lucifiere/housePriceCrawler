package com.lucifiere.entity.vo

/**
 * Created by @author XD.Wang
 * 2018-03-31
 * Func:楼户
 */
class Household {

    /**
     * 楼户房号
     */
    private Integer id

    /**
     * 楼户序号
     */
    private Integer no

    /**
     * 此户的单价
     */
    private BigDecimal unitPrice

    /**
     * 此户的总价
     */
    private BigDecimal totalPrice

    /**
     * 此户的面积
     */
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
