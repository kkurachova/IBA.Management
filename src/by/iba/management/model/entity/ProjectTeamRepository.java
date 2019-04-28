package by.iba.management.model.entity;

import java.util.ArrayList;
import java.util.List;

public class ProjectTeamRepository {
    private static ArrayList<Employee> teamList = new ArrayList<>();

    private ProjectTeamRepository() {}

    public static List<Employee> getTeamList(long projectId) {
        List<Employee> teamList = new ArrayList<>();
        for (Employee e : EmployeesRepository.getEmployeesList()) {
            if (e.getProjectId() == projectId) {
                teamList.add(e);
            }
        }
        return teamList;
    }

    public static int getTeamSize(long projectId){
        int teamSize = teamList.size();
        return teamSize;
    }
}
