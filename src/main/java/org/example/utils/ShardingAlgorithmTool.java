package org.example.utils;



import org.example.mapper.DataShardingMapper;
import org.springframework.stereotype.Component;


/**
 * @Author huzy
 * @Date 2023/8/28 11:40
 * @Description TODO
 * @Version 1.0
 */

@Component
public class ShardingAlgorithmTool {

    private static DataShardingMapper dataShardingMapper = SpringUtils.getBean(DataShardingMapper.class);

    public static String getTable(String table) {
        return dataShardingMapper.getTablesNumByName(table);
    }

    public static void copyTable(String originalTable, String newTable) {
        dataShardingMapper.copyTables(originalTable, newTable);
    }
}