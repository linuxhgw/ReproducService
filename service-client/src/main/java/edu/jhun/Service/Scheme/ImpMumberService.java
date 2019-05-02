package edu.jhun.Service.Scheme;

import edu.jhun.api.Scheme.MumberService;
import edu.jhun.bean.Attribute;
import edu.jhun.bean.Mumber;
import edu.jhun.dao.MumberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
@Service
public class ImpMumberService implements MumberService {

    @Autowired
    MumberMapper mumberMapper;

    @Override
    public List<Mumber> getMumber(int schemeId) {
        List<Mumber> scheme = mumberMapper.getMumber(schemeId);

        for (int i = 0; i < scheme.size(); i++) {
            ArrayList<Attribute> attributeList = mumberMapper.getAttributeList(
                    scheme.get(i).getMumberId(), schemeId);
            scheme.get(i).setAttributeList(attributeList);

        }
        return scheme;
    }
}
