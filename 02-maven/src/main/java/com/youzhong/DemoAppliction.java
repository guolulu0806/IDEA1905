package com.youzhong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描mapper接口所在的包
@MapperScan(basePackages = "com.youzhong.dao")
public class DemoAppliction {

    public static void main(String[] args) {
        SpringApplication.run(DemoAppliction.class,args);
    }

}
