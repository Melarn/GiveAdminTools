package me.melarnoff.giveadmintools.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class StickKickEvent implements Listener {

    @EventHandler
    public void onPlayerKick(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        event.getRightClicked();
        if (event.getRightClicked() instanceof Player) {
            Player toKick = (Player)event.getRightClicked();
            PlayerInventory inv = player.getInventory();
            ItemStack mainHand = inv.getItemInMainHand();
            if (player.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.MAGIC + "lll")) {
                toKick.getWorld().strikeLightningEffect(toKick.getLocation());
                toKick.kickPlayer("fds");
            }
        }
    }
}
