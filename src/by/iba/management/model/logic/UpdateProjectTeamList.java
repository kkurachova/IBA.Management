package by.iba.management.model.logic;

import by.iba.management.model.entity.Employee;
import java.util.ArrayList;

public interface UpdateProjectTeamList {
    ArrayList<Employee> teamList = new ArrayList<>();

    void addTeamMember(Employee employee);
    void removeTeamMember(Employee employee);
}
