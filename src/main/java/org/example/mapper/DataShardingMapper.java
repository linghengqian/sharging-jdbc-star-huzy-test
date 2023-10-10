package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @Author huzy
 * @Date 2023/8/28 11:41
 * @Description TODO
 * @Version 1.0
 */
@Mapper
public interface DataShardingMapper {

    @Select("SHOW TABLES LIKE #{searchName};")
    String getTablesNumByName(@Param("searchName") String searchName);

    @Update("CREATE TABLE IF NOT EXISTS ${newTable} LIKE ${originalTable} ;")
    void copyTables(@Param("originalTable") String originalTable, @Param("newTable") String newTable);
}
