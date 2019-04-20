package by.iba.management.model.logic;

import by.iba.management.model.entity.Employee;

/**
 * Created by katya on 3/4/2019.
 */
public class PromoteEmployee {
    public static boolean promoteEmployee(String position, String level){
        switch (position){
            case "dev":
                switch (level){
                    case "junior":
                        if (dev_JtoM_Promo(Employee employee)){
                            employee.setPosition("middle");
                        }
                        break;
                    case "middle":
                        if (dev_MtoS_Promo(Employee employee)){
                            employee.setPosition("senior");
                        }
                        break;
                    case "senior":
                        if (dev_StoL_Promo(Employee employee)){
                            employee.setPosition("lead");
                        }
                        break;
                }
                break;
            case "qa":
                switch (level){
                    case "junior":
                        if (qa_JtoM_Promo(Employee employee)){
                            employee.setPosition("middle");
                        }
                        break;
                    case "middle":
                        if (qa_MtoS_Promo(Employee employee)){
                            employee.setPosition("senior");
                        }
                        break;
                    case "senior":
                        if (qa_StoL_Promo(Employee employee)){
                            employee.setPosition("lead");
                        }
                        break;
                }
                break;
        }
    }

//add for-cycle for positionPattern collection (collection to be added)

    public static boolean dev_JtoM_Promo(Employee someEmployee, Employee devMiddle) {
        return (someEmployee.teamLead.equals(devMiddle.teamLead)
                && someEmployee.position.equals(devMiddle.position)
                && someEmployee.englishLanguageLevel.equals(devMiddle.englishLanguageLevel)
                && someEmployee.programmingLanguage.equals(devMiddle.programmingLanguage)
                && someEmployee.skills.equals(devMiddle.skills)
                && someEmployee.tools.equals(devMiddle.tools));

    }

    public static boolean dev_MtoS_Promo(Employee someEmployee, Employee devSenior) {
        return (someEmployee.teamLead.equals(devSenior.teamLead)
                && someEmployee.position.equals(devSenior.position)
                && someEmployee.englishLanguageLevel.equals(devSenior.englishLanguageLevel)
                && someEmployee.programmingLanguage.equals(devSenior.programmingLanguage)
                && someEmployee.skills.equals(devSenior.skills)
                && someEmployee.tools.equals(devSenior.tools));
    }

    public static boolean dev_StoL_Promo(Employee someEmployee, Employee devLead) {
        return (someEmployee.teamLead.equals(devLead.teamLead)
                && someEmployee.position.equals(devLead.position)
                && someEmployee.englishLanguageLevel.equals(devLead.englishLanguageLevel)
                && someEmployee.programmingLanguage.equals(devLead.programmingLanguage)
                && someEmployee.skills.equals(devLead.skills)
                && someEmployee.tools.equals(devLead.tools));
    }

    public static boolean qa_JtoM_Promo(Employee someEmployee, Employee qaMiddle) {
        return (someEmployee.teamLead.equals(qaMiddle.teamLead)
                && someEmployee.position.equals(qaMiddle.position)
                && someEmployee.englishLanguageLevel.equals(qaMiddle.englishLanguageLevel)
                && someEmployee.programmingLanguage.equals(qaMiddle.midQaTestPattern));
    }

    public static boolean qa_MtoS_Promo(Employee someEmployee, Employee qaSenior) {
        return (someEmployee.teamLead.equals(qaSenior.teamLead)
                && someEmployee.position.equals(qaSenior.position)
                && someEmployee.englishLanguageLevel.equals(qaSenior.englishLanguageLevel)
                && someEmployee.programmingLanguage.equals(qaSenior.seniorLeadQaTestPattern));
    }

    public static boolean qa_StoL_Promo(Employee someEmployee, Employee qaLead) {
        return (someEmployee.isTeamLead().equals(qaLead.isTeamLead())
                && someEmployee.getPosition().equals(qaLead.getPosition())
                && someEmployee.getEnglishLanguageLevel().equals(qaLead.getEnglishLanguageLevel())
                && someEmployee.getProgrammingLanguage().equals(qaLead.getProgrammingLanguage()));
    }

}
