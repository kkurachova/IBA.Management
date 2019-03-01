package by.iba.management.model.logic;

/**
 * Created by katya on 2/28/2019.
 */
public class DevSeniorPattern {
    private String l_level = "senior";
    private boolean l_teamLead = true;
    private String l_englishLanguageLevel = "B2";
    private boolean isJava = ProgrammingLanguage.isJava(true);
    private boolean iscPlusPlus = ProgrammingLanguage.iscPlusPlus(true);
    private boolean iscSharp = ProgrammingLanguage.iscSharp(true);
    private boolean isPhp = ProgrammingLanguage.isPhp(true);
    private boolean isDotNet = ProgrammingLanguage.isDotNet(false);
    private boolean isSql = Skills.isSql(true);
    private boolean isJavaScript = Skills.isJavaScript(true);
    private boolean isHtml = Skills.isHtml(true);
    private boolean isCss = Skills.isCss(true);
    private boolean isjQuery = Skills.isjQuery(true);
    private boolean isVisualStudio = Tools.isVisualStudio(true);
    private boolean isIntellijIdea = Tools.isIntellijIdea(true);
    private boolean isEclipse = Tools.isEclipse(true);
    private boolean isNetBeans = Tools.isNetBeans(true);

    public DevSeniorPattern(String l_level, boolean l_teamLead, String l_englishLanguageLevel,
                            boolean isJava, boolean iscPlusPlus, boolean iscSharp, boolean isPhp, boolean isDotNet,
                            boolean isSql, boolean isJavaScript, boolean isHtml, boolean isCss, boolean isjQuery,
                            boolean isVisualStudio, boolean isIntellijIdea, boolean isEclipse, boolean isNetBeans) {
        this.l_level = l_level;
        this.l_teamLead = l_teamLead;
        this.l_englishLanguageLevel = l_englishLanguageLevel;
        this.isJava = isJava;
        this.iscPlusPlus = iscPlusPlus;
        this.iscSharp = iscSharp;
        this.isPhp = isPhp;
        this.isDotNet = isDotNet;
        this.isSql = isSql;
        this.isJavaScript = isJavaScript;
        this.isHtml = isHtml;
        this.isCss = isCss;
        this.isjQuery = isjQuery;
        this.isVisualStudio = isVisualStudio;
        this.isIntellijIdea = isIntellijIdea;
        this.isEclipse = isEclipse;
        this.isNetBeans = isNetBeans;
    }

    public String getL_level() {
        return l_level;
    }

    public boolean isL_teamLead() {
        return l_teamLead;
    }

    public String getL_englishLanguageLevel() {
        return l_englishLanguageLevel;
    }

    public boolean isJava() {
        return isJava;
    }

    public boolean isIscPlusPlus() {
        return iscPlusPlus;
    }

    public boolean isIscSharp() {
        return iscSharp;
    }

    public boolean isPhp() {
        return isPhp;
    }

    public boolean isDotNet() {
        return isDotNet;
    }

    public boolean isSql() {
        return isSql;
    }

    public boolean isJavaScript() {
        return isJavaScript;
    }

    public boolean isHtml() {
        return isHtml;
    }

    public boolean isCss() {
        return isCss;
    }

    public boolean isIsjQuery() {
        return isjQuery;
    }

    public boolean isVisualStudio() {
        return isVisualStudio;
    }

    public boolean isIntellijIdea() {
        return isIntellijIdea;
    }

    public boolean isEclipse() {
        return isEclipse;
    }

    public boolean isNetBeans() {
        return isNetBeans;
    }




}
