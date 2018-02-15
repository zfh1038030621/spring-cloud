package com.zfh;
/**
 * @author zhangfanghui
 * @since 2017/9/13
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application {
/*************  Application访问地址：http://localhost:8888/user/dev  ****************/
/*************  Application访问地址：http://localhost:8888/user/dev  ****************/
/*************  Application访问地址：http://localhost:8888/user/dev  ****************/
    /***************************************/
    /***************************************/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

