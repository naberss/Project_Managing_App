package com.nabers.service.impl;

import com.nabers.persistence.model.Project;
import com.nabers.persistence.repository.IprojectRepository;
import com.nabers.service.IprojectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectServiceImpl implements IprojectService {

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
