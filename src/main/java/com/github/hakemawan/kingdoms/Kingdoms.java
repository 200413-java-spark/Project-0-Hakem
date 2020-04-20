package com.github.hakemawan.kingdoms;

//import com.github.hakemawan.Game;

public class Kingdoms {
    public String kindomType; 
   
    public void setKingdomType(String kindomType) {
        switch (kindomType) {
            case "1":
                this.kindomType = "Human";
                break;
            case "2":
                this.kindomType = "Elf";
                break;
            case "3":
                this.kindomType = "Dwarf";
                break;
            case "4":
                this.kindomType = "Goblin";
                break;
            default:
                break;
        }
    }    
}