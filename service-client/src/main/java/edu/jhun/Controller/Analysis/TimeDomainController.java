package edu.jhun.Controller.Analysis;

import com.alibaba.fastjson.JSON;
import edu.jhun.Service.Analysis.TimeDomainAnalysisService;
import edu.jhun.bean.AttributeMessage;
import edu.jhun.bean.TimeDomainIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hgw on 2019/4/30.
 */
@RestController
public class TimeDomainController {

    @Autowired
    TimeDomainAnalysisService timeDomainAnalysisService;


    @GetMapping("getTimeDomainAnalysis")
    TimeDomainIndex getTimeDomainAnalysis(@RequestParam("atrr") String atrr){
        AttributeMessage parse= JSON.parseObject(atrr,AttributeMessage.class);
        return timeDomainAnalysisService.getTimeDomainAnalysis(parse);
    }
}
