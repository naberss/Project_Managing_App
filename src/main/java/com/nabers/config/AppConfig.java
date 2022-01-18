package com.nabers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Bean_A beanA() {
        return new Bean_A();
    }

    @Bean(initMethod = "initialize")
    public Bean_B beanB() {
        return new Bean_B();
    }

    @Bean(destroyMethod = "preDestroy")
    public Bean_C beanC() {
        return new Bean_C();
    }


}
