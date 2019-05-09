package by.iba.management.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidatorEmployee {
    private Pattern pattern;
    private Matcher matcher;
    private static final String REG_PATTERN = "[0-9]+\\s([a-zA-Z]+\\s){2}[0-9]+\\s(false|true)\\s" +
            "(JUNIOR_QA|MIDDLE_QA|SENIOR_QA|LEAD_QA|JUNIOR_DEV|MIDDLE_DEV|SENIOR_DEV|LEAD_DEV)\\s(A1|A2|B1|B2|C1|C2)\\s((false|true)\\s){18}";
    //private static final String REG_PATTERN = "(-?[0-9]*?\\.[0-9]*?\\s){14}(-?[0-9]*?\\.[0-9]*?)";
    public DataValidatorEmployee() {
        pattern = Pattern.compile(REG_PATTERN);
    }

    public boolean validate(final String line) {
        matcher = pattern.matcher(line);
        return matcher.matches();
    }
}
