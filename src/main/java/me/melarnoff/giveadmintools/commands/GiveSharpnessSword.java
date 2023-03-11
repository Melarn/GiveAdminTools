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

public class GiveSharpnessSword implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("admintools.sharpsword")) {
            ItemStack sword = new ItemStack(Material.WOODEN_SWORD);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setDisplayName(ChatColor.RED + "ща убьет");
            swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 99999, true);
            swordMeta.addEnchant(Enchantment.FIRE_ASPECT, 99999, true);
            swordMeta.addEnchant(Enchantment.DURABILITY, 99999, true);
            sword.setItemMeta(swordMeta);
            player.getInventory().addItem(sword);
        } else {
            player.sendMessage("нееет");
        }
        return true;
    }
}
