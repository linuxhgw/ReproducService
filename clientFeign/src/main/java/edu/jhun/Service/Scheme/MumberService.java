package edu.jhun.Service.Scheme;

import edu.jhun.Service.Test.Hystrix;
import edu.jhun.bean.Mumber;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
@FeignClient(value = "service-client",fallback = Hystrix.class)
public interface MumberService {
    @GetMapping("getMumber")
    List<Mumber> getMumber(@RequestParam("schemeId") int schemeId);
}
