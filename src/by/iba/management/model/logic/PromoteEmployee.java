package by.iba.management.model.logic;
import by.iba.management.model.entity.Position;
import by.iba.management.model.entity.Employee;

/**
 * Created by katya on 3/4/2019.
 */
public class PromoteEmployee {

    public PromoteEmployee() {}

    public Position dev_JtoM_Promo(Employee employee, Employee devMiddlePattern) {
        if (employee.isTeamLead() == (devMiddlePattern.isTeamLead()
                && employee.getPosition().equals(devMiddlePattern.getPosition())
                && employee.getEnglishLanguageLevel().equals(devMiddlePattern.getEnglishLanguageLevel())
                && employee.getProgrammingLanguage().equals(devMiddlePattern.getProgrammingLanguage())
                && employee.getSkills().equals(devMiddlePattern.getSkills())
                && employee.getTools().equals(devMiddlePattern.getTools()))) {
            employee.setPosition(Position.Middle_Dev);
        }
        return Position.Middle_Dev;
    }

    public Position dev_MtoS_Promo(Employee employee, Employee devSeniorPattern) {
        if (employee.isTeamLead() == (devSeniorPattern.isTeamLead()
                && employee.getPosition().equals(devSeniorPattern.getPosition())
                && employee.getEnglishLanguageLevel().equals(devSeniorPattern.getEnglishLanguageLevel())
                && employee.getProgrammingLanguage().equals(devSeniorPattern.getProgrammingLanguage())
                && employee.getSkills().equals(devSeniorPattern.getSkills())
                && employee.getTools().equals(devSeniorPattern.getTools()))) {
            employee.setPosition(Position.Senior_Dev);
        }
        return Position.Senior_Dev;
    }

    public Position dev_StoL_Promo(Employee employee, Employee devLeadPattern) {
        if (employee.isTeamLead() == (devLeadPattern.isTeamLead()
                && employee.getPosition().equals(devLeadPattern.getPosition())
                && employee.getEnglishLanguageLevel().equals(devLeadPattern.getEnglishLanguageLevel())
                && employee.getProgrammingLanguage().equals(devLeadPattern.getProgrammingLanguage())
                && employee.getSkills().equals(devLeadPattern.getSkills())
                && employee.getTools().equals(devLeadPattern.getTools()))) {
            employee.setPosition(Position.Lead_Dev);
        }
        return Position.Lead_Dev;
    }

    public Position qa_JtoM_Promo(Employee employee, Employee qaMiddlePattern) {
        if (employee.isTeamLead() == (qaMiddlePattern.isTeamLead()
                && employee.getPosition().equals(qaMiddlePattern.getPosition())
                && employee.getEnglishLanguageLevel().equals(qaMiddlePattern.getEnglishLanguageLevel())
                && employee.getTesting().equals(qaMiddlePattern.getTesting()))) {
            employee.setPosition(Position.Middle_Qa);
        }
        return Position.Middle_Qa;
    }

    public Position qa_MtoS_Promo(Employee employee, Employee qaSeniorPattern) {
        if (employee.isTeamLead() == (qaSeniorPattern.isTeamLead()
                && employee.getPosition().equals(qaSeniorPattern.getPosition())
                && employee.getEnglishLanguageLevel().equals(qaSeniorPattern.getEnglishLanguageLevel())
                && employee.getTesting().equals(qaSeniorPattern.getTesting()))) {
            employee.setPosition(Position.Senior_Qa);
        }
        return Position.Senior_Qa;
    }

    public Position qa_StoL_Promo(Employee employee, Employee qaLeadPattern) {
        if (employee.isTeamLead() == (qaLeadPattern.isTeamLead()
                && employee.getPosition().equals(qaLeadPattern.getPosition())
                && employee.getEnglishLanguageLevel().equals(qaLeadPattern.getEnglishLanguageLevel())
                && employee.getTesting().equals(qaLeadPattern.getTesting()))) {
            employee.setPosition(Position.Lead_Qa);
        }
        return Position.Lead_Qa;
    }


}
