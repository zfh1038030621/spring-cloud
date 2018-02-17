package com.zfh.provide.controller;
/**
 * @author zhangfanghui
 * @since 2017/9/13
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/test")
    public void test() {
        System.out.println("provide-service is provides services");
    }
}

