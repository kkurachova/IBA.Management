package by.iba.management.model.entity;


import java.util.ArrayList;

/**
 * Created by katya on 2/28/2019.
 */
public class ProjectsRepository {
    private static ArrayList<Project> ProjectList = new ArrayList<Project>();

    private ProjectsRepository() {
    }

    public static ArrayList<Project> getProjectList () {
        ArrayList<Project> temp = ProjectList;
        return temp;
    }

}
