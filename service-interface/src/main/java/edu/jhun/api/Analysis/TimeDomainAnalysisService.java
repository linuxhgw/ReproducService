package edu.jhun.api.Analysis;

import edu.jhun.bean.AttributeMessage;
import edu.jhun.bean.TimeDomainIndex;

/**
 * Created by hgw on 2019/4/29.
 */
public interface TimeDomainAnalysisService {
    TimeDomainIndex getTimeDomainAnalysis(AttributeMessage atrr);
}
