package com.lucifiere.core.handler

import com.lucifiere.entity.bo.BuildingReport
import com.lucifiere.entity.vo.*
import org.apache.commons.collections4.CollectionUtils

class TotalPriceHandler extends BaseHouseEstateHandler {

    @Override
    void doBizLogic(HousingEstateHandleReq req, HousingEstateHandleResp resp) {
        List<HousingEstate> housingEstates = req.getHousingEstates()
        List<BuildingReport> buildingReports = new ArrayList<>()

        housingEstates.each {
            it.buildings.each {
                assert CollectionUtils.isNotEmpty(it.households)
                double totalPrice = it.households.parallelStream().mapToDouble { it.totalPrice.doubleValue() }
                        .average().orElseThrow()
                buildingReports << new BuildingReport(){{setTotalPrice(new BigDecimal(totalPrice))}}
            }
        }
    }
}
