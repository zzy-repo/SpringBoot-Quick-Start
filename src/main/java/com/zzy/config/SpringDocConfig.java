package com.zzy.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI myOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("项目API")
                        .description("这是项目描述")
                        .version("v1.0.0"));
    }
}
