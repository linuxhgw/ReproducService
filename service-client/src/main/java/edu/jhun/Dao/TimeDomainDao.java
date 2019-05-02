package edu.jhun.Dao;

import edu.jhun.bean.AttributeMessage;
import edu.jhun.bean.OutValue;

import edu.jhun.bean.TimeDomainIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hgw on 2018/3/21.
 */
@Repository
public class TimeDomainDao {

    @Autowired
    AttributeMessage atrr;
    @Autowired
    TimeDomainIndex timeDomainIndex;

    //终值
    public double FinalValue(List<OutValue> outValues) {
        double finalvalue = 0;

        double[] MaxMix = new double[2];
        int length = outValues.size();
        finalvalue = outValues.get(length-1).getAttributeValue();
        MaxMix[0] = finalvalue;
        MaxMix[1] = finalvalue;
        double max = finalvalue;
        double min = finalvalue;
        double piont = finalvalue;
        double Flag = 0;
        for (int i = length - 2; i > 0; i--) {
            if (outValues.get(i).getAttributeValue() < outValues.get(i - 1).getAttributeValue()) {
                MaxMix[1] = outValues.get(i).getAttributeValue();
            }
            if (outValues.get(i).getAttributeValue() > outValues.get(i - 1).getAttributeValue()) {

                MaxMix[0] = outValues.get(i).getAttributeValue();
            }


            double tem = 2 * (Math.abs(MaxMix[0] - MaxMix[1])) / (MaxMix[0] + MaxMix[1]);
            if (tem > 0.02) {
                finalvalue = (MaxMix[0] + MaxMix[1]) / 2;
                break;

            }


        }
        return finalvalue;

    }

    public double overShoot(List<OutValue> outValues) {
        double finalvalue = 0;
        double maxValue = 0;
        double overShoot = 0;//超调量
        finalvalue = FinalValue(outValues);
        for (int i = 0; i < outValues.size(); i++) {

            maxValue = Math.max(maxValue, outValues.get(i).getAttributeValue());

        }
        System.out.println(maxValue + "最大值是");
        System.out.println("终值是" + finalvalue);
        overShoot = (maxValue - finalvalue) / finalvalue;
        return overShoot;
    }

    //计算每个量写到一个数组中啦啦啦

    public synchronized TimeDomainIndex caculateStatistics(List<OutValue> outValues) {

        double maxValue = 0;
        double finalvalue = 0;
        double overShoot = 0;//超调量
        double adjustmentTime = 0;//调节时间
        double numberOfOscillation = 0;//振荡次数
        double delayTime = 0;//延迟时间
        double riseTime = 0;//上升时间
        double peakTime = 0;//峰值时间
        //这里就是处理计算
        //终值
        finalvalue = FinalValue(outValues);
        //超调量
        overShoot = overShoot(outValues);

        //调节时间
        for (int i = 0; i < outValues.size(); i++) {
            if ((outValues.get(i).getAttributeValue() > 0.98 * finalvalue)
                    && (outValues.get(i).getAttributeValue() < 1.02 * finalvalue)) {
                adjustmentTime = outValues.get(i).getTime() - outValues.get(0).getTime();
                break;
            }
        }
        //震荡次数 就是到终值时之前有多少步

        for (int i = 0; i < outValues.size() - 1; i++) {
            if (outValues.get(i).getAttributeValue() == finalvalue) {
                numberOfOscillation = i;
                System.out.println(numberOfOscillation + "震荡次数");
            }
        }


        //峰值时间
        for (int i = 0; i < outValues.size(); i++) {
            if (maxValue < outValues.get(i).getAttributeValue()) {
                peakTime = outValues.get(i).getTime();
                maxValue = outValues.get(i).getAttributeValue();
            }
        }

        System.out.println("peaktime" + peakTime);
        double firstTime = 0;
        for (int i = 0; i < outValues.size(); i++) {
            if (outValues.get(i).getAttributeValue() < finalvalue * 0.1) {

                firstTime = outValues.get(i).getTime();

            } else {
                break;
            }
        }
        System.out.println("fisttime" + firstTime);
        double endTime = 0;

        for (int i = 0; i < outValues.size(); i++) {
            if (outValues.get(i).getAttributeValue() < finalvalue * 0.9) {

                endTime = outValues.get(i).getTime();
            } else {
                break;
            }
        }
        System.out.println("endtime" + endTime);
        riseTime = endTime - firstTime;
        System.out.println("risetime" + riseTime);
        delayTime = riseTime / 2;


        //steadyStateError--overShoot--adjustmentTime--
        // numberOfOscillation--delayTime--riseTime--peakTime

        timeDomainIndex.setAdjustmentTime(adjustmentTime);
        timeDomainIndex.setDelayTime(delayTime);
        timeDomainIndex.setNumberOfOscillation(numberOfOscillation);
        timeDomainIndex.setOverShoot(overShoot);
        timeDomainIndex.setPeakTime(peakTime);
        timeDomainIndex.setRiseTime(riseTime);



        return timeDomainIndex;
    }
}
