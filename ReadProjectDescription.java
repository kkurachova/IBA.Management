package by.iba.management.model.logic;

import by.iba.management.model.entity.*;
import by.iba.management.model.entity.Error;

import java.util.Scanner;

/**
 * Created by katya on 2/23/2019.
 */
public class ReadProjectDescription {
    public String readProjectDescription() {
        int length = 250;
        System.out.println("Please briefly describe the Project: ");
        Scanner projDescr = new Scanner(System.in);
        String projectDescription = Project.getProjectDescription();
        if ((projDescr.nextLine().length() != 0) && (projDescr.nextLine().length() <= length)) {
            projectDescription = projDescr.nextLine(); //why not read from Project class?
            return projectDescription;
        } else {
            System.out.println(Error.getProjectDescrErr());
        }
        return projectDescription;
    }
}
