package edu.jhun.dao;

import edu.jhun.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {
    @Insert({
        "insert into user (id, Name, ",
        "PASSWORD)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR})"
    })
    int insert(User record);


    @Select({"select * from user where id =#{id}"})
    List<User> selectOne(int id);

}