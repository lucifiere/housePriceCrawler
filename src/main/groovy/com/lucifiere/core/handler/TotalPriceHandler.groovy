package com.lucifiere.core.handler

import com.lucifiere.entity.bo.BuildingReport
import com.lucifiere.entity.vo.*

class TotalPriceHandler extends BaseHouseEstateHandler {

    @Override
    void doBizLogic(HousingEstateHandleReq req, HousingEstateHandleResp resp) {
        List<HousingEstate> housingEstates = req.getHousingEstates()
        List<BuildingReport> buildingReports = new ArrayList<>()

        //遍历楼盘
        for (HousingEstate housingEstate : housingEstates) {
            BuildingReport buildingReport = new BuildingReport()
            //遍历楼栋
            for (Building building : housingEstate.getBuildings()) {
                BigDecimal numPrice
                List<Float> acreageList = new ArrayList()

                for (Household household : building.getHouseholds()) {
                    numPrice += household.getTotalPrice()
                    acreageList.add(household.getAcreage())
                }
                buildingReport.setAcreage()
                buildingReport.setTotalPrice(numPrice / building.getHouseholds().size())
            }
            buildingReports.add(buildingReport)
        }
        resp.setBuildingReports(buildingReports)
    }
}
