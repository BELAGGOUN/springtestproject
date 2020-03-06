package ca.gc.esdc.springtestproject.services;

import ca.gc.esdc.springtestproject.Repository.ProjectRepository;
import ca.gc.esdc.springtestproject.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public Object add(Project project) {

        return projectRepository.save(project);

    }
}
