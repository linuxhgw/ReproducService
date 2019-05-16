package edu.jhun.bean;

import org.springframework.stereotype.Component;

/**
 * Created by hgw on 2019/4/29.
 */
@Component
public class AttributeMessage {
    public int schemeId;
    public int mumberId;
    public int attributeId;
    public String attributeName;
    public int startUp;
    public int endUp;
    public int runTime;

    @Override
    public String toString() {
        return "AttributeMessage{" +
                "schemeId=" + schemeId +
                ", mumberId=" + mumberId +
                ", attributeId=" + attributeId +
                ", attributeName='" + attributeName + '\'' +
                ", startUp=" + startUp +
                ", endUp=" + endUp +
                ", runTime=" + runTime +
                '}';
    }

    public int getSchemeId() {
        return schemeId;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public void setSchemeId(int schemeId) {
        this.schemeId = schemeId;
    }

    public int getMumberId() {
        return mumberId;
    }

    public void setMumberId(int mumberId) {
        this.mumberId = mumberId;
    }

    public int getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(int attributeId) {
        this.attributeId = attributeId;
    }

    public int getStartUp() {
        return startUp;
    }

    public void setStartUp(int startUp) {
        this.startUp = startUp;
    }

    public int getEndUp() {
        return endUp;
    }

    public void setEndUp(int endUp) {
        this.endUp = endUp;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }
}
