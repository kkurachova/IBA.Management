package by.iba.management.model.entity;

public class Tools {
    private boolean visualStudio;
    private boolean intellijIdea;
    private boolean eclipse;
    private boolean netBeans;

    public Tools(boolean visualStudio, boolean intellijIdea, boolean eclipse, boolean netBeans) {
        this.visualStudio = visualStudio;
        this.intellijIdea = intellijIdea;
        this.eclipse = eclipse;
        this.netBeans = netBeans;
    }

    public boolean isVisualStudio() {
        return visualStudio;
    }

    public boolean isIntellijIdea() {
        return intellijIdea;
    }

    public boolean isEclipse() {
        return eclipse;
    }

    public boolean isNetBeans() {
        return netBeans;
    }

    @Override
    public String toString() {
        return "Tools: " + "Visual Studio " + visualStudio + ", Intellij Idea " + intellijIdea + ", Eclipse "
                + eclipse + ", Net Beans " + netBeans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tools tools = (Tools) o;

        if (visualStudio != tools.visualStudio) return false;
        if (intellijIdea != tools.intellijIdea) return false;
        if (eclipse != tools.eclipse) return false;
        return netBeans == tools.netBeans;
    }

    @Override
    public int hashCode() {
        int result = (visualStudio ? 1 : 0);
        result = 31 * result + (intellijIdea ? 1 : 0);
        result = 31 * result + (eclipse ? 1 : 0);
        result = 31 * result + (netBeans ? 1 : 0);
        return result;
    }
}
