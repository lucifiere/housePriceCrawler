package com.lucifiere.core.report

import com.lucifiere.core.handler.BaseHouseEstateHandler
import com.lucifiere.entity.vo.HousingEstateHandleReq
import com.lucifiere.entity.vo.HousingEstateHandleResp
import com.lucifiere.entity.bo.HousingEstateReport

abstract class Reporter {

    protected BaseHouseEstateHandler firstHandler

    protected HousingEstateReport doReport() {
        try {
            HousingEstateHandleReq req = new HousingEstateHandleReq()
            HousingEstateHandleResp resp = new HousingEstateHandleResp()
            firstHandler.handle(req, resp)
            return generate(resp)
        } catch (Exception ex) {
            return HousingEstateReport.err(ex)
        }
    }

    abstract HousingEstateReport generate(HousingEstateHandleResp resp)

}
