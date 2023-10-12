package org.example.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;

import java.util.Collection;

@Slf4j
public final class DataShardingAlgorithm implements StandardShardingAlgorithm<Long> {
    @Override
    public Collection<String> doSharding(final Collection<String> collection, final RangeShardingValue<Long> rangeShardingValue) {
        return collection;
    }

    @Override
    public String doSharding(final Collection<String> collection, final PreciseShardingValue<Long> preciseShardingValue) {
        StringBuilder resultTableName = new StringBuilder();
        String logicTableName = preciseShardingValue.getLogicTableName();
        resultTableName.append(logicTableName).append("_").append(preciseShardingValue.getValue());
        return resultTableName.toString().toLowerCase();
    }
}