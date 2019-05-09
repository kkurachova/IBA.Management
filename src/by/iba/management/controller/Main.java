package by.iba.management.controller;

import by.iba.management.model.entity.Project;
import by.iba.management.model.entity.ProjectsRepository;
import by.iba.management.util.*;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listE = DataReaderEmployees.readFile();
        DataValidatorEmployees validatorE = new DataValidatorEmployees();
        for (String s : listE) {
            System.out.println(s);
            System.out.println(validatorE.validate(s));
        }
        /*for (Employee e : EmployeesRepository.getEmployeesList()) {
            System.out.println(e);
        }*/

        ArrayList<String> listP = DataReaderProjects.readFile();
        DataValidatorProjects validatorP = new DataValidatorProjects();
        for (String s : listP) {
            System.out.println(s);
            System.out.println(validatorP.validate(s));
        }
        for (Project p : ProjectsRepository.getProjectList()) {
            System.out.println(p);


            ArrayList<Project> projectList = new ArrayList<>();
            projectList.add(new Project(ProjectIdGenerator.getProjectId(), "newProject", "New Project Description"));
            DataWriterProjects.writeProjectToFile(projectList);
        }
    }
}
