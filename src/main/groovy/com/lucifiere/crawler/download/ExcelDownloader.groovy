package com.lucifiere.crawler.download

import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.poifs.filesystem.POIFSFileSystem
import org.apache.poi.ss.usermodel.Workbook

class ExcelDownloader extends Downloader {

    private Workbook excel

    ExcelDownloader(String url) {
        super(url)
    }

    Workbook buildExcel(File file) {
        BufferedInputStream stream = new BufferedInputStream(new FileInputStream(file))
        POIFSFileSystem fs = new POIFSFileSystem(stream)
        HSSFWorkbook workbook = new HSSFWorkbook(fs)
        this.excel = workbook
        workbook
    }

}
