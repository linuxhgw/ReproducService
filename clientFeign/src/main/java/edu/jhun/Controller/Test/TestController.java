package edu.jhun.Controller.Test;

//import edu.jhun.api.Imp.Imp.TestService;



import edu.jhun.Service.Test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by hgw on 2019/3/24.
 */
@RestController
public class TestController {

   @Autowired
   TestService testService;



    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String add(@RequestParam String message) {
        return testService.add(message);
    }

    @GetMapping(value = "/add")
    public int add(@RequestParam(value = "a") int a,@RequestParam(value = "b") int b){
        return  testService.jiafa(a,b);
    }

}