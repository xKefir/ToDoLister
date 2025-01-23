package org.minerail.ToDoLister;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.minerail.ToDoLister.file.config.Config;
import org.minerail.ToDoLister.file.message.MessageProviderLoader;

public final class ToDoLister extends JavaPlugin {
    public static Plugin get() {
        return Bukkit.getPluginManager().getPlugin("ToDoLister");
    }

    @Override
    public void onEnable() {
        reloadAll();
    }

    private void reloadAll() {
        Config.reload();
        MessageProviderLoader.reload();
    }

    @Override
    public void onDisable() {
    }
}
