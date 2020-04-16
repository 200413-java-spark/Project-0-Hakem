package com.github.hakemawan;

import java.util.ArrayList;
import java.util.Scanner;
//import java.io.FileReader;
import java.io.IOException;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.StringReader;
import java.io.File;
//import java.io.BufferedReader;
import java.io.FileNotFoundException;

class KC {

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

    public static String[] setElfStats() throws FileNotFoundException {
        String[] storer = new String[8];
        Scanner scanner = new Scanner(new File("C:\\Users\\Hakem the Dream\\Documents\\Revature\\Project-0\\src\\main\\resources\\ElfStats.csv"));
        scanner.useDelimiter(",");
        int i = 0;
        while (scanner.hasNext())  {
            storer[i] = scanner.next();
            i++; 
        }
        scanner.close();
        return storer;
    }

    public static String[] setDwarfStats() throws FileNotFoundException {
        String[] storer = new String[8];
        Scanner scanner = new Scanner(new File("C:\\Users\\Hakem the Dream\\Documents\\Revature\\Project-0\\src\\main\\resources\\DwarfStats.csv"));
        scanner.useDelimiter(",");
        int i = 0;
        while (scanner.hasNext())  {
            storer[i] = scanner.next();
            i++; 
        }
        scanner.close();
        return storer;
    }

    public static String[] setGoblinStats() throws FileNotFoundException {
        String[] storer = new String[8];
        Scanner scanner = new Scanner(new File("C:\\Users\\Hakem the Dream\\Documents\\Revature\\Project-0\\src\\main\\resources\\GoblinStats.csv"));
        scanner.useDelimiter(",");
        int i = 0;
        while (scanner.hasNext())  {
            storer[i] = scanner.next();
            i++; 
        }
        scanner.close();
        return storer;
    }
    //public static String[] readFiles() throws IOException {}

    //Convert string array to double array
    public static ArrayList<Double> convert(ArrayList<String> s) {
        ArrayList<Double> holder = new ArrayList<>();
       // try{
         for (int i = 0; i < 7; i++) {
            holder.add(i, Double.parseDouble(s.get(i)));
            } 
        //}catch (NumberFormatException nfe){
        //    System.out.println("No");
       // }
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

    /*public static String elfDisplay() throws IOException {
        String[] s = setElfStats();
        Double[] a = convert(s);
        String stats = "Your Stats: \n Strength: " + a[0] + "\n Constitution: " + a[1] + "\n Agility: " + a[2]
                + "\n Intelligence: " + a[3] + "\n Range: " + a[4] + "\n Growth: " + a[5]
                + "\n Population: " + a[6];
        return stats;
    }

    public static String dwarfDisplay() throws IOException {
        String[] s = setDwarfStats();
        Double[] a = convert(s);
        String stats = "Your Stats: \n Strength: " + a[0] + "\n Constitution: " + a[1] + "\n Agility: " + a[2]
                + "\n Intelligence: " + a[3] + "\n Range: " + a[4] + "\n Growth: " + a[5]
                + "\n Population: " + a[6];
        return stats;
    }

    public static String goblinDisplay() throws IOException {
        String[] s = setGoblinStats();
        Double[] a = convert(s);
        String stats = "Your Stats: \n Strength: " + a[0] + "\n Constitution: " + a[1] + "\n Agility: " + a[2]
                + "\n Intelligence: " + a[3] + "\n Range: " + a[4] + "\n Growth: " + a[5]
                + "\n Population: " + a[6];
        return stats;
    }*/

    public static void main(String[] args) throws IOException {

        // variable to hold Kingdom Type
        Kingdoms yourKingdom = new Kingdoms();
        

        //Scanner for input 
        Scanner input = new Scanner(System.in);

        System.out.println("Choose Starting Kingdom: 1. Humans 2. Elves 3. Dwarves 4. Goblins");
        yourKingdom.kindomType = input.nextLine();
        yourKingdom.setKingdomType(yourKingdom.kindomType);
        
        if (yourKingdom.kindomType.equals("1")) {
            System.out.println(humanDisplay());
            System.out.println("Testing");
        }/*else if (yourKingdom.kindomType.equals("2")) {
            System.out.println( elfDisplay());
        }else if (yourKingdom.kindomType.equals("3")) {
            System.out.println( dwarfDisplay());
        }else if (yourKingdom.kindomType.equals("4")) {
            System.out.println( goblinDisplay());
        }*/

        input.close();
        System.out.println("Testing");
    }
}

// BufferedReader sbr = new BufferedReader(new StringReader("Bufferedreader vs
    // Console vs Scanner in Java"));
    // BufferedReader fbr = new BufferedReader(new FileReader("file.txt"));
    // BufferedReader isbr = new BufferedReader(new InputStreamReader(System.in));

    /*
     * public String readAllLines(BufferedReader reader) throws IOException {
     * StringBuilder content = new StringBuilder(); String line; while ((line =
     * reader.readLine()) != null) { content.append(line);
     * content.append(System.lineSeparator()); } return content.toString(); }
     *//*File myFile = new File("");
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
        //