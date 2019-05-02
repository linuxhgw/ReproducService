package edu.jhun.api.Scheme;

import edu.jhun.bean.Scheme;
import edu.jhun.bean.SchemeMessage;

import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
public interface SchemeService {
    List<Scheme> getSchemeList();
    SchemeMessage getSchemeMessage(int schemeId);
}
