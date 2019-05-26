package edu.jhun.Service.Test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by hgw on 2019/3/25.
 */


@FeignClient(value = "service-client",fallback = Hystrix.class)
public interface TestService {

    @RequestMapping(method = RequestMethod.GET, value = "/message")
    String add(@RequestParam(value = "message") String message);

    @GetMapping("/add")
    int jiafa(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b);
}
