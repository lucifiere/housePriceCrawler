package com.lucifiere.entity.bo

import com.lucifiere.constants.JobResEnum

/**
 * Created by @author XD.Wang
 * 2018-03-31
 * Func:楼盘报告
 */
class HousingEstateReport extends JobResult {

    private List<BuildingReport> buildingReports

    HousingEstateReport() {
        super()
    }

    HousingEstateReport(boolean suc, String remark, JobResEnum result) {
        super(suc, remark, result)
    }

    List<BuildingReport> getBuildingReports() {
        return buildingReports
    }

    void setBuildingReports(List<BuildingReport> buildingReports) {
        this.buildingReports = buildingReports
    }

}
