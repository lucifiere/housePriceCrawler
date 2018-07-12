package com.lucifiere.core.job

import com.lucifiere.core.handler.BaseHouseEstateHandler
import com.lucifiere.crawler.wrap.HousingEstateWrapper
import com.lucifiere.entity.bo.HousingEstateReport
import com.lucifiere.entity.bo.JobResult
import com.lucifiere.entity.vo.HousingEstateHandleReq
import com.lucifiere.entity.vo.HousingEstateHandleResp

/**
 * Created by @author XD.Wang
 * 2018-03-31
 * Func:报告生成
 */
abstract class Job {

    protected BaseHouseEstateHandler chain

    protected HousingEstateWrapper wrapper

    JobResult doJob() {
        try {
            HousingEstateHandleReq req = new HousingEstateHandleReq(wrapper)
            HousingEstateHandleResp resp = new HousingEstateHandleResp()
            chain.handle(req, resp)
            return buildJobResult(resp)
        } catch (Exception ex) {
            return HousingEstateReport.err(ex)
        }
    }

    abstract JobResult buildJobResult(HousingEstateHandleResp resp)

}
