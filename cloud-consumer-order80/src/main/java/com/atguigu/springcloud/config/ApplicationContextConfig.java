package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {



    @Bean
    @LoadBalanced//开启负载均衡，如果RPC时，不使用确定的地址和端口，而是使用注册中心的项目名，必须开启这玩意
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
