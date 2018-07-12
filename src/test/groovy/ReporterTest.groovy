import com.alibaba.fastjson.JSON
import com.lucifiere.bootstrap.Bootstrap
import com.lucifiere.core.job.XianPriceBureauJob
import com.lucifiere.entity.bo.JobResult
import org.junit.Test

class ReporterTest {

    @Test
    void testReporter() {
        Bootstrap b = new Bootstrap(new XianPriceBureauJob())
        JobResult j = b.start()
        System.out.println(JSON.toJSONString(j))
    }

}
