package com;

import com.nabers.persistence.model.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProjectRepositoryImpl implements IprojectRepository{

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




}

