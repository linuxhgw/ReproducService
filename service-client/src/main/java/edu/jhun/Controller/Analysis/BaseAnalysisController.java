package edu.jhun.Controller.Analysis;

import edu.jhun.Service.Analysis.BaseAnalysisService;
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

    @GetMapping("/getBaseAnalysis")
    BaseIndex getBaseAnalysis(@RequestParam("atrr") String atrr){

        BaseIndex baseAnalysis = baseService.getBaseAnalysis(atrr);
        return baseAnalysis;
    }
}
