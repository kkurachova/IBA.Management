package by.iba.management.model.logic;

import by.iba.management.model.entity.Employee;
import by.iba.management.model.entity.Project;

public interface EditProject {
    void editProjectName(Project project, String newProjectName);
    void editProjectDescription(Project project, String newProjectDescription);
    void unassignEmployee(Employee employee, Project project);
    void assignEmployee(Employee employee, Project project);
    void removeProject(Project project, long projectId);
}