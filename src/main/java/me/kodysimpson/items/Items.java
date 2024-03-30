package me.kodysimpson.items;

import me.kodysimpson.items.commands.MenuCommand;
import me.kodysimpson.items.listeners.InventoryListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Items extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("menu").setExecutor(new MenuCommand());
        getServer().getPluginManager().registerEvents(new InventoryListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
