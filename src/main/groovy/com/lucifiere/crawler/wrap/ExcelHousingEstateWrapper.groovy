package com.lucifiere.crawler.wrap

import com.lucifiere.crawler.download.Downloader
import com.lucifiere.crawler.download.ExcelDownloader
import com.lucifiere.entity.Building
import com.lucifiere.entity.Household
import com.lucifiere.entity.HousingEstate
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook

class ExcelHousingEstateWrapper implements HousingEstateWrapper {

    private final static FIRST_ROW_4_SCAN = 3

    private final static FIRST_SHEET_4_SCAN = 0

    HousingEstate wrap(Downloader downloader) {
        if (downloader instanceof ExcelDownloader) {
            ExcelDownloader excelDownloader = downloader as ExcelDownloader
            Workbook workbook = excelDownloader.buildExcel()
            List<Building> buildings = []
            for (int numSheet = FIRST_SHEET_4_SCAN; numSheet < workbook.getNumberOfSheets(); numSheet++) {
                Sheet sheet = workbook.getSheetAt(numSheet)
                if (sheet == null) {
                    continue
                }

                List<Household> households = []
                for (int rowNum = FIRST_ROW_4_SCAN; rowNum <= sheet.getLastRowNum(); rowNum++) {
                    Row row = sheet.getRow(rowNum)
                    if (row == null) {
                        continue
                    }
                    households << new Household(
                            row.getCell(0).getNumericCellValue().intValue(),
                            row.getCell(1).getNumericCellValue().intValue(),
                            new BigDecimal(row.getCell(2).getNumericCellValue()),
                            new BigDecimal(row.getCell(3).getNumericCellValue()),
                            row.getCell(4).getNumericCellValue().floatValue()
                    )
                }
                buildings << new Building(0, households)
            }
            return new HousingEstate("XX", buildings)
        }
        throw new RuntimeException("excel wrapper cant only accept excel downloader!")
    }

}
