package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 远程调用的步骤
 * 1. 引入open-feign
 * 2. 编写接口，告诉spring cloud要调用远程服务
 *   声明接口的每个方法都是调用哪个远程服务的哪个请求
 * 3. 开启远程调用功能
 */

@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
