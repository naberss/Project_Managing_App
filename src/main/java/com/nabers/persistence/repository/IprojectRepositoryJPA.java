package com.nabers.persistence.repository;

import com.nabers.persistence.model.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface IprojectRepositoryJPA extends CrudRepository<Project,Long> {
    }



