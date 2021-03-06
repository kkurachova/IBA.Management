package by.iba.management.model.entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProjectTeamRepository {
    private static ArrayList<Employee> teamList = new ArrayList<>();

    private ProjectTeamRepository() {}

    public static List<Employee> getTeamList(long projectId){
        for (Employee e : EmployeesRepository.getEmployeesList()) {
            if (e.getProjectId() == projectId) {
                teamList.add(e);
            }
        }
        return teamList;
    }

    public static int getTeamSize(long projectId){
        return teamList.size();
    }
}
