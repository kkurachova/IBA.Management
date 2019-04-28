package by.iba.management.model.logic;

import by.iba.management.model.entity.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by katya on 2/20/2019.
 */
public class EditProject{
    private String new_projectName;
    private String new_projectDescription;

    public EditProject(String new_projectName, String new_projectDescription) {
        this.new_projectName = new_projectName;
        this.new_projectDescription = new_projectDescription;
    }
    public EditProject() {}

    public String getNew_projectName() {
        return new_projectName;
    }
    public void setNew_projectName(String new_projectName) {
        this.new_projectName = new_projectName;
    }

    public String getNew_projectDescription() {
        return new_projectDescription;
    }
    public void setNew_projectDescription(String new_projectDescription) {
        this.new_projectDescription = new_projectDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EditProject)) return false;
        EditProject that = (EditProject) o;
        return getNew_projectName().equals(that.getNew_projectName()) &&
                getNew_projectDescription().equals(that.getNew_projectDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNew_projectName(), getNew_projectDescription());
    }

    //assign Employee to a Project from a Project`s page
    public List<Employee> assignEmployee(Employee employee) {
        List<Employee> searchResult = FindEmployee.findEmployeeByEmployeeId(employee.getEmployeeId());
        List<Employee> targetEmployee;
        //filter the Employees list and store the result into another list
        // so that we have the original and a modified version of the same list:
        targetEmployee = searchResult.stream().collect(Collectors.toList());

        return targetEmployee;
    }

    public List<Employee> unassignEmployee(Employee employee){
        List<Employee> updatedTeamList = ProjectTeamRepository.getTeamList().remove(employee);

        return updatedTeamList;
    }

    public void removeProject(Project project) {
        ProjectsRepository.getProjectList().remove(project);
    }
}
