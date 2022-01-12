package com.nabers.service;

import com.nabers.persistence.model.Project;

import java.util.Optional;

public interface IprojectService {

    Optional<Project> findByid(Long id);

    public Project save(Project project);
}
