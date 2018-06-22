package com.lucifiere.core.handler

import com.lucifiere.core.handler.biz.AcreageHandler
import com.lucifiere.core.handler.biz.TotalPriceHandler

final class HandlerChainFactory {

    static BaseHouseEstateHandler chainForPriceBureauHandler() {
        BaseHouseEstateHandler chain = new TotalPriceHandler()
        chain.nextIs(new AcreageHandler())
        chain
    }

}
