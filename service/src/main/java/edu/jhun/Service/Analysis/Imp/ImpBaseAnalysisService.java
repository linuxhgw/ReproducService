package edu.jhun.Service.Analysis.Imp;

import edu.jhun.Dao.BaseIndexDao;
import edu.jhun.Dao.StepValueDao;
import edu.jhun.Service.Analysis.BaseAnalysisService;
import edu.jhun.bean.AttributeMessage;
import edu.jhun.bean.BaseIndex;
import edu.jhun.bean.OutValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
@Service
public class ImpBaseAnalysisService implements BaseAnalysisService {


     @Autowired
     BaseIndexDao baseIndexDao;


     @Autowired
     StepValueDao stepValueDao;
     @Override
     public BaseIndex getBaseAnalysis(AttributeMessage atrr) {

          List<OutValue> getvalue = stepValueDao.getvalue(atrr);
          return baseIndexDao.getBaseIndex(getvalue);
     }
}
