package com.lucifiere.core.report

import com.lucifiere.core.handler.HandlerChainFactory
import com.lucifiere.entity.bo.HousingEstateReport
import com.lucifiere.entity.vo.HousingEstateHandleResp

class XianPriceBureauReporter extends Reporter {

    XianPriceBureauReporter() {
        firstHandler = HandlerChainFactory.chainForPriceBureauHandler()
    }

    HousingEstateReport generate(HousingEstateHandleResp resp) {
        new HousingEstateReport()
    }

}
