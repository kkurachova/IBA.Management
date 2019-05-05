package by.iba.management.model.logic;

import by.iba.management.model.entity.Position;
import by.iba.management.model.entity.Employee;

public interface PromoteEmployee {

    Position dev_JtoM_Promo(Employee employee, Employee devMiddlePattern);
    Position dev_MtoS_Promo(Employee employee, Employee devSeniorPattern);
    Position dev_StoL_Promo(Employee employee, Employee devLeadPattern);
    Position qa_JtoM_Promo(Employee employee, Employee qaMiddlePattern);
    Position qa_MtoS_Promo(Employee employee, Employee qaSeniorPattern);
    Position qa_StoL_Promo(Employee employee, Employee qaLeadPattern);
}
