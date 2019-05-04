package by.iba.management.model.logic;

import by.iba.management.model.entity.Project;
import by.iba.management.model.entity.ProjectsRepository;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by katya on 2/20/2019.
 */
public interface FindProject {

    List<Project> findProjectById(long projectId);

    List<Project> findProjectByName(String projectName);
}


