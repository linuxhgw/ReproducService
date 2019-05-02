package edu.jhun.dao;

import edu.jhun.bean.*;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hgw on 2019/4/29.
 */
@Mapper
public interface SchemeMapper {
    @Results(id = "getSchemeList", value = {
            @Result(column = "SCheme_id", property = "schemeId"),
            @Result(column = "Scheme_name", property = "schemeName")
    })
    @Select({"SELECT DISTINCT SCheme_id , Scheme_name From schemelist"})
     List<Scheme> getSchemeList();





    @Results(id = "getSchemeMessage", value = {
            @Result(column = "SCHEME_ID", property = "schemeId"),
            @Result(column = "SCHEME_NAME", property = "schemeName"),
            @Result(column = "BEGIN_TIME", property = "beginTime"),
            @Result(column = "END_TIME", property = "endTime"),
            @Result(column = "SCHEME_AUTHOR", property = "schemeAuthor"),
            @Result(column = "SCHEME_FILE", property = "schemeFile"),
            @Result(column = "SCHEME_DESC", property = "schemeDesc"),
            @Result(column = "SPONSERID", property = "sponserId")
    })
    @Select({"SELECT\n" +
            "\tSCHEME_ID,\n" +
            "\tSCHEME_NAME,\n" +
            "\tBEGIN_TIME,\n" +
            "\tEND_TIME,\n" +
            "\tSCHEME_AUTHOR,\n" +
            "\tSCHEME_DESC,\n" +
            "\tSCHEME_FILE,\n" +
            "\tSPONSERID\n" +
            "FROM\n" +
            "\tsimu_scheme\n" +
            "WHERE\n" +
            "SCHEME_ID=#{schemeId}"})
    SchemeMessage getSchemeMessage(int schemeId);

}
