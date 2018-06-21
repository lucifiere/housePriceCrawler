package com.lucifiere.core.report

import com.lucifiere.core.handler.HandlerChainFactory
import com.lucifiere.entity.bo.HousingEstateReport
import com.lucifiere.entity.vo.HousingEstateHandleResp

class XianPriceBureauReportor extends Reporter {

    XianPriceBureauReportor() {
        firstHandler = HandlerChainFactory.chainForPriceBureauHandler()
    }

    HousingEstateReport generate(HousingEstateHandleResp resp) {
        new HousingEstateReport()
    }

}
