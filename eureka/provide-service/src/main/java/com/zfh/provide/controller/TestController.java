package com.zfh.provide.controller;
/**
 * @author zhangfanghui
 * @since 2017/9/13
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class TestController {

    @RequestMapping(value = "/test")
    public String test(HttpServletResponse resp) {
        System.out.println("provide-service is provides services");
        return "redirect:/page";
    }

    @RequestMapping(value = "/page")
    public String page(HttpServletResponse resp) {
        return "页面";
    }
}

