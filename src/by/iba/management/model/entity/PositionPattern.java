package by.iba.management.model.entity;

import by.iba.management.model.entity.Employee;
import by.iba.management.model.entity.ProgrammingLanguage;
import by.iba.management.model.entity.Skills;
import by.iba.management.model.entity.Tools;

/**
 * Created by katya on 3/3/2019.
 */
public class PositionPattern {
    Employee qaMiddle = new Employee(false,"junior", "B1", new Testing(true, false, true, true));
    Employee qaSenior = new Employee(true, "middle", "B2", new Testing(true, true, true, true));
    Employee qaLead = new Employee(true, "senior", "C1", new Testing(true, true, true, true));

    Employee devMiddle = new Employee(false, "junior", "B1", new ProgrammingLanguage(true, true, true, false, false), new Skills(true, true, true, false, false), new Tools(true, true, true, false));
    Employee devSenior = new Employee(true, "middle", "B2", new ProgrammingLanguage(true, true, true, true, false), new Skills(true, true, true, true, false), new Tools(true, true, true, true);
    Employee devLead = new Employee(true, "senior", "C1", new ProgrammingLanguage(true, true, true, true, true), new Skills(true, true, true, true, true), new Tools(true, true, true, true);

}