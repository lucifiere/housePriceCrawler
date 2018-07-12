package com.lucifiere.entity.vo

import com.lucifiere.entity.bo.BuildingReport
import com.lucifiere.entity.bo.HousingEstateReport

class HousingEstateHandleResp {

    private List<BuildingReport> buildingReports

    List<BuildingReport> getBuildingReports() {
        return buildingReports
    }

    void setBuildingReports(List<BuildingReport> buildingReports) {
        this.buildingReports = buildingReports
    }

}
