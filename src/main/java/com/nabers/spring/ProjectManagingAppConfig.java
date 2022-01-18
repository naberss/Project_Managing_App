package com.nabers.spring;

import com.nabers.service.IprojectService;
import com.nabers.service.impl.ProjectServiceImplSetterInjection;
import com.nabers.testBeans.Bean_A;
import com.nabers.testBeans.Bean_B;
import com.nabers.testBeans.Bean_C;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectManagingAppConfig {

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

    @Bean
    public IprojectService projectServiceImplSetterInjection() {
        return new ProjectServiceImplSetterInjection();
    }


}
