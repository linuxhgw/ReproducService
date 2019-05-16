package edu.jhun.Controller.Scheme;

import com.alibaba.fastjson.JSON;


import edu.jhun.Dao.StepValueDao;
import edu.jhun.Service.Scheme.DateService;
import edu.jhun.bean.AttributeMessage;
import edu.jhun.bean.OutValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hgw on 2019/4/30.
 */
@RestController
public class DateController {

    @Autowired
    DateService dateService;
    @Autowired
    StepValueDao stepValueDao;


    @GetMapping("getSchemeRunTime")
    int[] getSchemeRunTime(@RequestParam("schemeId") int schemeId){
       return dateService.getSchemeRunTime(schemeId);
    }

    @GetMapping(value = "getDate",produces = "application/json; utf-8")
    List<OutValue> getDate(@RequestParam("atrr") String  atrr ){

        return   stepValueDao.getvalue(atrr);
    }
}
