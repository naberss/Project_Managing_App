package com.nabers.service;

import com.nabers.persistence.model.Project;
import com.nabers.persistence.repository.IprojectRepository;
import com.nabers.persistence.repository.impl.ProjectRepositoryImpl;
import com.nabers.service.impl.ProjectServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@TestPropertySource(locations = "classpath:applicationn.properties")
public class ProjectServiceUnitTest {

    private ProjectRepositoryImpl iprojectRepository = new ProjectRepositoryImpl();

    @Mock
    private ProjectServiceImpl projectService = new ProjectServiceImpl(iprojectRepository);

    /*@BeforeEach
    public void initMocks() {
        MockitoAnnotations.openMocks(this);
    }*/

    @Test
    public void save() {
        Project project = new Project(1l, "lucas", LocalDate.of(2020, 1, 8));
        when(projectService.save(project)).thenReturn(project);

        Project P = projectService.save(project);
        assertNotNull(P);
    }

}
