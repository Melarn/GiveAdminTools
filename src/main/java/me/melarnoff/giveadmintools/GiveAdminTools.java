package me.melarnoff.giveadmintools;

import me.melarnoff.giveadmintools.commands.GiveSharpnessSword;
import me.melarnoff.giveadmintools.commands.KickBedrock;
import me.melarnoff.giveadmintools.listeners.StickKickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class GiveAdminTools extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new StickKickEvent(), this);
        getCommand("kickbedrock").setExecutor(new KickBedrock());
        getCommand("ogogomech").setExecutor(new GiveSharpnessSword());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
