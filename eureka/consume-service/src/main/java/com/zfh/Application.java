package com.zfh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangfanghui
 * @since 2017/9/13
 */

@EnableDiscoveryClient  //激活eureka中的DiscoveryClient实现
@SpringBootApplication
public class Application {
/*************  访问地址：http://localhost:8888/user/dev  ****************/
/***************************************/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}

