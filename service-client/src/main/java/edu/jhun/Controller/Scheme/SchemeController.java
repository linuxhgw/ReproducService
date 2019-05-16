package edu.jhun.Controller.Scheme;

import edu.jhun.Service.Scheme.SchemeService;
import edu.jhun.bean.Scheme;
import edu.jhun.bean.SchemeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hgw on 2019/4/30.
 */
@RestController
public class SchemeController {
    @Autowired
    SchemeService schemeService;


    @GetMapping(value = "/getSchemeList")
    public List<Scheme> getSchemeList(){
        return schemeService.getSchemeList();
    }

    @GetMapping("/getSchemeMessage")
    public SchemeMessage getSchemeMessage(@RequestParam("schemeId") int schemeId){
        return schemeService.getSchemeMessage(schemeId);
    }
}
