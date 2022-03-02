package com.nabers.testBeans;

import com.nabers.testBeans.Interface.customBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@PropertySource("classpath:application.properties")
@Profile("PROD")
public class Bean_A {

    private static Logger log = LoggerFactory.getLogger(Bean_A.class);
    String foo;

    @Value("${project.prefixx}")
    private String prefix;

    @Value("${project.suffix}")
    private String suffix;

    @Autowired
    private Environment environment;

    customBean customBean;

    public Bean_A(@Lazy @Qualifier("bean_B") customBean bean) {
        this.customBean = bean;
    }

    public Bean_A() {

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
        log.info("value of property foo is: {}", this.foo);
        log.info(prefix);
        log.info(suffix);
        log.info(environment.getProperty("project.triffix"));
        log.info("Default profiles: ", environment.getDefaultProfiles());
        log.info("Default profiles: ", environment.getActiveProfiles());
    }

}
