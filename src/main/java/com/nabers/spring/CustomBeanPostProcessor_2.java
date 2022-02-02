package com.nabers.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

import javax.annotation.PostConstruct;

public class CustomBeanPostProcessor_2 implements BeanPostProcessor, Ordered {
    private static Logger log = LoggerFactory.getLogger(CustomBeanPostProcessor_1.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("Before init: {}", beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("After init: {}", beanName);
        return bean;
    }

    public void initialize() {
        log.info("Initialize");
    }

    @PostConstruct
    public void postConstruct() {
        log.info("post-Construct");
    }


    @Override
    public int getOrder() {
        return 1;
    }
}
