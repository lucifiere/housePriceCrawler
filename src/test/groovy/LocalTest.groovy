import http.ExcelDownloader
import org.junit.Test
import utils.ZipUtil

class LocalTest {

    @Test
    void testDownloader() {
        def url = 'http://wjj.xa.gov.cn/'
        def path = '/attached/file/20180619/20180619180108_900_2875203.zip'
        ExcelDownloader downloader = new ExcelDownloader(url)
        downloader.path(path).download()
        byte[] b = downloader.read()
        ZipUtil.unZip(b)
        println("")
    }

}
