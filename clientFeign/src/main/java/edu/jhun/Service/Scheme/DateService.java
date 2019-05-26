package edu.jhun.Service.Scheme;

import edu.jhun.Service.Test.Hystrix;
import edu.jhun.bean.OutValue;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
@FeignClient(value = "service-client",fallback = Hystrix.class)
public interface DateService {
    @GetMapping("getSchemeRunTime")
    int[] getSchemeRunTime(@RequestParam("schemeId") int schemeId);
    @GetMapping("getDate")
    List<OutValue> getDate(@RequestParam("atrr") String atrr);

}
