package by.iba.management.model.logic.impl;

import by.iba.management.model.entity.Employee;
import by.iba.management.model.entity.EmployeesRepository;
import by.iba.management.model.entity.Project;
import by.iba.management.model.entity.ProjectsRepository;
import by.iba.management.model.logic.EditProject;

import java.util.ArrayList;
import java.util.List;

public class EditProjectImpl implements EditProject {
    @Override
    public void editProjectName (Project project, String newProjectName) {
        project.setProjectName(newProjectName);
    }
    @Override
    public void editProjectDescription (Project project, String newProjectDescription) {
        project.setProjectDescription(newProjectDescription);
    }

    //unassign Employee to a Project from a Project`s page
    @Override
    public void unassignEmployee(Employee employee, Project project){
        project.removeFromTeamList(employee);
        employee.setProjectId(0);
    }

    //assign Employee to a Project from a Project`s page
    @Override
    public void assignEmployee(Employee employee, Project project) {
        project.addTeamList(employee);
        employee.setProjectId(project.getProjectId());
    }
    @Override
    public void removeProject(Project project, long projectId) {
        //remove projectId from all assigned employees:
        List<Employee> teamList = new ArrayList<>();
        for (Employee e : EmployeesRepository.getEmployeesList()) {
            if (e.getProjectId() == projectId) {
                e.setProjectId(0);
            }
        }
        //now remove the project:
        ProjectsRepository.getProjectList().remove(project);
    }
}
