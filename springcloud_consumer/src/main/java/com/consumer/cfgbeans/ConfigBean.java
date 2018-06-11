package com.consumer.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced       //spring cloud ribbon 是基于Netflix Ribbon实现的一套客户端的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
