package edu.jhun.bean;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by hgw on 2019/4/29.
 */
@Component
public class SchemeMessage {
    public int schemeId;
    public String schemeName;
    public String beginTime;
    public String endTime;
    public String schemeAuthor;
    public byte[] schemeFile;
    public String schemeDesc;
    public int sponserId;

    @Override
    public String toString() {
        return "SchemeMessage{" +
                "schemeId=" + schemeId +
                ", schemeName='" + schemeName + '\'' +
                ", beginTime='" + beginTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", schemeAuthor='" + schemeAuthor + '\'' +
                ", schemeFile=" + Arrays.toString(schemeFile) +
                ", schemeDesc='" + schemeDesc + '\'' +
                ", sponserId=" + sponserId +
                '}';
    }

    public int getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(int schemeId) {
        this.schemeId = schemeId;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSchemeAuthor() {
        return schemeAuthor;
    }

    public void setSchemeAuthor(String schemeAuthor) {
        this.schemeAuthor = schemeAuthor;
    }

    public byte[] getSchemeFile() {
        return schemeFile;
    }

    public void setSchemeFile(byte[] schemeFile) {
        this.schemeFile = schemeFile;
    }

    public String getSchemeDesc() {
        return schemeDesc;
    }

    public void setSchemeDesc(String schemeDesc) {
        this.schemeDesc = schemeDesc;
    }

    public int getSponserId() {
        return sponserId;
    }

    public void setSponserId(int sponserId) {
        this.sponserId = sponserId;
    }
}
