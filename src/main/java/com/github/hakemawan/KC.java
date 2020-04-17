package com.github.hakemawan;

//import java.util.ArrayList;
import java.util.Scanner;
//import java.io.FileReader;
import java.io.IOException;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.StringReader;
//import java.io.File;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;

class KC {

    

    public static void main(String[] args) throws IOException {

        // variable to hold Kingdom Type
        Kingdoms yourKingdom = new Kingdoms();
        

        //Scanner for input 
        Scanner input = new Scanner(System.in);

        System.out.println("Choose Starting Kingdom: 1. Humans 2. Elves 3. Dwarves 4. Goblins");
        yourKingdom.kindomType = input.nextLine();
        yourKingdom.setKingdomType(yourKingdom.kindomType);
        
        if (yourKingdom.kindomType.equals("Human")) {
            System.out.println(Stats.humanDisplay());
        }else if (yourKingdom.kindomType.equals("Elf")) {
            System.out.println(Stats.elfDisplay());
        }else if (yourKingdom.kindomType.equals("Dwarf")) {
            System.out.println(Stats.dwarfDisplay());
        }else if (yourKingdom.kindomType.equals("Goblin")) {
            System.out.println(Stats.goblinDisplay());
        }

        input.close();
        //System.out.println("Testing");
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