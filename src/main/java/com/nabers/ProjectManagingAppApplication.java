package com.nabers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.Annotation;

@SpringBootApplication
public class ProjectManagingAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProjectManagingAppApplication.class, args);
        System.out.println("hello world");
        /*//Emulando a fase de destruição de beans vide destruição do container ApplicationContext
        ConfigurableApplicationContext context = SpringApplication.run(new Class[]{ProjectManagingAppApplication.class, AppConfig.class}, args);
        context.close();*/
    }

    @Override
    @Order(value = 0)
    public void run(String... args) throws Exception {
        for(String node: args){
            System.out.println(node+" hello");
        }
        System.out.println("wasup");

    }
}
