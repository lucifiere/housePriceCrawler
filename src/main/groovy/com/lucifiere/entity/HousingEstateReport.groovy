package com.lucifiere.entity

import com.lucifiere.constants.ReportResult

/**
 * Created by @author XD.Wang
 * 2018-06-11
 * Func:楼盘报告
 */
class HousingEstateReport {

    private boolean suc

    private String remark

    private ReportResult result

    HousingEstateReport() {}

    HousingEstateReport(boolean suc, String remark, ReportResult result) {
        this.suc = suc
        this.remark = remark
        this.result = result
    }

    boolean getSuc() {
        return suc
    }

    void setSuc(boolean suc) {
        this.suc = suc
    }

    String getRemark() {
        return remark
    }

    void setRemark(String remark) {
        this.remark = remark
    }

    ReportResult getResult() {
        return result
    }

    void setResult(ReportResult result) {
        this.result = result
    }

    static HousingEstateReport suc() {
        return new HousingEstateReport(Boolean.TRUE, "成功生成了报告！", ReportResult.SUCCESS)
    }

    static HousingEstateReport fail() {
        return new HousingEstateReport(Boolean.FALSE, "报告生成失败！", ReportResult.BIZ_ERROR)
    }

    static HousingEstateReport err(Throwable e) {
        return new HousingEstateReport(Boolean.FALSE, e.getMessage(), ReportResult.INTERNAL_ERROR)
    }

}
