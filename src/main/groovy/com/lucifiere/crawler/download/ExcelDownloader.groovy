package com.lucifiere.crawler.download

import com.lucifiere.utils.FileUtil
import groovy.io.FileType
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.poifs.filesystem.POIFSFileSystem
import org.apache.poi.ss.usermodel.Workbook

/**
 * Created by @author XD.Wang
 * 2018-06-11
 * Func:
 */
class ExcelDownloader extends Downloader {

    private List<Workbook> excels = []

    ExcelDownloader(String url) {
        super(url)
    }

    @Override
    boolean build() {
        super.download()
        if (isDataReady()) {
            File baseDir = new File(FileUtil.ZIP_DIR)
            if (baseDir.isDirectory()) {
                baseDir.eachFileMatch(FileType.FILES, ~/.*\.xlsx/) {
                    BufferedInputStream stream = new BufferedInputStream(new FileInputStream(it))
                    POIFSFileSystem fs = new POIFSFileSystem(stream)
                    HSSFWorkbook workbook = new HSSFWorkbook(fs)
                    this.excels << workbook
                }
                return true
            }
        }
        false
    }

    List<Workbook> getExcels() { excels }

}
