package com.zfh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangfanghui
 * @since 2017/9/13
 */


@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/test")
    public void test() {
        //template.getForEntity("http://localhost:8000/test",String.class);
        restTemplate.getForEntity("http://provide-serivce/test",String.class);
    }
}

