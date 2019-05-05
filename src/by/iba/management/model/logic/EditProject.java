package by.iba.management.model.logic;

import by.iba.management.model.entity.Employee;
import by.iba.management.model.entity.Project;

import java.io.IOException;

public interface EditProject {
    void editProjectName(Project project, String newProjectName);
    void editProjectDescription(Project project, String newProjectDescription);
    void removeProject(Project project, long projectId) throws IOException;
}
