package com.lucifiere.business.handler

import com.lucifiere.entity.HousingEstateHandleReq
import com.lucifiere.entity.HousingEstateHandleResp

abstract class BaseHouseEstateHandler {

    protected BaseHouseEstateHandler nextHandler

    protected boolean hasNext() { nextHandler != null }

    BaseHouseEstateHandler and(BaseHouseEstateHandler nextHandler) {
        this.nextHandler = nextHandler
        this.nextHandler
    }

    abstract void handle(HousingEstateHandleReq req, HousingEstateHandleResp resp)

}
