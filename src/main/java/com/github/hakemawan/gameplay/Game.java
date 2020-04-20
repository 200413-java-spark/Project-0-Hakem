package com.github.hakemawan.gameplay;

import com.github.hakemawan.kingdoms.Dwarves;
import com.github.hakemawan.kingdoms.Elves;
import com.github.hakemawan.kingdoms.Goblins;
import com.github.hakemawan.kingdoms.Humans;
import com.github.hakemawan.kingdoms.Kingdoms;

public class Game extends Kingdoms{

    Kingdoms yourKingdom = new Kingdoms();
    Kingdoms foeOne = new Kingdoms();
    Kingdoms foeTwo = new Kingdoms();
    Kingdoms foeThree = new Kingdoms();

    public void chooseKingdom (String input){
                
        this.yourKingdom.kindomType = input;
        this.yourKingdom.setKingdomType(yourKingdom.kindomType);
        
        
        
        if (this.yourKingdom.kindomType.equals("Human")) {
            System.out.println("You are the " + this.yourKingdom.kindomType + " Kingdom \n ");
            Humans hKing = new Humans();
            System.out.println(hKing.humanDisplay());
        }else if (this.yourKingdom.kindomType.equals("Elf")) {
            System.out.println("You are the " + this.yourKingdom.kindomType + " Kingdom \n ");
            Elves eKing = new Elves();
            System.out.println(eKing.elfDisplay());
        }else if (this.yourKingdom.kindomType.equals("Dwarf")) {
            System.out.println("You are the " + this.yourKingdom.kindomType + " Kingdom \n ");
            Dwarves dKing = new Dwarves();
            System.out.println(dKing.dwarfDisplay());
        }else if (this.yourKingdom.kindomType.equals("Goblin")) {
            System.out.println("You are the " + this.yourKingdom.kindomType + " Kingdom \n ");
            Goblins gKing = new Goblins();
            System.out.println(gKing.goblinDisplay());
        }
    }

    public void enemyKingdoms(){
        switch (this.yourKingdom.kindomType) {
            case "Human":
                this.foeOne.setKingdomType("2");
                this.foeTwo.setKingdomType("3");
                this.foeThree.setKingdomType("4");
                System.out.println("Your enemies are the: " + this.foeOne.kindomType + ", " + this.foeTwo.kindomType + ", " + this.foeThree.kindomType + " Kingdoms\n");
                break;
            case "Elf":
                this.foeOne.setKingdomType("1");
                this.foeTwo.setKingdomType("3");
                this.foeThree.setKingdomType("4");
                System.out.println("Your enemies are the: " + this.foeOne.kindomType + ", " + this.foeTwo.kindomType + ", " + this.foeThree.kindomType + " Kingdoms\n");
                break;
            case "Dwarf":
                this.foeOne.setKingdomType("2");
                this.foeTwo.setKingdomType("1");
                this.foeThree.setKingdomType("4");
                System.out.println("Your enemies are the: " + this.foeOne.kindomType + ", " + this.foeTwo.kindomType + ", " + this.foeThree.kindomType + " Kingdoms\n");
                break;
            case "Goblin":
                this.foeOne.setKingdomType("2");
                this.foeTwo.setKingdomType("3");
                this.foeThree.setKingdomType("1");
                System.out.println("Your enemies are the: " + this.foeOne.kindomType + ", " + this.foeTwo.kindomType + ", " + this.foeThree.kindomType + " Kingdoms\n");
                break;
            default:
                break;
        }
    }

    public void chooseToAttack(String input){
        switch (input) {
            case "1":
                System.out.println("You've entered battle with the " + this.foeOne.kindomType +" Kingdom!\n") ;
                break;
            case "2":
                System.out.println("You've entered battle with the " + this.foeTwo.kindomType +" Kingdom!\n") ;
                break;
            case "3":
                System.out.println("You've entered battle with the " + this.foeThree.kindomType +" Kingdom!\n") ;
                break;
            default:
                break;            
        }
        
    }


    /**
     * @return the foeOne
     */
    public Kingdoms getFoeOne() {
        return this.foeOne;
    }

    

    /**
     * @return the foeTwo
     */
    public Kingdoms getFoeTwo() {
        return this.foeTwo;
    }

    /**
         * @return the foeThree
         */
        public Kingdoms getFoeThree() {
            return this.foeThree;
        }
}