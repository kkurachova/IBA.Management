package by.iba.management.util;

import java.io.IOException;

public class ProjectIdGenerator {
    private static long projectId;

    static {
        try {
            projectId = LastProjectId.getLastProjectId();

        } catch (IOException e) {
            //logger.error("File error or IO error: ", e);
        }
    }

    public static String getProjectId() {
        return String.valueOf(projectId++);
    }
}