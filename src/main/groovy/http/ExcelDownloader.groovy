package http

import org.apache.poi.hssf.usermodel.HSSFCell
import org.apache.poi.hssf.usermodel.HSSFRow
import org.apache.poi.hssf.usermodel.HSSFSheet
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.poifs.filesystem.POIFSFileSystem
import org.apache.poi.ss.usermodel.Workbook

class ExcelDownloader extends Downloader {

    ExcelDownloader(String url) {
        super(url)
    }

    Workbook buildExcel(File file) {
        BufferedInputStream stream = new BufferedInputStream(new FileInputStream(file))
        POIFSFileSystem fs = new POIFSFileSystem(stream)
        HSSFWorkbook workbook = new HSSFWorkbook(fs)
    }

}
