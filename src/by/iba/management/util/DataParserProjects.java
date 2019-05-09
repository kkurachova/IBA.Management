package by.iba.management.util;

import by.iba.management.model.entity.*;

import java.util.ArrayList;

public class DataParserProjects {
    private static final String REGEX_SPACE = "\\s";
    public static ArrayList<Project> parseStringToCreateProject(ArrayList<String> list) {
        ArrayList<Project> projectsList = new ArrayList<>();
        DataValidatorProjects validator = new DataValidatorProjects();
        for (String str: list) {
            if (validator.validate(str)) {
                String[] s = str.split(REGEX_SPACE);
                Project project = new Project(s[0], s[1], s[2]);
                projectsList.add(project);
            }
        }
        return projectsList;
    }
}