package edu.jhun.Service.Scheme;

import edu.jhun.api.Scheme.SchemeService;
import edu.jhun.bean.Scheme;
import edu.jhun.bean.SchemeMessage;
import edu.jhun.dao.SchemeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
@Service
public class ImpSchemeService  implements SchemeService{


    @Autowired
    SchemeMapper schemeMapper;

    @Override
    public List<Scheme> getSchemeList() {
        return  schemeMapper.getSchemeList();
    }

    @Override
    public SchemeMessage getSchemeMessage(int schemeId) {
        return schemeMapper.getSchemeMessage(schemeId);
    }
}
