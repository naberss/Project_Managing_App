package com.nabers.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ccs implements HealthIndicator {

    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        if(isDbDown()){
            return Health.down().withDetail("Error Code", 503).build();
            //return Health.up().withDetail("Status Code",204).build();
        } else {
            return Health.up().withDetail("Status Code",204).build();
            //return Health.down().withDetail("Error Code", 503).build();
        }
    }

    private boolean isDbDown() {
        return false;
    }
}
