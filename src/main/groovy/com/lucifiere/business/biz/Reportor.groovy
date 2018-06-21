package com.lucifiere.business.biz

import com.lucifiere.entity.HousingEstateHandleReq
import com.lucifiere.entity.HousingEstateHandleResp
import com.lucifiere.entity.HousingEstateReport

class Reportor {

    HousingEstateReport doReport() {
        try {
            HousingEstateHandleReq req = new HousingEstateHandleReq()
            HousingEstateHandleResp resp = handle(req)
            return resp.getHouseEstateReport()
        } catch (Exception ex) {
            return HousingEstateReport.err(ex)
        }
    }

    HousingEstateHandleResp handle(HousingEstateHandleReq req) {

    }

}
