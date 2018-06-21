package com.lucifiere.crawler.wrap

import com.lucifiere.crawler.download.Downloader
import com.lucifiere.entity.HousingEstate

interface HousingEstateWrapper {

    HousingEstate wrap(Downloader downloader)

}
