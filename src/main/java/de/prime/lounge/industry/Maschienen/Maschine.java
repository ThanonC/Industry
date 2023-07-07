package de.prime.lounge.industry.Maschienen;

import de.prime.lounge.industry.Energy;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public abstract class Maschine {
    private Inventory inv;
    private ArmorStand stand;
    public Maschine(ArmorStand machinePart) {
        this.stand = machinePart;
    }
    public Inventory inventory(int size, String title) {
        inv = Bukkit.createInventory(null, size, title);
        return inv;
    }
    public void energyUsage(double energy) {
        new Energy().removeEnergy(energy);
    }
    public void addEnergy(double energy) {
        new Energy().addEnergy(energy);
    }
}
