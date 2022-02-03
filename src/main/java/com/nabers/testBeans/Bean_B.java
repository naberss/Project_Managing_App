package com.nabers.testBeans;

import com.nabers.testBeans.Interface.customBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Bean_B implements customBean {

    private static Logger log = LoggerFactory.getLogger(Bean_B.class);


    Bean_C bean_c;

    public Bean_B(@Lazy Bean_C bean_c) {
        this.bean_c = bean_c;
    }

    public void initialize() {
        log.info("Parameter initMethod being called once Bean_B is initialized");
    }

    @Override
    public void preDestroy() {
    }
}
