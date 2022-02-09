package com.nabers.service.impl;

import com.nabers.persistence.model.Project;
import com.nabers.persistence.repository.IprojectRepository;
import com.nabers.service.IprojectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
@Primary
public class ProjectServiceImpl implements IprojectService, ApplicationContextAware {

    private IprojectRepository projectRepo;

    Logger log = LoggerFactory.getLogger(ProjectServiceImpl.class);

    /*@Autowired
    private IprojectRepository projectRepo2;*/

    //Injection via constructor
    public ProjectServiceImpl(@Qualifier("ProjectRepositoryImplSing") IprojectRepository projectRepository) {
        this.projectRepo = projectRepository;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("Context wih ID: {}", applicationContext.getId());
    }

    @Override
    public Optional<Project> findByid(Long id) {
        return projectRepo.findByid(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepo.save(project);
    }

    @PostConstruct
    public void after() {

    }
}



