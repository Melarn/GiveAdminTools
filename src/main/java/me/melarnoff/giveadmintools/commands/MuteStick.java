package me.melarnoff.giveadmintools.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class MuteStick implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("admintools.muteleather")) {
            ItemStack mutestick = new ItemStack(Material.LEATHER);
            ItemMeta mutestickMeta = mutestick.getItemMeta();
            mutestickMeta.setDisplayName(ChatColor.MAGIC + "mutestick");
            mutestickMeta.addEnchant(Enchantment.LUCK, 1, true);
            mutestick.setItemMeta(mutestickMeta);
            player.getInventory().addItem(mutestick);
        } else {
            player.sendMessage("net");
        }
        return true;
    }
}
