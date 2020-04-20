package com.github.hakemawan;

import java.util.Scanner;

import com.github.hakemawan.gameplay.Game;

class KC {

    public static void main(String[] args) {

        //variables
        //Kingdoms yourKingdom = new Kingdoms();
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        Boolean started = true; 
        
        //choose kingdom
        System.out.println("Choose Starting Kingdom: 1. Humans 2. Elves 3. Dwarves 4. Goblins");
        game.chooseKingdom(input.nextLine());
        //assign enemies 
        game.enemyKingdoms();

        //start game 

        while (started){
        //choose who to attack
        System.out.println("Who would you like to attack? 1. " + game.getFoeOne().kindomType + ", 2." + game.getFoeTwo().kindomType + ", 3." + game.getFoeThree().kindomType + " Kingdoms\n" );
        game.chooseToAttack(input.nextLine());
        

        }
        //System.out.println("Testing");
        input.close();
    }
}
