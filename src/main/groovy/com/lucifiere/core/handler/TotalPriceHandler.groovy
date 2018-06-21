package com.lucifiere.core.handler

import com.lucifiere.entity.bo.BuildingReport
import com.lucifiere.entity.vo.*

class TotalPriceHandler extends BaseHouseEstateHandler {

    @Override
    void doBizLogic(HousingEstateHandleReq req, HousingEstateHandleResp resp) {
        List<HousingEstate> housingEstates = req.getHousingEstates()
        List<BuildingReport> buildingReports = new ArrayList<>()

        //遍历楼盘
        for (List<Building> buildingList : housingEstates) {
            BuildingReport buildingReport = new BuildingReport()
            //遍历楼栋
            for (List<Household> householdList : buildingList) {
                BigDecimal numPrice
                List<Float> acreageList = new ArrayList()

                for (Household household : householdList) {
                    numPrice += household.getTotalPrice()
                    acreageList.add(household.getAcreage())
                }
                buildingReport.setAcreage()
                buildingReport.setTotalPrice(numPrice / householdList.size())
            }
            buildingReports.add(buildingReport)
        }
        resp.setBuildingReports(buildingReports)
    }
}
