package com.zfh.springcloud.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author zhangfanghui
 * @since 2017/9/13
 */
@SpringBootApplication
@EnableConfigServer
public class Application {
/*************  访问地址：http://localhost:8888/user/dev  ****************/
/***************************************/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

