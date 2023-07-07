package de.prime.lounge.industry;

import java.util.ArrayList;

public class Energy {
    private ArrayList<Double> energy;
    public Energy() {
        energy = new ArrayList<>();
    }
    public Double getEnergy() {
        return energy.get(1);
    }
   public ArrayList<Double> addEnergy(double add) {
        energy.add(add);
        return energy;
   }
    public ArrayList<Double> removeEnergy(double remove) {
        energy.add(remove);
        return energy;
    }
}
