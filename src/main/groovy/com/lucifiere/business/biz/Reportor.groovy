package com.lucifiere.business.biz

import com.lucifiere.entity.bo.HousingEstateReport
import com.lucifiere.entity.vo.HousingEstateHandleReq
import com.lucifiere.entity.vo.HousingEstateHandleResp


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
