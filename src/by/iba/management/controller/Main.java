package by.iba.management.controller;

import by.iba.management.util.DataReader;
import by.iba.management.util.DataValidator;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = DataReader.readFile();
        DataValidator validator = new DataValidator();
        for (String s : list) {
            System.out.println(s);
            System.out.println(validator.validate(s));
        }
    }
}
