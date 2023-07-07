package de.prime.lounge.industry.Maschienen;

import de.prime.lounge.industry.Industry;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class FurnaceEngin extends Maschine implements Listener {
    private Inventory inv;
    private ItemStack[] use = new ItemStack[]{new ItemStack(Material.COAL)};
    private ArmorStand mainStand;
    public FurnaceEngin(ArmorStand var1) {
        super(var1);
        mainStand = var1;
        var1.setVisible(false);
        var1.setCustomName("Furnace Engin");
        var1.setCustomNameVisible(true);
        inv = inventory(9*3, "Furnace Engine");
    }
    @Override
    public Inventory inventory(int size, String title) {
        super.inventory(size, title);
        return null;
    }
    @Override
    public void addEnergy(double energy) {
        if(inv.getContents() == use) {
            super.addEnergy(energy);
        }
    }
    public void onEntityInteraction(EntityInteractEvent e) {
    }
}
