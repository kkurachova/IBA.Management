package by.iba.management.util;

import by.iba.management.model.entity.ProjectsRepository;

public class ProjectIdGenerator {
    private static long projectId = ProjectsRepository.getProjectList().size();
    public static long getProjectId() {
        return ++projectId;
    }
}