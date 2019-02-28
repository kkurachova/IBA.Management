package Project.model.logic;

/**
 * Created by katya on 2/23/2019.
 */

//class finder
public class ShowTeamSize {
    private static int teamSize = 0;

    public ShowTeamSize() { //constructor
        }

    public static int showTeamSize(int projectId){
        for (Employee e : employeesList){
            if (e.getProjectId() == projectId){
                teamSize++;
            }
        }
        return teamSize;
    }
}
