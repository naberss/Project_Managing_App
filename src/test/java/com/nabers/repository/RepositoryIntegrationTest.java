package com.nabers.repository;

import com.nabers.persistence.model.Project;
import com.nabers.persistence.repository.IprojectRepository;
import com.nabers.persistence.repository.IprojectRepositoryJPA;
import com.nabers.spring.TestConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.util.List;


@SpringBootTest
public class RepositoryIntegrationTest {

    @Autowired
    IprojectRepositoryJPA iprojectRepositoryJPA;


    static Project project;

    @Test
    @BeforeAll
    public static void load() {
        project = new Project(1l, "teste", LocalDate.now());
    }


    @Test
    public void InsertTest() {

        Project projectAux = iprojectRepositoryJPA.save(project);
        Assertions.assertNotNull(projectAux);
        Assertions.assertEquals(projectAux,project);
        System.out.println(projectAux);
    }

    @Test
    public void findAllTest() {
        List<Project> projects = (List<Project>) iprojectRepositoryJPA.findAll();
        projects.forEach(x -> System.out.println(x));
    }
}
