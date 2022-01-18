package com.nabers.testBeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PreDestroy;

public class Bean_C {

    private static Logger log = LoggerFactory.getLogger(Bean_C.class);

    @PreDestroy
    public void preDestroy() {
        log.info("@preDestroy annotated method is called");
    }

    @PreDestroy
    public void destroy() {
        log.info("DestroyMethod annotation parameter is called in config class");
    }

}
