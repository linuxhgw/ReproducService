package edu.jhun.Test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hgw on 2019/5/25.
 */
public class Testfeign {

    RestTemplate restTemplate = new RestTemplate();
    String port = "8664";
    @Test
    public  void  action1(){

        String url = "http://localhost:" + port + "/add" + "?a=1&b=1";
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(url, String.class);
        Assert.assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
    }
}
