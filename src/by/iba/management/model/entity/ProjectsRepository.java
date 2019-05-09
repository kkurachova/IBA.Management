package by.iba.management.model.entity;

import by.iba.management.util.DataParserProjects;
import by.iba.management.util.DataReaderProjects;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by katya on 2/28/2019.
 */
public class ProjectsRepository {
    private static ArrayList<Project> projectsList = new ArrayList<>();
    //private static final Logger logger = LogManager.getRootLogger();
    private ProjectsRepository() {
        try {
        projectsList = DataParserProjects.parseStringToCreateProject(DataReaderProjects.readFile());
    } catch (IOException e) {
        //logger.error("Error reading file: ", e);
    }
    }

    public static ArrayList<Project> getProjectList () {
        return projectsList;
    }
}