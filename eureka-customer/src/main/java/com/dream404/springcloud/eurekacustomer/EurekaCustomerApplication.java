package com.dream404.springcloud.eurekacustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@EnableDiscoveryClient 	//开启服务发现能力
@SpringBootApplication
public class EurekaCustomerApplication {

    @Bean //定义REST客户端，RestTemplate实例
    @LoadBalanced //开启负债均衡的能力
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
	public static void main(String[] args) {
		SpringApplication.run(EurekaCustomerApplication.class, args);
	}
}
