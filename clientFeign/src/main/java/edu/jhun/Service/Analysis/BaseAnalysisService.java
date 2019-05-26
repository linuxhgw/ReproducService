package edu.jhun.Service.Analysis;

import edu.jhun.Service.Test.Hystrix;
import edu.jhun.bean.BaseIndex;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by hgw on 2019/4/29.
 */
@FeignClient(value = "service-client",fallback = Hystrix.class)
public interface BaseAnalysisService {
     @GetMapping("getBaseAnalysis")
       BaseIndex getBaseAnalysis(@RequestParam("atrr") String atrr);
}
