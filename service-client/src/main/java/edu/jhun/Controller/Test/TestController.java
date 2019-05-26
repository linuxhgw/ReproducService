package edu.jhun.Controller.Test;

//import edu.jhun.Service.TestService;

import edu.jhun.Service.Test.add;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * Created by hgw on 2019/3/24.
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @Resource
    add add;

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message) {
        return String.format("Hi，your message is : %s i am from port : %s", message, port);
}

    @GetMapping(value = "/add")
    public int add(@RequestParam(value = "a") int a,@RequestParam(value = "b") int b){
        return  add.add(a,b);
    }


//    @GetMapping("userone")
//    public String userone(@RequestParam("id") int id){
//        return add.userone(id);
//    }





}