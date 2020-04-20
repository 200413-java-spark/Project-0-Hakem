package com.github.hakemawan.kingdoms;

import java.util.ArrayList;

import com.github.hakemawan.io.FReader;

public class Elves extends Kingdoms{

    Double[] elfStatA = new Double[8];
        
    public Double[] setElfStats() {
        FReader fr = new FReader();
        ArrayList<String> storer = fr.fetchFiles("2");
        for (int i = 0; i < storer.size(); i++) {
            this.elfStatA[i] = Double.parseDouble(storer.get(i));
        }   
        return this.elfStatA;
    }


    public String elfDisplay() {
        setElfStats();
        String stats = "Your Stats: Health: " + this.elfStatA[0] + " \n Strength: " + this.elfStatA[1] + "\n Constitution: " + this.elfStatA[2] 
                + "\n Agility: " + this.elfStatA[3] + "\n Intelligence: " + this.elfStatA[4] + "\n Range: " 
                + this.elfStatA[5] + "\n Growth: " + this.elfStatA[6] + "\n Population: " + this.elfStatA[7];
                return stats;
    }

}