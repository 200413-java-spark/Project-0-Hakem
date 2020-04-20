package com.github.hakemawan.kingdoms;

import java.util.ArrayList;

import com.github.hakemawan.io.FReader;

public class Humans extends Kingdoms{

    Double[] humanStatA = new Double[8];
        
    public Double[] setHumanStats() {
        FReader fr = new FReader();
        ArrayList<String> storer = fr.fetchFiles("1");
        for (int i = 0; i < storer.size(); i++) {
            this.humanStatA[i] = Double.parseDouble(storer.get(i));
        }   
        return this.humanStatA;
    }


    public String humanDisplay() {
        setHumanStats();
        String stats = "Your Stats: Health: " + this.humanStatA[0] + " \n Strength: " + this.humanStatA[1] + "\n Constitution: " + this.humanStatA[2] 
                + "\n Agility: " + this.humanStatA[3] + "\n Intelligence: " + this.humanStatA[4] + "\n Range: " 
                + this.humanStatA[5] + "\n Growth: " + this.humanStatA[6] + "\n Population: " + this.humanStatA[7];
                return stats;
    }

}