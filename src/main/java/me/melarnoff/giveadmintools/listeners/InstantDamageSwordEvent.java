package me.melarnoff.giveadmintools.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InstantDamageSwordEvent implements Listener {

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if (event.getDamager().getType() == EntityType.PLAYER && event.getDamager() instanceof Player) {
            Player player = (Player) event.getDamager();
            ItemStack item = player.getInventory().getItemInMainHand();

            // Check if the player is holding a sword
            if (item.getType() == Material.NETHERITE_SWORD) {
                ItemMeta meta = item.getItemMeta();

                // Check if the sword has the name "One-Hit Kill Sword"
                if (meta.hasDisplayName() && meta.getDisplayName().equals(ChatColor.RED + "ща убьет")) {
                    Entity target = event.getEntity();

                    // Set the damage dealt to the maximum value
                    event.setDamage(1000);
                }
            }
        }
    }
}
