package by.iba.management.util;

public class ProjectIdGenerator {
    private static long ProjectId = 0;
    public static long getProjectId() {
        return ++ProjectId;
    }
}
