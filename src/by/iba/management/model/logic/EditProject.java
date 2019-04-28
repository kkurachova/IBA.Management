package by.iba.management.model.logic;

import by.iba.management.model.entity.Project;
import by.iba.management.model.entity.ProjectsRepository;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by katya on 2/20/2019.
 */
public class FindProject {
    private FindProject () {}

    public static List<Project> findProjectById (long projectId) {
        List<Project> listResult = new ArrayList<>();
        for (Project p : ProjectsRepository.getProjectList()) {
            if (p.getProjectId() == projectId) {
                listResult.add(p);
            }
        }
        return listResult;
    }

    public static List<Project> findProject_byProjectName (String projectName) {
        List<Project> listResult = new ArrayList<>();
        for (Project p : ProjectsRepository.getProjectList()) {
            if (p.getProjectName().equals(projectName)) {
                listResult.add(p);
            }
        }
        return listResult;
    }

    public static List<Project> findProject_byProjectDescription (String ProjectDescription) {
        List<Project> listResult = new ArrayList<>();
        for (Project p : ProjectsRepository.getProjectList()) {
            if (p.getProjectDescription().equals(ProjectDescription)) {
                listResult.add(p);
            }
        }
        return listResult;
    }
}


