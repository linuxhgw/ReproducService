package edu.jhun;


import edu.jhun.bean.User;
import edu.jhun.dao.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hgw on 2019/4/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisApplication.class)

public class UserTest {


    @Autowired
    TestMapper testMapper;


    @Test
    public void Action() {

        User se = new User();
        se.setId(1);
        testMapper.insert(se);

        testMapper.selectOne(1);

    }
}
