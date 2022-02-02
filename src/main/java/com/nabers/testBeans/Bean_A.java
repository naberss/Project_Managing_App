package com.nabers.testBeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public class Bean_A {

    private static Logger log = LoggerFactory.getLogger(Bean_A.class);
    String foo;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    @PostConstruct
    public void post() {
        log.info("@PostConstruct being called on this method once, when Bean_A is initialized");
        log.info("value of property foo is: {}",this.foo);
    }

}
