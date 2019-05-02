package edu.jhun.bean;

import org.springframework.stereotype.Component;

/**
 * Created by hgw on 2019/4/29.
 */
@Component
public class Scheme {
    public String schemeName;
    public int schemeId;

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public int getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(int schemeId) {
        this.schemeId = schemeId;
    }
}
