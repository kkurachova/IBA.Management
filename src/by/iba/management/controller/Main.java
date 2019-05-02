package by.iba.management.controller;

import by.iba.management.util.DataReader;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = DataReader.readFile();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
