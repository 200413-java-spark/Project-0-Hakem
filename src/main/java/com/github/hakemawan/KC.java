package com.github.hakemawan;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.StringReader;
import java.io.File;
//import java.io.BufferedReader;

class KC {

    // BufferedReader sbr = new BufferedReader(new StringReader("Bufferedreader vs
    // Console vs Scanner in Java"));
    // BufferedReader fbr = new BufferedReader(new FileReader("file.txt"));
    // BufferedReader isbr = new BufferedReader(new InputStreamReader(System.in));

    /*
     * public String readAllLines(BufferedReader reader) throws IOException {
     * StringBuilder content = new StringBuilder(); String line; while ((line =
     * reader.readLine()) != null) { content.append(line);
     * content.append(System.lineSeparator()); } return content.toString(); }
     */
    public static Double[] readFiles() throws IOException {
        /*File myFile = new File("C:\\Users\\Hakem the Dream\\Documents\\Project-0\\DwarfStats.csv");
        ArrayList<Double> result = new ArrayList<Double>();
       
         BufferedReader read = new BufferedReader(new FileReader(myFile));
        // String line = read.readLine();
        Scanner s = new Scanner(new FileReader(myFile));
        try {

            while (s.hasNext()) {
                result.add(s.nextDouble());
            }
            return result;
        } finally {
            s.close();
        }*/
        Double[] holder = new Double[7];
        //Get scanner instance
        Scanner scanner = new Scanner(new File("C:\\Users\\Hakem the Dream\\Documents\\Project-0\\DwarfStats.csv"));
         
        //Set the delimiter used in file
        scanner.useDelimiter(",");
         
        //Get all tokens and store them in some data structure
        //I am just printing them
        int i = 0;
        while (scanner.hasNext()) 
        {
            holder[i] = Double.parseDouble(scanner.next());
            i++;
        }
         
        //Do not forget to close the scanner  
        scanner.close();

        return holder;

    }

    public static String display(Double[] a) throws IOException {
        readFiles();
        String stats = "Stats: \n Strength: " + a[0] + "\n Constitution: " + a[1] + "\n Agility: " + a[2]
                + "\n Intelligence: " + a[3] + "\n Range: " + a[4] + "\n Growth: " + a[5]
                + "\n Population: " + a[6];
        // System.out.println(
        return stats;
    }

    public static void main(String[] args) throws IOException {

        // declare kingdoms
        Races humans = new Races();
        Races elves = new Races();
        Races dwarves = new Races();
        Races goblins = new Races();

        humans.type = "Human";
        elves.type = "Elf";
        dwarves.type = "Dwarf";
        goblins.type = "Goblin";

        Double[] result = null; // for display
        
        //Scanner for input 
        Scanner input = new Scanner(System.in);

        System.out.println("Choose Starting Kingdom: 1. Humans 2. Elves 3. Dwarves 4. Goblins");
        String kingdom = input.nextLine();
        input.close();
        if (kingdom.equals("1")) {
            System.out.println("You are the " + humans.type + " Kingdom");
        }else if (kingdom.equals("2")) {
            System.out.println("You are the " + elves.type + " Kingdom");
        }else if (kingdom.equals("3")) {
            System.out.println("You are the " + dwarves.type + " Kingdom \n Dward Stats: " + display(result));
        }else if (kingdom.equals("4")) {
            System.out.println("You are the " + goblins.type + " Kingdom");
        }  

        System.out.println("Testing");
    }

    
    public static void setHumanStats() {

    }

    public static void setElfStats() {

    }

    public static void setDwarfStats() {

    }

    public static void setGoblinStats() {

    }
}