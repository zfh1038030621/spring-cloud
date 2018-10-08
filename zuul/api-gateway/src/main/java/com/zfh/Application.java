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
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
/*支持网关路由*/
/* 老版本的是用注解EnableZuulServer，而EnableZuulProxy注解則是增强版的，在之前的基础上又增加了一些过滤器*/
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

    @Component
    @Primary
    class DocumentationConfig implements SwaggerResourcesProvider {
        @Override
        public List<SwaggerResource> get() {
            List resources = new ArrayList<>();
            resources.add(swaggerResource("service-a", "/swagger-service-a/v2/api-docs", "2.0"));
            resources.add(swaggerResource("service-b", "/swagger-service-b/v2/api-docs", "2.0"));
            return resources;
        }

        private SwaggerResource swaggerResource(String name, String location, String version) {
            SwaggerResource swaggerResource = new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }
    }

}

