package com.lucifiere.core.handler

import com.lucifiere.entity.vo.HousingEstateHandleReq
import com.lucifiere.entity.vo.HousingEstateHandleResp

abstract class BaseHouseEstateHandler {

    protected BaseHouseEstateHandler nextHandler

    protected boolean hasNext() { nextHandler != null }

    BaseHouseEstateHandler nextIs(BaseHouseEstateHandler nextHandler) {
        this.nextHandler = nextHandler
        this.nextHandler
    }

    void handle(HousingEstateHandleReq req, HousingEstateHandleResp resp) {
        doBizLogic(req, resp)
        if (hasNext()) {
            nextHandler.handle(req, resp)
        }
    }

    abstract void doBizLogic(HousingEstateHandleReq req, HousingEstateHandleResp resp)

}
