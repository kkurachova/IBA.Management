package by.iba.management.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator_Projects {
    private Pattern pattern;
    private Matcher matcher;
    private static final String REG_PATTERN = "[0-9]+\\s([\\p{Alpha}\\p{Digit}\\p{Punct}]+\\s){2}";
    public DataValidator_Projects() {
        pattern = Pattern.compile(REG_PATTERN);
    }

    public boolean validate(final String line) {
        matcher = pattern.matcher(line);
        return matcher.matches();
    }
}
