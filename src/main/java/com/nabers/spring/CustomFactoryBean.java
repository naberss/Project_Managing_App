package com.nabers.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomFactoryBean implements FactoryBean {

    Logger log = LoggerFactory.getLogger(CustomFactoryBean.class);

    @Override
    public Object getObject() throws Exception {
        ConfigurableListableBeanFactory beanFactory;
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
