package edu.jhun.Controller.Analysis;

import com.alibaba.fastjson.JSON;
import edu.jhun.api.Analysis.BaseAnalysisService;
import edu.jhun.bean.AttributeMessage;
import edu.jhun.bean.BaseIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hgw on 2019/4/30.
 */
@RestController
public class BaseAnalysisController {
    @Autowired
    BaseAnalysisService baseService;
    @GetMapping("getBaseAnalysis")
    BaseIndex getBaseAnalysis(@RequestParam("atrr") String atrr){
        AttributeMessage parse= JSON.parseObject(atrr,AttributeMessage.class);
        return baseService.getBaseAnalysis(parse);
    }
}
