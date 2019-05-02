package edu.jhun.Service.Analysis;

import edu.jhun.Dao.StepValueDao;
import edu.jhun.Dao.TimeDomainDao;
import edu.jhun.api.Analysis.TimeDomainAnalysisService;
import edu.jhun.bean.AttributeMessage;
import edu.jhun.bean.OutValue;
import edu.jhun.bean.TimeDomainIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
@Service
public class ImpTimeDomainAnalysisService implements TimeDomainAnalysisService {

    @Autowired
    TimeDomainDao timeDomainDao;


    @Autowired
    StepValueDao stepValueDao;
    @Override
    public TimeDomainIndex getTimeDomainAnalysis(AttributeMessage atrr) {
        List<OutValue> getvalue = stepValueDao.getvalue(atrr);
        return timeDomainDao.caculateStatistics(getvalue) ;
    }
}
