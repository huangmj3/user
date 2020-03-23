package com.huangmaojie.duomall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huangmaojie
 * @date 2020.2.26
 */
@EnableHystrix
@EnableZuulProxy
@EnableFeignClients
@EnableDiscoveryClient
//@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.huangmaojie.duomall.user.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("---------------------END---------------------");
    }

}