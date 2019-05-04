package by.iba.management.model.logic;

import by.iba.management.model.entity.*;

import java.util.ArrayList;
import java.util.List;


public interface FindEmployee {
    default List<Employee> findEmployeeByName(String firstName, String lastName) {
        return null;
    }

    default List<Employee> findEmployeeByProjectId(long projectId) {
        return null;
    }

    List<Employee> findEmployeeByEmployeeId(long employeeId);

    List<Employee> findTeamLeadEmployee(boolean teamLead);

    List<Employee> findEmployeeByEnglishLanguageLevel(String englishLanguageLevel);

    List<Employee> findEmployeeByProgrammingLanguage(ProgrammingLanguage programmingLanguage);

    List<Employee> findEmployeeBySkills(Skills skills);

    List<Employee> findEmployeeByTesting(Testing testing);

    List<Employee> findEmployeeByTools(Tools tools);
}
