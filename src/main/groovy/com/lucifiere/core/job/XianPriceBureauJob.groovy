package com.lucifiere.core.job

import com.lucifiere.core.handler.HandlerChainFactory
import com.lucifiere.crawler.wrap.XianPriceBureauWrapper
import com.lucifiere.entity.bo.HousingEstateReport
import com.lucifiere.entity.bo.JobResult
import com.lucifiere.entity.vo.HousingEstateHandleResp

class XianPriceBureauJob extends Job {

    XianPriceBureauJob() {
        chain = HandlerChainFactory.chainForPriceBureauHandler()
        wrapper = new XianPriceBureauWrapper()
    }

    JobResult buildJobResult(HousingEstateHandleResp resp) {
        new HousingEstateReport()
    }

}
