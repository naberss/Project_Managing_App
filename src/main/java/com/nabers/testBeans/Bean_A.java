package com.nabers.testBeans;

import com.nabers.testBeans.Interface.customBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Bean_A  {

    private static Logger log = LoggerFactory.getLogger(Bean_A.class);
    String foo;

    customBean customBean;

    public Bean_A(@Lazy @Qualifier("bean_B") customBean bean) {
        this.customBean = bean;
    }

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
