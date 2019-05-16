package edu.jhun.Service.Scheme;

import edu.jhun.bean.AttributeMessage;
import edu.jhun.bean.OutValue;

import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
public interface DateService {
    int[] getSchemeRunTime(int schemeId);
    List<OutValue> getDate(String atrr);
}
