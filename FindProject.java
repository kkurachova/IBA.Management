package Project.model.logic;

import Project.model.entity.Project;
import Project.model.entity.ProjectsRepository;

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

    public static List<Project> findEmployeeByName (String firstName, String lastName) {
        List<Project> listResult = new ArrayList<>();
        for (Project p : ProjectsRepository.getProjectList()) {
            if (p.getProjectName(projectName).equals(projectName)) {
                listResult.add(p);
            }
        }
        return listResult;
    }
}


