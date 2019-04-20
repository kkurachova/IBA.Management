package by.iba.management.model.entity;

/**
 * Created by katya on 2/20/2019.
 */
public class Project {
    private static int counter = 0;
    protected static int projectId;
    private String projectName;
    private String projectDescription;
    private int teamSize;
    private String[] teamList = new String[teamSize];
    int stackLength = 30;
    private String[] projectStack = new String[stackLength]; // technologies key words for a new team member search functionality

    public Project(){
        this.projectId = ++counter;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.teamSize = teamSize;
        this.teamList = teamList;
        this.projectStack = projectStack;

    }

    public int getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public String[] getTeamList() {
        return teamList;
    }

    public String[] getProjectStack() {
        return projectStack;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public void setTeamList(String[] teamList) {
        this.teamList = teamList;
    }

    public void setProjectStack(String[] projectStack) {
        this.projectStack = projectStack;
    }

    @Override
    public String toString() {
        return "by.iba.management{" + "projectId=" + projectId + ", projectName='" + projectName + ", projectDescription='" + projectDescription + '\'' +
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
        result = 31 * result + (teamList != null ? teamList.hashCode() : 0);
        result = 31 * result + (projectStack != null ? projectStack.hashCode() : 0);

        return result;
    }

}

