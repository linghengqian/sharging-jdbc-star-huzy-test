package org.example.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Collection;
import java.util.Properties;

/**
 * @Author huzy
 * @Date 2023/9/10 10:32
 * @Description TODO
 * @Version 1.0
 */
@Component
@Slf4j
public class DataShardingAlgorithm implements StandardShardingAlgorithm<Long> {

    @Resource
    DataSource dataSource;

    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<Long> rangeShardingValue) {
        return collection;
    }

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        System.out.println(dataSource);
        StringBuilder resultTableName = new StringBuilder();
        String logicTableName = preciseShardingValue.getLogicTableName();
        // 拼接的tenantId，格式为 表名_{tenant_id}
        resultTableName.append(logicTableName).append("_").append(preciseShardingValue.getValue());
        String newTableName = resultTableName.toString().toLowerCase();
        if (!collection.contains(newTableName)) {
            // 动态新增节点
            ShardingAlgorithmTool.copyTable(logicTableName,newTableName);
            collection.add(newTableName);
        }
        return newTableName;
    }
    @Override
    public String getType() {
        return null;
    }


    @Override
    public void init(Properties properties) {

    }

}