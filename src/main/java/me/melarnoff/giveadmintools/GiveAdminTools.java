package me.melarnoff.giveadmintools;

import me.melarnoff.giveadmintools.commands.OneHitSword;
import me.melarnoff.giveadmintools.commands.KickBedrock;
import me.melarnoff.giveadmintools.listeners.InstantDamageSwordEvent;
import me.melarnoff.giveadmintools.listeners.BedrockClickKickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class GiveAdminTools extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BedrockClickKickEvent(), this);
        getServer().getPluginManager().registerEvents(new InstantDamageSwordEvent(), this);
        getCommand("kickbedrock").setExecutor(new KickBedrock());
        getCommand("ogogomech").setExecutor(new OneHitSword());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
