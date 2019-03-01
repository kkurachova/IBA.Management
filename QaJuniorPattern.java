package by.iba.management.model.logic;

/**
 * Created by katya on 2/28/2019.
 */
public class QaJuniorPattern {
    private String l_level = "junior";
    private boolean l_teamLead = false;
    private String l_englishLanguageLevel = "A2";
    private boolean l_isManual = Testing.isManual(true);
    private boolean l_isAutomation = Testing.isAutomation(false);
    private boolean l_isTestingDesktop = Testing.isTestingDeskTopApplications(true);
    private boolean l_isTestingMobile = Testing.isTestingMobileApplications(false);

    public String getL_level() {
        return l_level;
    }
    public boolean isL_teamLead() {
        return l_teamLead;
    }
    public String getL_englishLanguageLevel() {
        return l_englishLanguageLevel;
    }
    public boolean isL_isManual() {
        return l_isManual;
    }
    public boolean isL_isAutomation() {
        return l_isAutomation;
    }
    public boolean isL_isTestingDesktop() {
        return l_isTestingDesktop;
    }
    public boolean isL_isTestingMobile() {
        return l_isTestingMobile;
    }

    public QaJuniorPattern(String l_level, boolean l_teamLead, String l_englishLanguageLevel,
                           boolean l_isManual, boolean l_isAutomation,
                           boolean l_isTestingDesktop, boolean l_isTestingMobile) {
        this.l_level = l_level;
        this.l_teamLead = l_teamLead;
        this.l_englishLanguageLevel = l_englishLanguageLevel;
        this.l_isManual = l_isManual;
        this.l_isAutomation = l_isAutomation;
        this.l_isTestingDesktop = l_isTestingDesktop;
        this.l_isTestingMobile = l_isTestingMobile;
    }

}
