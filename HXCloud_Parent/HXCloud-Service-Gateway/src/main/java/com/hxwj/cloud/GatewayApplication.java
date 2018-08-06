package com.hxwj.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class GatewayApplication {

	//访问方式前面加上：yml中写的配置路径  http://127.0.0.1:8769/api/service/queryUser?params=mjmkm
	//前面加上消费者的请求路径（不然会报错 404）
	public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args );
    }
}