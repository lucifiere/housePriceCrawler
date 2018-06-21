package entity

/**
 * 楼户
 */
class Household {

    int id

    BigDecimal unitPrice

    BigDecimal totalPrice

    float acreage

    int getId() {
        return id
    }

    void setId(int id) {
        this.id = id
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

    float getAcreage() {
        return acreage
    }

    void setAcreage(float acreage) {
        this.acreage = acreage
    }
}
