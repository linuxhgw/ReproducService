package edu.jhun.Service.Scheme.Imp;

import edu.jhun.Dao.StepValueDao;
import edu.jhun.Service.Scheme.DateService;
import edu.jhun.bean.AttributeMessage;
import edu.jhun.bean.OutValue;
import edu.jhun.dao.DateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
@Service
public class ImpDateService implements DateService {

    @Autowired
    DateMapper dateMapper;
    @Autowired
    StepValueDao stepValueDao;

    @Override
    public int[] getSchemeRunTime(int schemeId) {
        return dateMapper.getSchemeRunTime(schemeId);
    }

    @Override
    public List<OutValue> getDate(AttributeMessage atrr) {
        return stepValueDao.getvalue(atrr) ;
    }
}
