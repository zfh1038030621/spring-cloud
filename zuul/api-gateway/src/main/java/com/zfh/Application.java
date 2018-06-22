package com.zfh;
/**
 * @author zhangfanghui
 * @since 2017/9/13
 */

import com.zfh.filter.TestFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
/*支持网关路由*/
@EnableZuulProxy
@EnableEurekaClient
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    public TestFilter testFilter(){
        return  new TestFilter();
    }
}

