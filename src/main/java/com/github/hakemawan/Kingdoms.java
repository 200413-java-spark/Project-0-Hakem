package com.github.hakemawan;

import java.io.File;

public class Kingdoms extends Stats {
    String kindomType; 
    File file; 

   
    public void setKingdomType(String kindomType) {
        switch (kindomType) {
            case "1":
                this.kindomType = "Human";
                System.out.println("You are the " + this.kindomType + " Kingdom \n ");
                break;
            case "2":
                this.kindomType = "Elf";
                System.out.println("You are the " + this.kindomType + " Kingdom \n ");
                break;
            case "3":
                this.kindomType = "Dwarf";
                System.out.println("You are the " + this.kindomType + " Kingdom \n ");
                break;
            case "4":
                this.kindomType = "Goblin";
                System.out.println("You are the " + this.kindomType + " Kingdom \n ");
                break;
            default:
                break;
        }
    }    
}