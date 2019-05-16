package edu.jhun.Dao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import edu.jhun.bean.AttributeMessage;
import edu.jhun.bean.OutValue;
import edu.jhun.dao.DateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StepValueDao {


    @Autowired
    DateMapper dateMapper;

    public List<OutValue> getvalue(AttributeMessage attributeMessage) {
        List<OutValue> date = dateMapper.getDate(attributeMessage);
        for (int i = 0; i < date.size(); i++) {
            String outPutJson = date.get(i).getOutPut();
            JSONObject jsonObject =  JSON.parseObject(outPutJson);
            JSONObject attrvalues =(JSONObject) jsonObject.get(
                                    attributeMessage.getMumberId());
            String value =(String) attrvalues.get(attributeMessage.getAttributeId());
            date.get(i).setAttributeValue(Double.valueOf(value));
        }
        return date;
    }


}
