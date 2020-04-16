package com.github.hakemawan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Stats extends Kingdoms {

    private String[] stringArray;
    private String[] doubleArray;

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

    public static ArrayList<String> setHumanStats() throws FileNotFoundException {
        ArrayList<String> storer = new ArrayList<>();
        //Get scanner instance
        Scanner scanner = new Scanner(new File("C:\\Users\\Hakem the Dream\\Documents\\Revature\\Project-0\\src\\main\\resources\\HumanStats.csv"));
         
        //Set the delimiter used in file
        scanner.useDelimiter(",");
        //Get all tokens and store them 
        int i = 0;
        while (scanner.hasNext()) 
        {
            storer.add(i, scanner.next());
            //holder[i]= Double.parseDouble(storer);
            i++; 
        }
         
        scanner.close();
        return storer;
    }

    public static ArrayList<String> setElfStats() throws FileNotFoundException {
        ArrayList<String> storer = new ArrayList<>();
        Scanner scanner = new Scanner(new File("C:\\Users\\Hakem the Dream\\Documents\\Revature\\Project-0\\src\\main\\resources\\ElfStats.csv"));
        scanner.useDelimiter(",");
        int i = 0;
        while (scanner.hasNext()) {
            storer.add(i, scanner.next());
            i++; 
        }
        scanner.close();
        return storer;
    }

    public static ArrayList<String> setDwarfStats() throws FileNotFoundException {
        ArrayList<String> storer = new ArrayList<>();
        Scanner scanner = new Scanner(new File("C:\\Users\\Hakem the Dream\\Documents\\Revature\\Project-0\\src\\main\\resources\\DwarfStats.csv"));
        scanner.useDelimiter(",");
        int i = 0;
        while (scanner.hasNext()) {
            storer.add(i, scanner.next());
            i++; 
        }
        scanner.close();
        return storer;
    }

    public static ArrayList<String> setGoblinStats() throws FileNotFoundException {
        ArrayList<String> storer = new ArrayList<>();
        Scanner scanner = new Scanner(new File("C:\\Users\\Hakem the Dream\\Documents\\Revature\\Project-0\\src\\main\\resources\\GoblinStats.csv"));
        scanner.useDelimiter(",");
        int i = 0;
        while (scanner.hasNext()) {
            storer.add(i, scanner.next());
            i++; 
        }
        scanner.close();
        return storer;
    }
    //public static String[] readFiles() throws IOException {}

    //Convert string array to double array
    public static ArrayList<Double> convert(ArrayList<String> s) {
        ArrayList<Double> holder = new ArrayList<>();
                 for (int i = 0; i < s.size(); i++) {
            holder.add(i, Double.parseDouble(s.get(i)));
            }   
        return holder;
    }
    public static String humanDisplay() throws IOException {
        ArrayList<String> s = setHumanStats();
        ArrayList<Double> d = convert(s);
        String stats = "Your Stats: \n Strength: " + d.get(0) + "\n Constitution: " + d.get(1) 
                + "\n Agility: " + d.get(2) + "\n Intelligence: " + d.get(3) + "\n Range: " 
                + d.get(4) + "\n Growth: " + d.get(5) + "\n Population: " + d.get(6);
                return stats;
    }

    public static String elfDisplay() throws IOException {
        ArrayList<String> s = setElfStats();
        ArrayList<Double> d = convert(s);
        String stats = "Your Stats: \n Strength: " + d.get(0) + "\n Constitution: " + d.get(1) 
                + "\n Agility: " + d.get(2) + "\n Intelligence: " + d.get(3) + "\n Range: " 
                + d.get(4) + "\n Growth: " + d.get(5) + "\n Population: " + d.get(6);
                return stats;
    }

    public static String dwarfDisplay() throws IOException {
        ArrayList<String> s = setDwarfStats();
        ArrayList<Double> d = convert(s);
        String stats = "Your Stats: \n Strength: " + d.get(0) + "\n Constitution: " + d.get(1) 
                + "\n Agility: " + d.get(2) + "\n Intelligence: " + d.get(3) + "\n Range: " 
                + d.get(4) + "\n Growth: " + d.get(5) + "\n Population: " + d.get(6);
                return stats;
    }

    public static String goblinDisplay() throws IOException {
        ArrayList<String> s = setGoblinStats();
        ArrayList<Double> d = convert(s);
        String stats = "Your Stats: \n Strength: " + d.get(0) + "\n Constitution: " + d.get(1) 
                + "\n Agility: " + d.get(2) + "\n Intelligence: " + d.get(3) + "\n Range: " 
                + d.get(4) + "\n Growth: " + d.get(5) + "\n Population: " + d.get(6);
                return stats;
    }


}