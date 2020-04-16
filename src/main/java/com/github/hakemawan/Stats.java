package com.github.hakemawan;

import java.io.File;
import java.io.FileNotFoundException;
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

    /*public static String[] setHumanStats() throws FileNotFoundException {
        String[] storer = new String[8]; /
        //Get scanner instance
        Scanner scanner = new Scanner(new File("C:\\Users\\Hakem the Dream\\Documents\\Revature\\Project-0\\src\\main\\resources\\HumanStats.csv"));
         
        //Set the delimiter used in file
        scanner.useDelimiter(",");
        //Get all tokens and store them 
        int i = 0;
        while (scanner.hasNext()) 
        {
            storer[i] = scanner.next();
            //holder[i]= Double.parseDouble(storer);
            i++; 
        }
         
        scanner.close();
        return storer;
    }*/


}