package edu.jhun.Dao;


import edu.jhun.bean.BaseIndex;
import edu.jhun.bean.OutValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BaseIndexDao {

    @Autowired
    BaseIndex baseIndex;

    public  BaseIndex getBaseIndex(List<OutValue> outValues) {
        double currentOutputValue;
        double sumDate = 0.0;
        double maxDate = 0.0;
        double minDate = 0.0;
        double varianceDate = 0.0;
        int count = outValues.size();
        baseIndex.setMaxDate(maxDate);
        baseIndex.setMaxDate(maxDate);

       try {
            double tempAvg = sumDate / count;
            baseIndex.setAverageDate(tempAvg);
            for (int i = 0; i < count; i++) {
                currentOutputValue = outValues.get(i).getAttributeValue();
                sumDate += currentOutputValue;
                maxDate = Math.max(currentOutputValue, maxDate);
                minDate = Math.min(currentOutputValue, minDate);
                varianceDate += (currentOutputValue - tempAvg) *
                        (currentOutputValue - tempAvg);
            }
            baseIndex.setMaxDate(maxDate);
            baseIndex.setMaxDate(maxDate);
            baseIndex.setVarianceDate(varianceDate);
            baseIndex.setStandardDeviationDate(Math.sqrt(varianceDate) / count);
            baseIndex.setRangeDate(maxDate-minDate);
        } catch (Exception e){
            e.getMessage();
       }
        return baseIndex;
    }


}
