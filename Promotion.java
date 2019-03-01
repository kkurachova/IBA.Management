package by.iba.management.model.logic;


/**
 * Created by katya on 2/28/2019.
 */
public class Promotion {
    private String position = Employee.getPosition();
    private String level = Employee.getLevel();

    public static void promoteEmployee(String position, String level){
        switch (position){
            case "dev":
                switch (level){
                    case "junior":
                        //code
                        break;
                    case "middle":
                        //code
                        break;
                    case "senior":
                        //code
                        break;
                }
                break;
            case "qa":
                switch (level){
                    case "junior":
                        //code
                        break;
                    case "middle":
                        //code
                        break;
                    case "senior":
                        //code
                        break;
                }
                break;
        }
    }
}
