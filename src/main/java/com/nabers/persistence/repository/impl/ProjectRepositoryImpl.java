package com.nabers.persistence.repository.impl;

import com.nabers.persistence.model.Project;
import com.nabers.persistence.repository.IprojectRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Primary
@Repository
@Profile("PROD")
public class ProjectRepositoryImpl implements IprojectRepository, CommandLineRunner  {

    List<Project> projects = new ArrayList<>();

    @Override
    public Optional<Project> findByid(Long id) {
        return projects.stream().filter(x -> x.getId().equals(id)).findFirst();
    }


    @Override
    public Project save(Project project){

        Project existingProject = findByid(project.getId()).orElse(null);

        if(existingProject == null){
            projects.add(project);
        }
        else if(!existingProject.equals(project)){
            projects.remove(existingProject);
            Project newProject = new Project(project);
            projects.add(project);
        }

        return project;
    }


    @Override
    @Order(value = 1)
    public void run(String... args) throws Exception {
        System.out.println("running fast as fuck");
    }
}
