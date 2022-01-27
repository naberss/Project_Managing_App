package com.nabers.spring;

import com.nabers.persistence.repository.IprojectRepository;
import com.nabers.persistence.repository.impl.ProjectRepositoryImpl;
import com.nabers.service.IprojectService;
import com.nabers.service.impl.ProjectServiceImplSetterInjection;
import com.nabers.testBeans.Bean_A;
import com.nabers.testBeans.Bean_B;
import com.nabers.testBeans.Bean_C;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

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

}
