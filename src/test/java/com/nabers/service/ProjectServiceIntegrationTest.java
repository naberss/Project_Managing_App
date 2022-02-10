package com.nabers.service;

import com.nabers.persistence.model.Project;
import com.nabers.spring.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


import java.time.LocalDate;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringJUnitConfig(value = TestConfig.class)
@ActiveProfiles("PROD")
@TestPropertySource(locations = "classpath:application-Test.properties")
public class ProjectServiceIntegrationTest {

    @Value("${project.teste}")
    String teste;

    @Autowired
    IprojectService iprojectService;

    Project project = new Project(1l, "lucas", LocalDate.of(2020, 1, 8));

    @Test
    public void SaveTest() {
        System.out.println(teste+" dfsdfdsfsdfdsf");
        Project P = iprojectService.save(project);
        assertThat(P,is(notNullValue(Project.class)));
    }

    @Test
    public void FindByIdTest() {
        Optional<Project> P = iprojectService.findByid(project.getId());
        assertThat(P,is(Optional.of(project)));
    }


}
