package by.iba.management.model.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by katya on 2/20/2019.
 */
public class Project {
    private int counter = 0;
    private int projectId;
    private String projectName;
    private String projectDescription;
    private ArrayList<Employee> teamList = new ArrayList<>();

    public Project(int counter, int projectId, String projectName, String projectDescription,
                   int stackLength, String[] projectStack) {
        this.counter = counter;
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
    }

    public Project() {}

    public int getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public int getCounter() {
        return counter;
    }


    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }


    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public ArrayList<Employee> getTeamList() {
        return teamList;
    }

    public void addTeamList(Employee employee) {
        teamList.add(employee);
    }

    public void removeFromTeamList(Employee employee) {
        teamList.remove(employee);
    }

    @Override
    public String toString() {
        return "Project{" +
                "counter=" + counter +
                ", projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;
        Project project = (Project) o;
        return getCounter() == project.getCounter() &&
                getProjectId() == project.getProjectId() &&
                getProjectName().equals(project.getProjectName()) &&
                Objects.equals(getProjectDescription(), project.getProjectDescription());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getCounter(), getProjectId(), getProjectName(), getProjectDescription());
        result = 31 * result;
        return result;
    }
}

