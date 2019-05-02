package edu.jhun.bean;

import org.springframework.stereotype.Component;

/**
 * Created by hgw on 2019/4/29.
 */
@Component
public class OutValue {
    public String outPut;
    public int step;
    public double time;
    public double attributeValue;

    public double getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(double attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "OutVlaue{" +
                "outPut=" + outPut +
                ", step=" + step +
                ", time=" + time +
                '}';
    }

    public String getOutPut() {
        return outPut;
    }

    public void setOutPut(String outPut) {
        this.outPut = outPut;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
