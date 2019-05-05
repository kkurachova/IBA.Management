package by.iba.management.model.entity;

import by.iba.management.util.DataParser_Projects;
import by.iba.management.util.DataReader_Projects;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by katya on 2/28/2019.
 */
public class ProjectsRepository {
    private static ArrayList<Project> projectsList = new ArrayList<>();
    private static final Logger logger = LogManager.getRootLogger();
    private ProjectsRepository() {
    }

    public static ArrayList<Project> getProjectList () {
        try {
            projectsList = DataParser_Projects.parseStringToCreateProject(DataReader_Projects.readFile());
        } catch (IOException e) {
            logger.error("Error reading file: ", e);
        }
        return projectsList;
    }
}
