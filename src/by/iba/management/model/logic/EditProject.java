package by.iba.management.model.logic;

import by.iba.management.model.entity.Project;
import by.iba.management.model.entity.ProjectsRepository;

/**
 * Created by katya on 2/20/2019.
 */
public class EditProject {
    private static String new_projectName;
    private static String new_projectDescription;
    int stackLength = 30;
    private String[] new_projectStack = new String[stackLength]; // technologies key words for a new team member search functionality

    public EditProject(String new_projectName, String new_projectDescription, String[] new_projectStack) {
        this.new_projectName = new_projectName;
        this.new_projectDescription = new_projectDescription;
        this.new_projectStack = new_projectStack;
    }


    public String getNew_projectName() {
        return new_projectName;
    }

    public String getNew_projectDescription() {
        return new_projectDescription;
    }

    public String[] getNew_projectStack() {
        return new_projectStack;
    }

    public String editProjectName() {
        ProjectsRepository.getProjectList().get(Project.getProjectName()).setProjectName(new_projectName);
        return new_projectName;
    }

    public String editProjectDescription() {
        ProjectsRepository.getProjectList().get(Project.getProjectDescription()).setProjectDescription(new_projectDescription);
        return new_projectDescription;
    }

    public String[] editProjectName() {
        ProjectsRepository.getProjectList().get(Project.getProjectStack()).setProjectStack(new_projectStack);
        return new_projectStack;
    }

    public void assignProject() {

    }

    public void unassignProject() {

    }

    public void reassignProject() {

    }

    public void removeProject() {

    }

}