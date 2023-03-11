package me.melarnoff.giveadmintools.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class InstantDamegeEvent implements Listener {

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        Entity damager = event.getDamager();
        Entity victim = event.getEntity();
        if (damager instanceof Player && victim instanceof Player) {
            Player player = (Player) damager;
            if (player.getInventory().getItemInMainHand().getType().toString().toLowerCase().contains("ща убьет")) {
                event.setDamage(100);
            }
        }
    }
}
