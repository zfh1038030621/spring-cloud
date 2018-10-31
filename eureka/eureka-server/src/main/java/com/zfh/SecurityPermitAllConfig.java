package com.zfh;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 开放所有请求，能让admin2.0能访问一些监控端口
 */


@Configuration
@EnableWebSecurity
public  class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       // http.authorizeRequests().anyRequest().authenticated()
       /* http.authorizeRequests().antMatchers("/actuator/**").permitAll().anyRequest().authenticated()
                .and().formLogin()
                .and().csrf().disable();*/

        http.authorizeRequests().anyRequest().permitAll()
                .and().csrf().disable();
    }
}

