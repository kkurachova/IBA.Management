package by.iba.management.model.entity;

/**
 * Created by katya on 2/20/2019.
 */
public class Error {
    private static String projectNameErr = "Please enter a valid Project name.";
    private static String projectDescrErr = "Please enter a valid Project description";

    public static String getProjectNameErr() {
        return projectNameErr;
    }

    public static String getProjectDescrErr() {
        return projectDescrErr;
    }
}
