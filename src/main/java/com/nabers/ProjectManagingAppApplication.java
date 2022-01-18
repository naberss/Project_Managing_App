package com.nabers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectManagingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectManagingAppApplication.class, args);

        /*//Emulando a fase de destruição de beans vide destruição do container ApplicationContext
        ConfigurableApplicationContext context = SpringApplication.run(new Class[]{ProjectManagingAppApplication.class, AppConfig.class}, args);
        context.close();*/
    }

}