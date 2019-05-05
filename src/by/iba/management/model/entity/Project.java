package by.iba.management.model.entity;

import by.iba.management.util.ProjectIdGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by katya on 2/20/2019.
 */
public class Project {
    private long projectId;
    private String projectName;
    private String projectDescription;

    public Project(long projectId, String projectName, String projectDescription) {
        this.projectId = ProjectIdGenerator.getProjectId();
        this.projectName = projectName;
        this.projectDescription = projectDescription;
    }

    public Project() {
    }

    public long getProjectId() {
        return projectId;
    }
    public String getProjectName() {
        return projectName;
    }
    public String getProjectDescription() {
        return projectDescription;
    }
    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    @Override
    public String toString() {
        return "Project{" +
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
        return getProjectId() == project.getProjectId() &&
                getProjectName().equals(project.getProjectName()) &&
                Objects.equals(getProjectDescription(), project.getProjectDescription());
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(getProjectId(), getProjectName(), getProjectDescription());
        result = 31 * result;
        return result;
    }
}

