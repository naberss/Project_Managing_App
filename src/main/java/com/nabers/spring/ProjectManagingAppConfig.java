package com.nabers.spring;

import com.nabers.persistence.repository.IprojectRepository;
import com.nabers.persistence.repository.impl.ProjectRepositoryImpl;
import com.nabers.service.IprojectService;
import com.nabers.service.impl.ProjectServiceImplSetterInjection;
import com.nabers.testBeans.Bean_A;
import com.nabers.testBeans.Bean_B;
import com.nabers.testBeans.Bean_C;
import com.nabers.testBeans.Interface.customBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectManagingAppConfig {

    @Bean
    public IprojectService projectServiceImplSetterInjection() {
        return new ProjectServiceImplSetterInjection();
    }

    @Bean
    /*@Scope("prototype")*/
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public IprojectRepository ProjectRepositoryImplProt() {
        return new ProjectRepositoryImpl();
    }

    @Bean
    /*@Scope("singleton")*/
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public IprojectRepository ProjectRepositoryImplSing() {
        return new ProjectRepositoryImpl();
    }

    @Bean(initMethod = "initialize")
    public static CustomBeanPostProcessor_1 customBeanPostProcessor_1(){
        return new CustomBeanPostProcessor_1();
    }

    @Bean(initMethod = "initialize")
    public static CustomBeanPostProcessor_2 customBeanPostProcessor_2(){
        return new CustomBeanPostProcessor_2();
    }

}
