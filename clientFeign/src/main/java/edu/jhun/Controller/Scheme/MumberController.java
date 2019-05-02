package edu.jhun.Controller.Scheme;


import edu.jhun.Service.Scheme.MumberService;
import edu.jhun.bean.Mumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hgw on 2019/4/30.
 */

@RestController
public class MumberController {
    @Autowired
    MumberService mumberService;
    @GetMapping("getMumber")
    List<Mumber> getMumber(@RequestParam("schemeId") int schemeId){
       return mumberService.getMumber(schemeId);
    }
}
