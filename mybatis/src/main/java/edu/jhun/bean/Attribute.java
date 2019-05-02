package edu.jhun.bean;

import org.springframework.stereotype.Component;

/**
 * Created by hgw on 2019/4/29.
 */
@Component
public class Attribute {
    public String attributeName;
    public int attributeId;

    @Override
    public String toString() {
        return "Attribute{" +
                "attributeName='" + attributeName + '\'' +
                ", attributeId=" + attributeId +
                '}';
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public int getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(int attributeId) {
        this.attributeId = attributeId;
    }
}
