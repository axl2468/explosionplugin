package me.axl.explosionplugin.explosionplugin;

import me.axl.explosionplugin.explosionplugin.commands.*;

import org.bukkit.plugin.java.JavaPlugin;

public final class ExplosionPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Explosion Plugin has initialized.");
        getCommand("givetnt").setExecutor(new GiveTNT());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
