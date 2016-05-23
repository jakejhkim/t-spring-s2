package com.wirebarley.sample.s2.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * {@link org.springframework.boot.autoconfigure.session.SessionProperties.Redis} 설정
 *
 * Created by jake on 2016. 5. 23..
 */
@Configuration
@Profile("redis")
public class RedisConfiguration {
}
