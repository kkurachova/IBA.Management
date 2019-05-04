package by.iba.management.model.logic.impl;

import by.iba.management.model.entity.Project;
import by.iba.management.model.entity.ProjectsRepository;
import by.iba.management.model.logic.FindProject;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by katya on 2/20/2019.
 */
public class FindProjectImpl implements FindProject {
    private FindProjectImpl() {}

    public List<Project> findProjectById (long projectId) {
        List<Project> listResult = new ArrayList<>();
        for (Project p : ProjectsRepository.getProjectList()) {
            if (p.getProjectId() == projectId) {
                listResult.add(p);
            }
        }
        return listResult;
    }
    public List<Project> findProjectByName (String projectName) {
        List<Project> listResult = new ArrayList<>();
        for (Project p : ProjectsRepository.getProjectList()) {
            if (p.getProjectName().equals(projectName)) {
                listResult.add(p);
            }
        }
        return listResult;
    }
}


