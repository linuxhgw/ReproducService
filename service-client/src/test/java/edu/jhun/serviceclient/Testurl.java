package edu.jhun.serviceclient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sun.deploy.net.URLEncoder;
import edu.jhun.bean.*;
import org.junit.Assert;
import org.junit.Test;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by hgw on 2019/5/5.
 */
public class Testurl {

    RestTemplate restTemplate = new RestTemplate();
    String port = "8764";

    @Test
    public void action() {
        try {
            String url = "http://localhost:" + port + "/getMumber" + "?schemeId=1";
            String lilun = "[{\"mumberName\":\"A\",\"mumberId\":1,\"attributeList\":[{\"attributeName\":\"X\",\"attributeId\":1},{\"attributeName\":\"Y\",\"attributeId\":2},{\"attributeName\":\"Z\",\"attributeId\":3}]},{\"mumberName\":\"B\",\"mumberId\":2,\"attributeList\":[{\"attributeName\":\"X\",\"attributeId\":4},{\"attributeName\":\"Y\",\"attributeId\":5},{\"attributeName\":\"Z\",\"attributeId\":6}]},{\"mumberName\":\"C\",\"mumberId\":3,\"attributeList\":[{\"attributeName\":\"X\",\"attributeId\":7},{\"attributeName\":\"Y\",\"attributeId\":8},{\"attributeName\":\"Z\",\"attributeId\":9}]}]";
            List<Mumber> lilunObject = JSON.parseArray(lilun, Mumber.class);
            ArrayList result = restTemplate.getForObject(url, ArrayList.class);

            Assert.assertTrue("通过主数据的标准化编码进行查询=>测试成功", result.size() == lilunObject.size());
            System.err.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void action1() {
        try {
            String url = "http://localhost:" + port + "/getSchemeList";
            String lilun = "[{\"schemeName\":\"test\",\"schemeId\":1},{\"schemeName\":\"test\",\"schemeId\":2},{\"schemeName\":\"test\",\"schemeId\":3},{\"schemeName\":\"test\",\"schemeId\":4},{\"schemeName\":\"test\",\"schemeId\":5}]";
            List<Scheme> lilunObject = JSON.parseArray(lilun, Scheme.class);
            ArrayList result = restTemplate.getForObject(url, ArrayList.class);

            Assert.assertTrue("通过主数据的标准化编码进行查询=>测试成功", result.size() == lilunObject.size());
            System.err.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void action2() {
        try {
            String url = "http://localhost:" + port + "/getSchemeMessage" + "?schemeId=1";
            StringBuilder sb = new StringBuilder();
            sb.append("{\"schemeId\":1,\"schemeName\":\"test\",\"beginTime\":\"2017-10-19T17:59:03.053488+08:00\",\"endTime\":\"2017-10-19T17:59:34.3375653+08:00\",\"schemeAuthor\":\"test\",\"schemeFile\":\"\",\"schemeDesc\":null,\"sponserId\":10}");
            SchemeMessage lilunObject = JSON.parseObject(sb.toString(), SchemeMessage.class);
            SchemeMessage result = restTemplate.getForObject(url, SchemeMessage.class);

            Assert.assertTrue("通过主数据的标准化编码进行查询=>测试成功", result.beginTime.equals(lilunObject.beginTime));
            System.err.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void action3() {
        try {
            String url = "http://localhost:" + port + "/getSchemeRunTime" + "?schemeId=1";
            ArrayList result = restTemplate.getForObject(url,ArrayList.class);
            System.err.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void action4() {
        try {
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
            String url = "http://localhost:8764/" + "getDate?atrr={json}";

            String result = restTemplate.getForObject(url, String.class, json);

            String lilun = "[{\"outPut\":\"{\\\"1\\\":{\\\"1\\\":\\\"1.00\\\",\\\"2\\\":\\\"1.00\\\",\\\"3\\\":\\\"0.54\\\"}}\",\"step\":1,\"time\":0.1,\"attributeValue\":1.0},{\"outPut\":\"{\\\"1\\\":{\\\"1\\\":\\\"2.00\\\",\\\"2\\\":\\\"4.00\\\",\\\"3\\\":\\\"0.42\\\"}}\",\"step\":2,\"time\":0.2,\"attributeValue\":2.0},{\"outPut\":\"{\\\"1\\\":{\\\"1\\\":\\\"3.00\\\",\\\"2\\\":\\\"9.00\\\",\\\"3\\\":\\\"0.99\\\"}}\",\"step\":3,\"time\":0.3,\"attributeValue\":3.0},{\"outPut\":\"{\\\"1\\\":{\\\"1\\\":\\\"4.00\\\",\\\"2\\\":\\\"16.00\\\",\\\"3\\\":\\\"0.65\\\"}}\",\"step\":4,\"time\":0.4,\"attributeValue\":4.0},{\"outPut\":\"{\\\"1\\\":{\\\"1\\\":\\\"5.00\\\",\\\"2\\\":\\\"25.00\\\",\\\"3\\\":\\\"0.28\\\"}}\",\"step\":5,\"time\":0.5,\"attributeValue\":5.0}]";
            List<OutValue> lilunObject = JSON.parseArray(lilun, OutValue.class);

            //然后把str转换成JSON再通过getJSONObject()方法获取到里面的result对象，因为我想要的数据都在result里面
            //下面的strToJson只是一个str转JSON的一个共用方法；

            System.err.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void action5() {
        try {
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

            String result = restTemplate.getForObject(url, String.class, json);

            String lilun = "{\"adjustmentTime\":0.0,\"delayTime\":0.2,\"numberOfOscillation\":0.0,\"overShoot\":0.1111111111111111,\"peakTime\":0.5,\"riseTime\":0.4}";
            TimeDomainIndex lilunObject = JSON.parseObject(lilun, TimeDomainIndex.class);
            System.err.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void action6() {
        try {
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

            String result = restTemplate.getForObject(url, String.class, json);

            String lilun = "{\"maxDate\":5.0,\"minDate\":0.0,\"varianceDate\":10.0,\"standardDeviationDate\":0.6324555320336759,\"averageDate\":3.0,\"rangeDate\":5.0}";
            TimeDomainIndex lilunObject = JSON.parseObject(lilun, TimeDomainIndex.class);
            System.err.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
