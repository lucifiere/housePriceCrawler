package com.lucifiere.entity.bo

import com.lucifiere.constants.JobResEnum

abstract class JobResult {

    private boolean suc

    private String remark

    private JobResEnum result

    JobResult(){}

    JobResult(boolean suc, String remark, JobResEnum result) {
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

    JobResEnum getResult() {
        return result
    }

    void setResult(JobResEnum result) {
        this.result = result
    }

    static HousingEstateReport suc() {
        return new HousingEstateReport(Boolean.TRUE, "成功生成了报告！", JobResEnum.SUCCESS)
    }

    static HousingEstateReport fail() {
        return new HousingEstateReport(Boolean.FALSE, "报告生成失败！", JobResEnum.BIZ_ERROR)
    }

    static HousingEstateReport err(Throwable e) {
        return new HousingEstateReport(Boolean.FALSE, e.getMessage(), JobResEnum.INTERNAL_ERROR)
    }

}
