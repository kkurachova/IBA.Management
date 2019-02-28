package by.iba.management.model.logic;

import by.iba.management.model.entity.*;
import by.iba.management.model.entity.Error;

import java.util.Scanner;

/**
 * Created by katya on 2/23/2019.
 */
public class ReadProjectName {
    public String readProjectName() {
        int length = 30;
        System.out.println("Project Name: ");
        Scanner projName = new Scanner(System.in);
        String projectName = Project.getProjectName();
        if ((projName.nextLine().length() != 0) && (projName.nextLine().length() <= length)) {
            projectName = projName.nextLine();
            return projectName;
        } else {
            System.out.println(Error.getProjectNameErr());
        }
        return projectName;
    }
}
