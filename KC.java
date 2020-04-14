import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

class KC {
    public static void main(String[] args) {
        
        //declare kingdoms
        Races humans = new Races();
        Races elves = new Races();
        Races dwarves = new Races();
        Races goblins = new Races();

        humans.type = "Human";
        elves.type = "Elf";
        dwarves.type = "Dwarf";
        goblins.type = "Goblin";
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
            System.out.println("You are the " + dwarves.type + " Kingdom");
        }else if (kingdom.equals("4")) {
            System.out.println("You are the " + goblins.type + " Kingdom");
        }
        
    }

    public static ArrayList readFiles() {
        ArrayList<Double> result = new ArrayList<>();
        File myFile = new File("C:\\Users\\Hakem the Dream\\Documents\\Project-0\\DwarfStats.csv");

        BufferedReader read = new BufferedReader(new FileReader(file));
        String line = read.readLine();

       /* try (Scanner s = new Scanner(new FileReader(file))) {
            while (s.hasNext()) {
                result.add(s.nextDouble());
            }
        }*/
        return result;
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