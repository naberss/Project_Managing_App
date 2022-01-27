package com.nabers.service.impl;

import com.nabers.persistence.model.Project;
import com.nabers.persistence.repository.IprojectRepository;
import com.nabers.service.IprojectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements IprojectService {

    @Autowired
    private IprojectRepository projectRepo;

    /*@Autowired
    private IprojectRepository projectRepo2;*/


    //Injection via constructor
    public ProjectServiceImpl(IprojectRepository projectRepository) {
        this.projectRepo = projectRepository;
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



