package edu.jhun.api.Scheme;

import edu.jhun.bean.Mumber;

import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
public interface MumberService {
    List<Mumber> getMumber(int schemeId);
}
