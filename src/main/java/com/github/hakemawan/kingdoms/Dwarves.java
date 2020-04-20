package com.github.hakemawan.kingdoms;

import java.util.ArrayList;

import com.github.hakemawan.io.FReader;

public class Dwarves extends Kingdoms{

    Double[] dwarfStatA = new Double[8];
        
    public Double[] setDwarfStats() {
        FReader fr = new FReader();
        ArrayList<String> storer = fr.fetchFiles("3");
        for (int i = 0; i < storer.size(); i++) {
            this.dwarfStatA[i] = Double.parseDouble(storer.get(i));
        }   
        return this.dwarfStatA;
    }


    public String dwarfDisplay() {
        setDwarfStats();
        String stats = "Your Stats: Health: " + this.dwarfStatA[0] + " \n Strength: " + this.dwarfStatA[1] + "\n Constitution: " + this.dwarfStatA[2] 
                + "\n Agility: " + this.dwarfStatA[3] + "\n Intelligence: " + this.dwarfStatA[4] + "\n Range: " 
                + this.dwarfStatA[5] + "\n Growth: " + this.dwarfStatA[6] + "\n Population: " + this.dwarfStatA[7];
                return stats;
    }

}