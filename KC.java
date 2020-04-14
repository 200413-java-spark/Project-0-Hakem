import java.util.Scanner;

class KC {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Starting Kingdom: 1. Elves 2. Humans 3. Dwarves 4. Goblins");
        String kingdom = input.nextLine();
        if (kingdom == "1") {
        Elf king1 = new Elf();
        }else if (kingdom == "2") {
            Human king2 = new Human();
        }else if (kingdom == "3") {
            Dwarf king3 = new Dwarf();
        }else if (kingdom == "4") {
            Goblin king4 = new Goblin();
        }

        

        
    }
}