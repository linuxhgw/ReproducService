package edu.jhun.Service.Test.Imp;

import edu.jhun.Service.Test.add;
import edu.jhun.bean.User;
import edu.jhun.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hgw on 2019/4/27.
 */
@Component
public class Impadd implements add {
    @Autowired
    TestMapper testMapper;


    @Override
    public int add(int a, int b) {
        System.out.println(a+b+1);
        return a+b;
    }


    @Override
    public String userone(int id) {
        List<User> users = testMapper.selectOne(id);
         return users.toString();
    }

}
