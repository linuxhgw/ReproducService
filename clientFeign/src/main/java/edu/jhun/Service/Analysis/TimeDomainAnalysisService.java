package edu.jhun.Service.Analysis;

import edu.jhun.Service.Test.Hystrix;
import edu.jhun.bean.AttributeMessage;
import edu.jhun.bean.TimeDomainIndex;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by hgw on 2019/4/29.
 */
@FeignClient(value = "service-client",fallback = Hystrix.class)
public interface TimeDomainAnalysisService {
    @GetMapping("getTimeDomainAnalysis")
    TimeDomainIndex getTimeDomainAnalysis(@RequestParam("atrr") String atrr);
}
