package com.service.impl;

import com.nabers.persistence.model.Project;
import com.persistence.repository.impl.IprojectRepository;
import com.service.IprojectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProjectServiceImpl implements IprojectService {

    @Autowired
    private IprojectRepository projectRepo;

    @Override
    public Optional<Project> findByid(Long id) {
        return projectRepo.findByid(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepo.save(project);
    }
}
