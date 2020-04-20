package com.github.hakemawan.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FReader {

    public ArrayList<String> storer;
    Scanner scanner;


    public ArrayList<String> fetchFiles(String input) {
        storer = new ArrayList<>();
        int i = 0;
        switch (input) {
            case "1":
                //Get scanner instance
                try {
                    scanner = new Scanner(new File(
                            "C:\\Users\\hakem\\OneDrive\\Documents\\Revature\\Project-0-Hakem\\src\\main\\resources\\HumanStats.csv"));
                } catch (FileNotFoundException e) {
                    System.out.println("File not found");
                }
                //Set the delimiter used in file
                scanner.useDelimiter(",");
                //Get all tokens and store them 
                while (scanner.hasNext()) 
                {
                    storer.add(i, scanner.next());
                    i++; 
                }
               return storer;
            case "2":
                try {
                    scanner = new Scanner(new File(
                            "C:\\Users\\hakem\\OneDrive\\Documents\\Revature\\Project-0-Hakem\\src\\main\\resources\\ElfStats.csv"));
                } catch (FileNotFoundException e) {
                    System.out.println("File not found");
                }
                scanner.useDelimiter(",");
                while (scanner.hasNext()) 
                {
                    storer.add(i, scanner.next());
                    i++; 
                }
               return storer;
            case "3":
                try {
                    scanner = new Scanner(new File(
                            "C:\\Users\\hakem\\OneDrive\\Documents\\Revature\\Project-0-Hakem\\src\\main\\resources\\DwarfStats.csv"));
                } catch (FileNotFoundException e) {
                    System.out.println("File not found");
                }
                scanner.useDelimiter(",");
                while (scanner.hasNext()) 
                {
                    storer.add(i, scanner.next());
                    i++; 
                }
           return storer;
            case "4":
                try {
                    scanner = new Scanner(new File(
                            "C:\\Users\\hakem\\OneDrive\\Documents\\Revature\\Project-0-Hakem\\src\\main\\resources\\GoblinStats.csv"));
                } catch (FileNotFoundException e) {
                    System.out.println("File not found");
                }
                scanner.useDelimiter(",");
                while (scanner.hasNext()) 
                {
                    storer.add(i, scanner.next());
                    i++; 
                }
           return storer;
            default:
                return null;
        }
    }

}