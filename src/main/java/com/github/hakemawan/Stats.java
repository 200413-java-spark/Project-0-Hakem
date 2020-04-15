package com.github.hakemawan;

public class Stats {

    //stats
    Double health; //constitution*strength
    Double strength; //main damage stat (strenght*pop)
    Double constitution; //main defense stat (constitution*pop)
    Double agility; // >agility attacks first
    Double intelligence; 
    Double range; // (intelligence + range + agility) /10 = # of attacks
    Double growth; //pop growth per turn
    Double pop;   // population
    
   /* public Stats() {   //default constructor(humans)
        strength = 10.0;  // 1
        constitution = 10.0; //2
        agility = 10.0; //3
        intelligence = 10.0; //4
        range = 10.0; //5
        growth = 1.5;  //6
        pop = 1500.0;  //7
        health = constitution * strenght;
    }*/

    //setters and getters
    /**
     * @param strength the strength to set
     */
    public void setStrength(Double strength) {
        this.strength = strength;
    }

    /**
     * @param constitution the constitution to set
     */
    public void setConstitution(Double constitution) {
        this.constitution = constitution;
    }

    /**
     * @param agility the agility to set
     */
    public void setAgility(Double agility) {
        this.agility = agility;
    }

    /**
     * @param intelligence the intelligence to set
     */
    public void setIntelligence(Double intelligence) {
        this.intelligence = intelligence;
    }   

    /**
     * @param range the range to set
     */
    public void setRange(Double range) {
        this.range = range;
    }

    /**
     * @param growth the growth to set
     */
    public void setGrowth(Double growth) {
        this.growth = growth;
    }

    /**
     * @param pop the pop to set
     */
    public void setPop(Double pop) {
        this.pop = pop;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(Double health) {
        this.health = strength * constitution;;
    }

}