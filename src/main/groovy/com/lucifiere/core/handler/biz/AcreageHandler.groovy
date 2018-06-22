package com.lucifiere.core.handler.biz

import com.lucifiere.core.handler.BaseHouseEstateHandler
import com.lucifiere.entity.bo.BuildingReport
import com.lucifiere.entity.vo.HousingEstate
import com.lucifiere.entity.vo.HousingEstateHandleReq
import com.lucifiere.entity.vo.HousingEstateHandleResp

class AcreageHandler extends BaseHouseEstateHandler {

    @Override
    void doBizLogic(HousingEstateHandleReq req, HousingEstateHandleResp resp) {
        List<HousingEstate> housingEstates = req.getHousingEstates()
        List<BuildingReport> buildingReports = []
        housingEstates.each {
            it.buildings.each {
                List<Float> allKinds = it.households.stream().mapToDouble{it.getAcreage()}.distinct().collect()
                buildingReports << new BuildingReport(){{
                    setAcreage(allKinds)
                    setNo(it.getNo())
                }}
            }
        }
    }

}
