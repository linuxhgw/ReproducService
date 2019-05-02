package edu.jhun.dao;

import edu.jhun.bean.Attribute;
import edu.jhun.bean.Mumber;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
@Mapper
public interface MumberMapper {
    @Results(id = "getAttributeList", value = {
            @Result(column = "PARA_ID", property = "attributeId"),
            @Result(column = "PARA_LABEL", property = "attributeName")
    })
    @Select({"SELECT\n" +
            "\tPARA_ID,\n" +
            "\tPARA_LABEL\n" +
            "FROM\n" +
            "\tschemelist\n" +
            "WHERE\n" +
            "scheme_member_id = #{mumberId}\n" +
            "AND Scheme_id = #{schemeId}\n"})
    ArrayList<Attribute> getAttributeList(@Param("mumberId") int mumberId,
                                          @Param("schemeId") int schemeId);

    @Results(id = "getScheme", value = {
            @Result(column = "scheme_member_id", property = "mumberId"),
            @Result(column = "MODEL_NAME", property = "mumberName")
    })
    @Select({"SELECT DISTINCT\n" +
            "scheme_member_id ,MODEL_NAME\n" +
            "from schemelist \n" +
            "where Scheme_id =#{schemeId}"})
    List<Mumber> getMumber(int schemeId);

}
