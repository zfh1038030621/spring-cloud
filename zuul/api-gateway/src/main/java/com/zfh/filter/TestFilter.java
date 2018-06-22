package com.zfh.filter;

import com.netflix.zuul.ZuulFilter;

public class TestFilter extends ZuulFilter{
    @Override
    public String filterType() {
        //过滤器类型 决定在什么时候去执行,pre代表在请求到达路由之前就被执行
        //“pre”，“route”和“post”等阶段
        return "pre";
    }

    @Override
    public int filterOrder() {
        //过滤器执行的顺序，都存在多个过滤器的时候需要该值去依次执行
        //优先级为0，数字越大，优先级越低
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //判断是否过滤
        return true;
    }

    @Override
    public Object run() {
        //过滤器具体逻辑
        return null;
    }
}
