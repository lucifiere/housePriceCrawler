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

    private Boolean isZip = true

    Boolean isZip() {
        return isZip
    }

    void setZip(Boolean isZip) {
        this.isZip = isZip
    }

    ExcelDownloader(String url) {
        super(url)
    }

    @Override
    boolean build() {
        super.download()
        if (isDataReady()) {
            File file = FileUtil.createFile(super.data, FileUtil.TMP_ZIP)
            if (isZip()) {
                FileUtil.unZip(file)
                file = new File(FileUtil.WORKSPACE)
            }
            if (file.isDirectory()) {
                file.eachFileMatch(FileType.FILES, ~/.*\.xlsx/) {
                    this.excels << buildWorkbook(it)
                }
            } else {
                this.excels << buildWorkbook(file)
            }
            return true
        }
        false
    }

    private static HSSFWorkbook buildWorkbook(File file) {
        BufferedInputStream stream = new BufferedInputStream(new FileInputStream(file))
        POIFSFileSystem fs = new POIFSFileSystem(stream)
        new HSSFWorkbook(fs)
    }

    List<Workbook> getExcels() { excels }

}
