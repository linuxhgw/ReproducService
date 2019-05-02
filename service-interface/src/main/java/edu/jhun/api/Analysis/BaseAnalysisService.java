package edu.jhun.api.Analysis;

import edu.jhun.bean.AttributeMessage;
import edu.jhun.bean.BaseIndex;

/**
 * Created by hgw on 2019/4/29.
 */
public interface BaseAnalysisService {
     BaseIndex getBaseAnalysis(AttributeMessage atrr);
}
