package com.lucifiere.core.handler

final class HandlerChainFactory {

    static BaseHouseEstateHandler chainForPriceBureauHandler() {
        BaseHouseEstateHandler chain = new TotalPriceHandler()
        chain.nextIs(new AcreageHandler())
        chain
    }

}
