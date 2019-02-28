package Project.model.logic;

import Project.model.entity.Project;
import Project.model.entity.ProjectsRepository;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by katya on 2/20/2019.
 */
public class EditProject {
    private static String new_projectName;
    private static String new_projectDescription;
    //int stackLength = 30;
    private static String[] new_projectStack = new String[stackLength]; // technologies key words for a new team member search functionality

    public EditProject(String new_projectName, String new_projectDescription, String[] new_projectStack) {
        this.new_projectName = new_projectName;
        this.new_projectDescription = new_projectDescription;
        this.new_projectStack = new_projectStack;
    }


    public static String getNew_projectName() {
        return new_projectName;
    }

    public static String getNew_projectDescription() {
        return new_projectDescription;
    }

    public static String[] getNew_projectStack() {
        return new_projectStack;
    }

    public static String editProjectName() {
        ProjectsRepository.getProjectList().get(Project.getProjectName()).setProjectName(new_projectName);
        return new_projectName;
    }

    public static String editProjectDescription() {
        ProjectsRepository.getProjectList().get(Project.getProjectDescription()).setProjectDescription(new_projectDescription);
        return new_projectDescription;
    }

    public static String[] editProjectName() {
        ProjectsRepository.getProjectList().get(Project.getProjectStack()).setProjectStack(new_projectStack);
        return new_projectStack;
    }

    public static void assignProject() {

    }

    public static void unassignProject() {

    }

    public static void reassignProject() {

    }

    public static void removeProject() {

    }

}