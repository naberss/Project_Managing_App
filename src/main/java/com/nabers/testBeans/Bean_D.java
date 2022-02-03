package com.nabers.testBeans;

import com.nabers.testBeans.Interface.customBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Bean_D implements customBean {

    private static Logger log = LoggerFactory.getLogger(Bean_D.class);
    String foo;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    @Override
    public void preDestroy() {

    }

    @Override
    public void initialize() {

    }
}
