package com.nabers.testBeans;

import com.nabers.testBeans.Interface.customBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Bean_C implements customBean {

    private static Logger log = LoggerFactory.getLogger(Bean_C.class);

    Bean_B bean_b;

    public Bean_C(Bean_B bean_b) {
        this.bean_b = bean_b;
    }

    @PreDestroy
    public void preDestroy() {
        log.info("@preDestroy annotated method is called");
    }

    @Override
    public void initialize() {

    }

    @PreDestroy
    public void destroy() {
        log.info("DestroyMethod annotation parameter is called in config class");
    }

}
