package com.liuhao.springboot.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "redis")
public class RedisCluster {
    private List<SingleRedisConfig> redisConfigs;
}

