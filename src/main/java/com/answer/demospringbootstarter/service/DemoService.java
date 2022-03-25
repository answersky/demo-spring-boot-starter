package com.answer.demospringbootstarter.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liufeng
 * @version: V1.0
 * @data: 2022/3/25 14:17
 * @className: DemoService
 * @packageName: com.answer.demospringbootstarter.service
 * @description:
 */
@Slf4j
public class DemoService {
    private String key;
    private String value;

    public DemoService(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void printProperties() {
        log.info("key=" + this.key);
        log.info("value=" + this.value);
    }
}
