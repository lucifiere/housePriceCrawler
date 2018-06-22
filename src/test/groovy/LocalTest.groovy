import com.lucifiere.crawler.download.ExcelDownloader
import org.junit.Test
import com.lucifiere.utils.FileUtil

class LocalTest {

    @Test
    void testDownloader() {
        def url = 'com.lucifiere.crawler://wjj.xa.gov.cn/'
        def path = '/attached/file/20180619/20180619180108_900_2875203.zip'
        ExcelDownloader downloader = new ExcelDownloader(url)
        downloader.path(path).download()
        byte[] b = downloader.read()
        FileUtil.unZip(b)
        println("")
    }

    @Test
    void test() {
        def a = [1, 1, 1, 1, 1, 1, 1, 1]
        println(a.stream().reduce { x, y -> x + y }.orElse(0))
    }

}
