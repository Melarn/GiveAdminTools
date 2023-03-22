package me.melarnoff.giveadmintools.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class StickMuteEvent implements Listener {

    @EventHandler
    public void onMuteEntity(PlayerInteractEntityEvent event) {
        if (event.getRightClicked() instanceof Entity) {
            Player player = event.getPlayer();
            Entity toMute = event.getRightClicked();
            PlayerInventory inventory = player.getInventory();
            ItemStack inMainHand = inventory.getItemInMainHand();
            if (inMainHand != null && inMainHand.hasItemMeta() &&
                    inMainHand.getItemMeta().hasDisplayName() &&
                    inMainHand.getItemMeta().getDisplayName().equals(ChatColor.MAGIC + "mutestick")) {
                toMute.getWorld();
                toMute.setSilent(true);
            }
        }
    }
}
