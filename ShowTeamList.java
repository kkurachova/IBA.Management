package by.iba.management.model.logic;

import java.util.ArrayList;

/**
 * Created by katya on 2/28/2019.
 */
public class ShowTeamList {
    ArrayList<String> teamList = new ArrayList<String>();
    ArrayList<String> newTeamList = new ArrayList<String>();

    public void showTeamList(int projectId) {
        int size = ShowTeamSize.showTeamSize(projectId);
        if (size == 1) {
            System.out.println("Team size: " + size + " person:");
            FindEmployee.findEmployeeByprojectId(projectId);
        } else if (size > 1) {
            System.out.println("Team size: " + size + " people:");
            FindEmployee.findEmployeeByprojectId(projectId);
        } else {
            System.out.println("There is no one assigned to the project yet.");
        }
    }
}
