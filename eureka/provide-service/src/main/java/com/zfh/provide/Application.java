package com.zfh.provide;
/**
 * @author zhangfanghui
 * @since 2017/9/13
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Application {
/*************  访问地址：http://localhost:8888/user/dev  ****************/
/***************************************/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

