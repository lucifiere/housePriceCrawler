package com.lucifiere.entity.vo

import com.lucifiere.crawler.wrap.HousingEstateWrapper

class HousingEstateHandleReq {

    private List<HousingEstate> housingEstates

    HousingEstateHandleReq() {}

    HousingEstateHandleReq(HousingEstateWrapper wrapper) {
    }

    List<HousingEstate> getHousingEstates() {
        return housingEstates
    }

    void setHousingEstates(List<HousingEstate> housingEstates) {
        this.housingEstates = housingEstates
    }

}
