package com.nabers.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bean_B {

    private static Logger log = LoggerFactory.getLogger(Bean_B.class);

    public void initialize() {
        log.info("Parameter initMethod being called once Bean_B is initialized");
    }
}
