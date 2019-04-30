package by.iba.management.controller;

import by.iba.management.util.DataReader;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = DataReader.readFile();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
