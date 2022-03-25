package com.answer.demospringbootstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author liufeng
 * @version: V1.0
 * @data: 2022/3/25 14:11
 * @className: DemoProperties
 * @packageName: com.answer.demospringbootstarter.config
 * @description:
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "answer")
public class DemoProperties {
    private String key;
    private String value;
}
