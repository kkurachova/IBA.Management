package by.iba.management.model.entity;

public class Employee {
    private static long temp = 0;
    private long employeeId;
    private String firstName;
    private String lastName;
    private boolean teamLead;
    private String position;
    private String englishLanguageLevel;
    private ProgrammingLanguage programmingLanguage;
    private Skills skills;
    private Testing testing;
    private Tools tools;

    public Employee(String firstName, String lastName, boolean teamLead, String position,
                    String englishLanguageLevel, ProgrammingLanguage programmingLanguage, Skills skills,
                    Testing testing, Tools tools) {
        this.employeeId = ++temp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamLead = teamLead;
        this.position = position;
        this.englishLanguageLevel = englishLanguageLevel;
        this.programmingLanguage = programmingLanguage;
        this.skills = skills;
        this.testing = testing;
        this.tools = tools;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isTeamLead() {
        return teamLead;
    }

    public String getPosition() {
        return position;
    }

    public String getEnglishLanguageLevel() {
        return englishLanguageLevel;
    }

    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    public Skills getSkills() {
        return skills;
    }

    public Testing getTesting() {
        return testing;
    }

    public Tools getTools() {
        return tools;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTeamLead(boolean teamLead) {
        this.teamLead = teamLead;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEnglishLanguageLevel(String englishLanguageLevel) {
        this.englishLanguageLevel = englishLanguageLevel;
    }

    public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public void setTesting(Testing testing) {
        this.testing = testing;
    }

    public void setTools(Tools tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' +
                ", teamLead=" + teamLead + ", position='" + position + '\'' + ", englishLanguageLevel='" + englishLanguageLevel + '\'' +
                ", programmingLanguage=" + programmingLanguage + ", skills=" + skills + ", testing=" + testing +
                ", tools=" + tools + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        if (teamLead != employee.teamLead) return false;
        if (position != null ? !position.equals(employee.position) : employee.position != null) return false;
        if (englishLanguageLevel != null ? !englishLanguageLevel.equals(employee.englishLanguageLevel) : employee.englishLanguageLevel != null)
            return false;
        if (programmingLanguage != null ? !programmingLanguage.equals(employee.programmingLanguage) : employee.programmingLanguage != null)
            return false;
        if (skills != null ? !skills.equals(employee.skills) : employee.skills != null) return false;
        if (testing != null ? !testing.equals(employee.testing) : employee.testing != null) return false;
        return tools != null ? tools.equals(employee.tools) : employee.tools == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (employeeId ^ (employeeId >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (teamLead ? 1 : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (englishLanguageLevel != null ? englishLanguageLevel.hashCode() : 0);
        result = 31 * result + (programmingLanguage != null ? programmingLanguage.hashCode() : 0);
        result = 31 * result + (skills != null ? skills.hashCode() : 0);
        result = 31 * result + (testing != null ? testing.hashCode() : 0);
        result = 31 * result + (tools != null ? tools.hashCode() : 0);
        return result;
    }
}
