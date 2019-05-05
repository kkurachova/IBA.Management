package by.iba.management.model.logic;

import by.iba.management.model.entity.*;

import java.util.ArrayList;
import java.util.List;


public interface FindEmployee {

    List<Employee> findEmployeeByName(String firstName, String lastName);
    List<Employee> findEmployeeByProjectId(long projectId);
    List<Employee> findEmployeeByEmployeeId(long employeeId);
    List<Employee> findTeamLeadEmployee(boolean teamLead);
    List<Employee> findEmployeeByEnglishLanguageLevel(String englishLanguageLevel);
    List<Employee> findEmployeeByProgrammingLanguage(ProgrammingLanguage programmingLanguage);
    List<Employee> findEmployeeBySkills(Skills skills);
    List<Employee> findEmployeeByTesting(Testing testing);
    List<Employee> findEmployeeByTools(Tools tools);
}
