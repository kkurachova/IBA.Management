package by.iba.management.model.logic;

import by.iba.management.model.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by katya on 2/20/2019.
 */
public class EditProject{
    public void editProjectName (Project project, String newProjectName) {
        project.setProjectName(newProjectName);
    }
    public void unassignEmployee(Employee employee, Project project){
        project.removeFromTeamList(employee);
        employee.setProjectId(0);
    }
    //assign Employee to a Project from a Project`s page
    public void assignEmployee(Employee employee, Project project) {
        project.addTeamList(employee);
        employee.setProjectId(project.getProjectId());
    }

    public void removeProject(Project project) {
        ProjectsRepository.getProjectList().remove(project);
    }
}
