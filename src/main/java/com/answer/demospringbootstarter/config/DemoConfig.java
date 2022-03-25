package com.answer.demospringbootstarter.config;

import com.answer.demospringbootstarter.DemoProperties;
import com.answer.demospringbootstarter.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liufeng
 * @version: V1.0
 * @data: 2022/3/25 14:19
 * @className: DemoConfig
 * @packageName: com.answer.demospringbootstarter.config
 * @description:
 */
@Configuration
@EnableConfigurationProperties(DemoProperties.class)
@ConditionalOnProperty(prefix = "answer", name = "isopen", havingValue = "true")
public class DemoConfig {
    @Autowired
    private DemoProperties demoProperties;

    @Bean
    public DemoService demoService() {
        return new DemoService(demoProperties.getKey(), demoProperties.getValue());
    }
}
