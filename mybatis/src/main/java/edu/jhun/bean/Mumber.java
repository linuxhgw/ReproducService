package edu.jhun.bean;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by hgw on 2019/4/29.
 */
@Component
public class Mumber {
    public String mumberName;
    public int mumberId;
    public ArrayList<Attribute> attributeList;

    public Mumber(){}

    @Override
    public String toString() {
        return "Mumber{" +
                "mumberName='" + mumberName + '\'' +
                ", mumberId=" + mumberId +
                ", attributeList=" + attributeList +
                '}';
    }

    public String getMumberName() {
        return mumberName;
    }

    public void setMumberName(String mumberName) {
        this.mumberName = mumberName;
    }

    public int getMumberId() {
        return mumberId;
    }

    public void setMumberId(int mumberId) {
        this.mumberId = mumberId;
    }

    public ArrayList<Attribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(ArrayList<Attribute> attributeList) {
        this.attributeList = attributeList;
    }
}
