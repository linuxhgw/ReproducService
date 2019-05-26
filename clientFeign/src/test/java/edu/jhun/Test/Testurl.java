package edu.jhun.Test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


/**
 * Created by hgw on 2019/5/5.
 */
public class Testurl {

    RestTemplate restTemplate = new RestTemplate();
    String port = "8888/route-map2";

    @Test
    public void action() {

        String url = "http://localhost:" + port + "/getMumber" + "?schemeId=1";
        String lilun = "[{\"mumberName\":\"A\",\"mumberId\":1,\"attributeList\":[{\"attributeName\":\"X\",\"attributeId\":1},{\"attributeName\":\"Y\",\"attributeId\":2},{\"attributeName\":\"Z\",\"attributeId\":3}]},{\"mumberName\":\"B\",\"mumberId\":2,\"attributeList\":[{\"attributeName\":\"X\",\"attributeId\":4},{\"attributeName\":\"Y\",\"attributeId\":5},{\"attributeName\":\"Z\",\"attributeId\":6}]},{\"mumberName\":\"C\",\"mumberId\":3,\"attributeList\":[{\"attributeName\":\"X\",\"attributeId\":7},{\"attributeName\":\"Y\",\"attributeId\":8},{\"attributeName\":\"Z\",\"attributeId\":9}]}]";
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(url, String.class);
        Assert.assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        System.out.println(responseEntity.getBody());


    }

    @Test
    public void action1() {

        String url = "http://localhost:" + port + "/getSchemeList";
        String lilun = "[{\"schemeName\":\"test\",\"schemeId\":1},{\"schemeName\":\"test\",\"schemeId\":2},{\"schemeName\":\"test\",\"schemeId\":3},{\"schemeName\":\"test\",\"schemeId\":4},{\"schemeName\":\"test\",\"schemeId\":5}]";
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(url, String.class);
        Assert.assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        System.out.println(responseEntity.getBody());

    }

    @Test
    public void action2() {

        String url = "http://localhost:" + port + "/getSchemeMessage" + "?schemeId=1";
        StringBuilder sb = new StringBuilder();
        sb.append("{\"schemeId\":1,\"schemeName\":\"test\",\"beginTime\":\"2017-10-19T17:59:03.053488+08:00\",\"endTime\":\"2017-10-19T17:59:34.3375653+08:00\",\"schemeAuthor\":\"test\",\"schemeFile\":\"\",\"schemeDesc\":null,\"sponserId\":10}");
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(url, String.class);
        Assert.assertTrue(responseEntity.getStatusCode().is2xxSuccessful());

        System.out.println(responseEntity.getBody());
    }

    @Test
    public void action3() {

        String url = "http://localhost:" + port + "/getSchemeRunTime" + "?schemeId=1";
        int[] lilun = {1, 2, 3};
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(url, String.class);
        Assert.assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        System.out.println(responseEntity.getBody());

    }

    @Test
    public void action4() {
        String json = "{\n" +
                "  \"SchemeId\": 1,\n" +
                "  \"MumberId\": 1,\n" +
                "  \"AttributeId\": 1,\n" +
                "  \"StartUp\": 1,\n" +
                "  \"EndUp\": 5,\n" +
                "  \"RunTime\": 1,\n" +
                "  \"AttributeName\": \"X\",\n" +
                "  \"MumberName\": \"\"\n" +
                "}";
        String url = "http://localhost:"+port+"/getDate?atrr={json}";
        String lilun = "[{\"outPut\":\"{\\\"1\\\":{\\\"1\\\":\\\"1.00\\\",\\\"2\\\":\\\"1.00\\\",\\\"3\\\":\\\"0.54\\\"}}\",\"step\":1,\"time\":0.1,\"attributeValue\":1.0},{\"outPut\":\"{\\\"1\\\":{\\\"1\\\":\\\"2.00\\\",\\\"2\\\":\\\"4.00\\\",\\\"3\\\":\\\"0.42\\\"}}\",\"step\":2,\"time\":0.2,\"attributeValue\":2.0},{\"outPut\":\"{\\\"1\\\":{\\\"1\\\":\\\"3.00\\\",\\\"2\\\":\\\"9.00\\\",\\\"3\\\":\\\"0.99\\\"}}\",\"step\":3,\"time\":0.3,\"attributeValue\":3.0},{\"outPut\":\"{\\\"1\\\":{\\\"1\\\":\\\"4.00\\\",\\\"2\\\":\\\"16.00\\\",\\\"3\\\":\\\"0.65\\\"}}\",\"step\":4,\"time\":0.4,\"attributeValue\":4.0},{\"outPut\":\"{\\\"1\\\":{\\\"1\\\":\\\"5.00\\\",\\\"2\\\":\\\"25.00\\\",\\\"3\\\":\\\"0.28\\\"}}\",\"step\":5,\"time\":0.5,\"attributeValue\":5.0}]";

        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(url, String.class,json);
        Assert.assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        System.out.println(responseEntity.getBody());
    }

    @Test
    public void action5() {

        String json = "{\n" +
                "  \"SchemeId\": 1,\n" +
                "  \"MumberId\": 1,\n" +
                "  \"AttributeId\": 1,\n" +
                "  \"StartUp\": 1,\n" +
                "  \"EndUp\": 5,\n" +
                "  \"RunTime\": 1,\n" +
                "  \"AttributeName\": \"X\",\n" +
                "  \"MumberName\": \"\"\n" +
                "}";

        String url = "http://localhost:" + port + "/getTimeDomainAnalysis?atrr={json}";
        String lilun = "{\"adjustmentTime\":0.0,\"delayTime\":0.2,\"numberOfOscillation\":0.0,\"overShoot\":0.1111111111111111,\"peakTime\":0.5,\"riseTime\":0.4}";
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(url, String.class,json);
        Assert.assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        System.out.println(responseEntity.getBody());
    }

    @Test
    public void action6() {
            String json = "{\n" +
                    "  \"SchemeId\": 1,\n" +
                    "  \"MumberId\": 1,\n" +
                    "  \"AttributeId\": 1,\n" +
                    "  \"StartUp\": 1,\n" +
                    "  \"EndUp\": 5,\n" +
                    "  \"RunTime\": 1,\n" +
                    "  \"AttributeName\": \"X\",\n" +
                    "  \"MumberName\": \"\"\n" +
                    "}";

            String url = "http://localhost:" + port + "/getBaseAnalysis?atrr={json}";
           String lilun = "{\"maxDate\":5.0,\"minDate\":0.0,\"varianceDate\":10.0,\"standardDeviationDate\":0.6324555320336759,\"averageDate\":3.0,\"rangeDate\":5.0}";
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(url, String.class,json);
        Assert.assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        System.out.println(responseEntity.getBody());
    }

}
