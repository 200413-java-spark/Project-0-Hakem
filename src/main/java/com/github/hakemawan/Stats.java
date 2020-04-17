package com.github.hakemawan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Stats {

    private String[] stringArray;
    private String[] statNameA = {"Health", "Strength", "Constitution", "Agility", "Intelligence", "Range", "Growth", "Population"};
    private Double[] humanStatA; //Hold humans Statss
    private Double[] elfStatA;
    private Double[] dwarfStatA;
    private Double[] goblinStatA;
    private File myFile;


    // stats
    private Double health; //constitution*strength
    private Double strength; //main damage stat (strenght*pop)
    private Double constitution; //main defense stat (constitution*pop)
    private Double agility; // >agility attacks first
    private Double intelligence; 
    private Double range; // (intelligence + range + agility) /10 = # of attacks
    private Double growth; //pop growth per turn
    private Double pop;   // population
    
   /* public Stats() {   //default constructor(humans)
        strength = 10.0;  // 1
        constitution = 10.0; //2
        agility = 10.0; //3
        intelligence = 10.0; //4
        range = 10.0; //5
        growth = 1.5;  //6
        pop = 1500.0;  //7
        health = constitution * strenght;
    }*/

    public static ArrayList<String> fetchFiles(String input) throws FileNotFoundException {
        ArrayList<String> storer = new ArrayList<>();
        Scanner scanner;
        int i = 0;
        switch (input) {
            case "1":
                //Get scanner instance
                scanner = new Scanner(new File("C:\\Users\\Hakem the Dream\\Documents\\Revature\\Project-0-Hakem\\src\\main\\resources\\HumanStats.csv"));
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
                scanner = new Scanner(new File("C:\\Users\\Hakem the Dream\\Documents\\Revature\\Project-0-Hakem\\src\\main\\resources\\ElfStats.csv"));
                scanner.useDelimiter(",");
                while (scanner.hasNext()) 
                {
                    storer.add(i, scanner.next());
                    i++; 
                }
               return storer;
            case "3":
                scanner = new Scanner(new File("C:\\Users\\Hakem the Dream\\Documents\\Revature\\Project-0-Hakem\\src\\main\\resources\\DwarfStats.csv"));
                scanner.useDelimiter(",");
                while (scanner.hasNext()) 
                {
                    storer.add(i, scanner.next());
                    i++; 
                }
           return storer;
            case "4":
                scanner = new Scanner(new File("C:\\Users\\Hakem the Dream\\Documents\\Revature\\Project-0-Hakem\\src\\main\\resources\\GoblinStats.csv"));
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

    public static ArrayList<Double> setHumanStats() throws FileNotFoundException {
        ArrayList<String> storer = fetchFiles("1");
        ArrayList<Double> holder = new ArrayList<>();
        for (int i = 0; i < storer.size(); i++) {
            holder.add(i, Double.parseDouble(storer.get(i)));
        }   
        return holder;
    }

    public static ArrayList<Double> setElfStats() throws FileNotFoundException {
        ArrayList<String> storer = fetchFiles("2");
        ArrayList<Double> holder = new ArrayList<>();
        for (int i = 0; i < storer.size(); i++) {
            holder.add(i, Double.parseDouble(storer.get(i)));
        }   
        return holder;
    }

    public static ArrayList<Double> setDwarfStats() throws FileNotFoundException {
        ArrayList<String> storer = fetchFiles("3");
        ArrayList<Double> holder = new ArrayList<>();
        for (int i = 0; i < storer.size(); i++) {
            holder.add(i, Double.parseDouble(storer.get(i)));
        }   
        return holder;
    }
    
    public static ArrayList<Double> setGoblinStats() throws FileNotFoundException {
        ArrayList<String> storer = fetchFiles("4");
        ArrayList<Double> holder = new ArrayList<>();
        for (int i = 0; i < storer.size(); i++) {
            holder.add(i, Double.parseDouble(storer.get(i)));
        }   
        return holder;
    }
    
    
    public static String humanDisplay() throws IOException {
        ArrayList<Double> d = setHumanStats();
        String stats = "Your Stats: \n Strength: " + d.get(0) + "\n Constitution: " + d.get(1) 
                + "\n Agility: " + d.get(2) + "\n Intelligence: " + d.get(3) + "\n Range: " 
                + d.get(4) + "\n Growth: " + d.get(5) + "\n Population: " + d.get(6);
                return stats;
    }

    public static String elfDisplay() throws IOException {
        ArrayList<Double> d = setElfStats();
        String stats = "Your Stats: \n Strength: " + d.get(0) + "\n Constitution: " + d.get(1) 
                + "\n Agility: " + d.get(2) + "\n Intelligence: " + d.get(3) + "\n Range: " 
                + d.get(4) + "\n Growth: " + d.get(5) + "\n Population: " + d.get(6);
                return stats;
    }

    public static String dwarfDisplay() throws IOException {
        ArrayList<Double> d = setDwarfStats();
        String stats = "Your Stats: \n Strength: " + d.get(0) + "\n Constitution: " + d.get(1) 
                + "\n Agility: " + d.get(2) + "\n Intelligence: " + d.get(3) + "\n Range: " 
                + d.get(4) + "\n Growth: " + d.get(5) + "\n Population: " + d.get(6);
                return stats;
    }

    public static String goblinDisplay() throws IOException {
        ArrayList<Double> d = setGoblinStats();
        String stats = "Your Stats: \n Strength: " + d.get(0) + "\n Constitution: " + d.get(1) 
                + "\n Agility: " + d.get(2) + "\n Intelligence: " + d.get(3) + "\n Range: " 
                + d.get(4) + "\n Growth: " + d.get(5) + "\n Population: " + d.get(6);
                return stats;
    }


}