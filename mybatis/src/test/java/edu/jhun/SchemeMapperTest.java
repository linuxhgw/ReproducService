package edu.jhun;

import edu.jhun.bean.*;
import edu.jhun.dao.DateMapper;
import edu.jhun.dao.MumberMapper;
import edu.jhun.dao.SchemeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisApplication.class)

public class SchemeMapperTest {
    @Autowired
    SchemeMapper schemeMapper;

    @Autowired
    MumberMapper mumberMapper;

    @Autowired
    DateMapper dateMapper;


    @Test
    public void  Action (){
        List<Scheme> scheme = schemeMapper.getSchemeList();
        for (int i = 0; i < scheme.size(); i++) {
            System.out.println(scheme.get(i));
        }



    }
    @Test
    public void  Action1 (){
        int[] schemeRunTime = dateMapper.getSchemeRunTime(1);
        for (int i = 0; i < schemeRunTime.length; i++) {
            System.out.println(schemeRunTime[i]);
        }
    }
    @Test
    public void  Action2 (){
        AttributeMessage attributeMessage = new AttributeMessage();
        attributeMessage.setAttributeId(1);
        attributeMessage.setEndUp(50);
        attributeMessage.setSchemeId(1);
        attributeMessage.setMumberId(1);

        List<OutValue> date = dateMapper.getDate(attributeMessage);
        for (int i = 0; i < date.size(); i++) {
            System.out.println(date.get(i));
        }
    }
    @Test
    public void  Action3 (){
        List<Mumber> scheme = mumberMapper.getMumber(1);

        for (int i = 0; i < scheme.size(); i++) {
            ArrayList<Attribute> attributeList = mumberMapper.getAttributeList(scheme.get(i).getMumberId(),1);
            for (int j = 0; j <attributeList.size() ; j++) {
                System.out.println(attributeList.get(j));
            }
            scheme.get(i).setAttributeList(attributeList);
            System.out.println(scheme.get(i));
        }
    }

    @Test
    public void  Action4 (){
        SchemeMessage schemeMessage = schemeMapper.getSchemeMessage(1);
        System.out.println(schemeMessage);
    }

}
