package com.nabers.testBeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public class Bean_A {

    private static Logger log = LoggerFactory.getLogger(Bean_A.class);

    @PostConstruct
    public void post(){
        log.info("@PostConstruct being called on this method once, when Bean_A is initialized");
    }

}
