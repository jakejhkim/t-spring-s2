package com.wirebarley.sample.s2.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Redis 설정
 *
 * Created by jake on 2016. 5. 23..
 */
@Configuration
@Profile("redis")
@EnableRedisHttpSession
public class RedisConfiguration {
}
