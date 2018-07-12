package com.lucifiere.crawler.wrap

import com.lucifiere.crawler.download.Downloader
import com.lucifiere.crawler.download.ExcelDownloader
import com.lucifiere.entity.vo.HousingEstate
import org.apache.poi.ss.usermodel.Workbook

import java.util.stream.Collectors

/**
 * Created by @author XD.Wang
 * 2018-03-31
 * Func:
 */
abstract class ExcelHousingEstateWrapper implements HousingEstateWrapper {

    protected final static FIRST_ROW_4_SCAN = 3

    protected final static FIRST_SHEET_4_SCAN = 0

    private Downloader downloader

    ExcelHousingEstateWrapper(Downloader downloader) {
        this.downloader = downloader
    }

    protected abstract HousingEstate wrapOne(Workbook workbook)

    @Override
    List<HousingEstate> wrap() {
        if (this.downloader instanceof ExcelDownloader) {
            ExcelDownloader excelDownloader = downloader as ExcelDownloader
            boolean buildSuccess = excelDownloader.build()
            if (buildSuccess) {
                List<Workbook> workbooks = excelDownloader.getExcels()
                return workbooks.parallelStream().map { wrapOne(it) }.collect(Collectors.toList())
            }
        }
        throw new RuntimeException("excel wrapper cant only accept excel downloader!")
    }

}
