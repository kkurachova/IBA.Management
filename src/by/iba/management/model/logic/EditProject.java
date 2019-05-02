package by.iba.management.model.logic;
import by.iba.management.model.entity.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by katya on 2/20/2019.
 */

public class EditProject{
    public void editProjectName (Project project, String newProjectName) {
        project.setProjectName(newProjectName);
    }

    public void editProjectDescription (Project project, String newProjectDescription) {
        project.setProjectDescription(newProjectDescription);
    }

    //unassign Employee to a Project from a Project`s page
    public void unassignEmployee(Employee employee, Project project){
        project.removeFromTeamList(employee);
        employee.setProjectId(0);
    }

    //assign Employee to a Project from a Project`s page
    public void assignEmployee(Employee employee, Project project) {
        project.addTeamList(employee);
        employee.setProjectId(project.getProjectId());
    }

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
