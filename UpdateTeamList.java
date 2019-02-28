package Project.model.logic;

import java.util.ArrayList;

/**
 * Created by katya on 2/28/2019.
 */
public class UpdateTeamList {
    ArrayList<String> teamList = new ArrayList<String>();
    ArrayList<String> newTeamList = new ArrayList<String>();

    public void removeTeamMember(int projectId, int employeeId){
        teamList = FindEmployee.findEmployeeByProjectId(projectId);
        newTeamList = teamList.remove(Employee.getEmployeeId(employeeId));
    }

    public void addTeamMember(int projectId, int employeeId){
        teamList = FindEmployee.findEmployeeByProjectId(projectId);
        newTeamList = teamList.add(Employee.getEmployeeId(employeeId));
    }

}
