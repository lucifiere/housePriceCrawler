package com.lucifiere.core.handler

import com.lucifiere.entity.vo.HousingEstate
import com.lucifiere.entity.vo.HousingEstateHandleReq
import com.lucifiere.entity.vo.HousingEstateHandleResp

class AcreageHandler extends BaseHouseEstateHandler {

    @Override
    void doBizLogic(HousingEstateHandleReq req, HousingEstateHandleResp resp) {
        List<HousingEstate> housingEstates = req.getHousingEstates()
    }

}
