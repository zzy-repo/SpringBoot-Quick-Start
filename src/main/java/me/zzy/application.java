package me.zzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("me.zzy.mapper")
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }
}
