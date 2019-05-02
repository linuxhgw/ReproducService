package edu.jhun.dao;

import edu.jhun.bean.AttributeMessage;
import edu.jhun.bean.OutValue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
@Mapper
public interface DateMapper {
    @Select({"SELECT DISTINCT RunID  From datacollect#{schemeId}"})
    int[] getSchemeRunTime(int schemeId);


    @Results(id = "getDate", value = {
            @Result(column = "Outputvalue", property = "outPut"),
            @Result(column = "step", property = "step"),
            @Result(column = "time", property = "time")
    })
    @Select({"SELECT DISTINCT\n" +
            "\tOutputvalue,\n" +
            "\tstep,\n" +
            "\ttime\n" +
            "FROM\n" +
            "\tdatacollect#{schemeId}\n" +
            "WHERE\n" +
            "\tMemberId = #{mumberId}\n" +
            "AND step BETWEEN #{startUp}\n" +
            "AND #{endUp}"})
    List<OutValue> getDate(AttributeMessage atrr);


}
