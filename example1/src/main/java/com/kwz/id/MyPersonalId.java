package com.kwz.id;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;

import java.util.Properties;

/**
 * Description
 * Date 2021/2/18 23:04
 * Created by kwz
 */
@Slf4j
public class MyPersonalId implements ShardingKeyGenerator {

    private SnowflakeShardingKeyGenerator snowflake = new SnowflakeShardingKeyGenerator();

    @Override
    public Comparable<?> generateKey() {
        log.info("-----------执行了自定义的主键生成器-----------");
        return snowflake.generateKey();
    }

    @Override
    public String getType() {
        return "KWZ-KEY";
    }

    @Override
    public Properties getProperties() {
        return new SnowflakeShardingKeyGenerator().getProperties();
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
