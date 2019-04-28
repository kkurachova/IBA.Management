package by.iba.management.model.entity;

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
    int stackLength = 30;
    private String[] projectStack = new String[stackLength]; // technologies key words for a new team member search functionality

    public Project(int counter, int projectId, String projectName, String projectDescription,
                   String[] teamList, int stackLength, String[] projectStack) {
        this.counter = counter;
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.stackLength = stackLength;
        this.projectStack = projectStack;
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

    public String[] getProjectStack() {
        return projectStack;
    }

    public int getCounter() {
        return counter;
    }

    public int getStackLength() {
        return stackLength;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

   public void setStackLength(int stackLength) {
        this.stackLength = stackLength;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public void setProjectStack(String[] projectStack) {
        this.projectStack = projectStack;
    }

    @Override
    public String toString() {
        return "Project{" +
                "counter=" + counter +
                ", projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", stackLength=" + stackLength +
                ", projectStack=" + Arrays.toString(projectStack) +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;
        Project project = (Project) o;
        return getCounter() == project.getCounter() &&
                getProjectId() == project.getProjectId() &&
                getStackLength() == project.getStackLength() &&
                getProjectName().equals(project.getProjectName()) &&
                Objects.equals(getProjectDescription(), project.getProjectDescription()) &&
                Arrays.equals(getProjectStack(), project.getProjectStack());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getCounter(), getProjectId(), getProjectName(), getProjectDescription(), getStackLength());
        result = 31 * result + Arrays.hashCode(getProjectStack());
        return result;
    }
}

