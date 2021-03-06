package com.consumer;

import myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-CY-DEPT",configuration = MySelfRule.class)
public class DeptConsumer_APP {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_APP.class,args);
    }
}
