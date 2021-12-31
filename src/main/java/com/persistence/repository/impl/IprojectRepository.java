package com.persistence.repository.impl;

import com.nabers.persistence.model.Project;

import java.util.Optional;


public interface IprojectRepository {

    Optional<Project> findByid(Long id);

    public Project save(Project project);


    }



