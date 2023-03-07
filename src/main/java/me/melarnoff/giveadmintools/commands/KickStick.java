package me.melarnoff.giveadmintools.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class KickStick implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("admintools.kickstick")) {
            ItemStack stick = new ItemStack(Material.STICK);
            ItemMeta stickMeta = stick.getItemMeta();
            stickMeta.setDisplayName("Кик палка");
            stickMeta.addEnchant(Enchantment.LUCK, 1, true);
            stick.setItemMeta(stickMeta);
        }
        return true;
    }
}
