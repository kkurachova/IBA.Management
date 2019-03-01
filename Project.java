package by.iba.management.model.entity;

/**
 * Created by katya on 2/20/2019.
 */
public class Project {
    private static int counter = 0;
    protected static int projectId;
    private static String projectName;
    private static String projectDescription;
    private static int teamSize;
    private static String[] teamList = new String[teamSize];
    //int stackLength = 30;
    private static String[] projectStack = new String[stackLength]; // technologies key words for a new team member search functionality

    public Project{
        this.projectId = ++counter;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.teamSize = teamSize;
        this.teamList = teamList;
        this.projectStack = projectStack;

    }

    public static int getProjectId() {
        return projectId;
    }

    public static String getProjectName() {
        return projectName;
    }

    public static String getProjectDescription() {
        return projectDescription;
    }

    public static int getTeamSize() {
        return teamSize;
    }

    public static String[] getTeamList() {
        return teamList;
    }

    public static String[] getProjectStack() {
        return projectStack;
    }

    public static void setProjectName(String projectName) {
        Project.projectName = projectName;
    }

    public static void setProjectDescription(String projectDescription) {
        Project.projectDescription = projectDescription;
    }

    public static void setTeamList(String[] teamList) {
        Project.teamList = teamList;
    }

    public static void setProjectStack(String[] projectStack) {
        Project.projectStack = projectStack;
    }

    @Override
    public String toString() {
        return "Project{" + "projectId=" + projectId + ", projectName='" + projectName + ", projectDescription='" + projectDescription + '\'' +
                ", teamSize=" + teamSize + ", teamList=" + teamList + ", projectStack=" + projectStack + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (projectId != project.projectId) return false;
        if (projectName != project.projectName) return false;
        if (projectDescription != project.projectDescription) return false;
        if (teamSize != project.teamSize) return false;
        if (teamList != project.teamList) return false;
        if (projectStack != project.projectStack) return false;

        return false;
    }

    @Override
    public int hashCode() {
        int result = (int) (projectId ^ (projectId >>> 32));
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (projectDescription != null ? projectDescription.hashCode() : 0);
        result = 31 * result + (teamSize != null ? teamSize.hashCode() : 0); // ?
        result = 31 * result + (teamList != null ? teamList.hashCode() : 0);
        result = 31 * result + (projectStack != null ? projectStack.hashCode() : 0);

        return result;
    }

}

