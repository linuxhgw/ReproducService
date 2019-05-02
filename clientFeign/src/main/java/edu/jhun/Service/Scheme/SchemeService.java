package edu.jhun.Service.Scheme;

import edu.jhun.bean.Scheme;
import edu.jhun.bean.SchemeMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
@FeignClient("service-client")
public interface SchemeService {
    @ResponseBody
    @GetMapping(value = "/getSchemeList")
    List<Scheme> getSchemeList();
    @GetMapping("getSchemeMessage")
    SchemeMessage getSchemeMessage(@RequestParam("schemeId")int schemeId);
}