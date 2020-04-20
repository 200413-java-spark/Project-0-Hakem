package com.github.hakemawan.kingdoms;

import java.util.ArrayList;

import com.github.hakemawan.io.FReader;

public class Goblins extends Kingdoms{

    Double[] goblinStatA = new Double[8];
        
    public Double[] setGoblinStats() {
        FReader fr = new FReader();
        ArrayList<String> storer = fr.fetchFiles("4");
        for (int i = 0; i < storer.size(); i++) {
            this.goblinStatA[i] = Double.parseDouble(storer.get(i));
        }   
        return this.goblinStatA;
    }


    public String goblinDisplay() {
        setGoblinStats();
        String stats = "Your Stats: Health: " + this.goblinStatA[0] + " \n Strength: " + this.goblinStatA[1] + "\n Constitution: " + this.goblinStatA[2] 
                + "\n Agility: " + this.goblinStatA[3] + "\n Intelligence: " + this.goblinStatA[4] + "\n Range: " 
                + this.goblinStatA[5] + "\n Growth: " + this.goblinStatA[6] + "\n Population: " + this.goblinStatA[7];
                return stats;
    }

}