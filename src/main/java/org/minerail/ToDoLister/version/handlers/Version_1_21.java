package org.minerail.ToDoLister.version.handlers;

import org.bukkit.plugin.java.JavaPlugin;
import org.minerail.ToDoLister.version.VersionHandler;

public class Version_1_21 implements VersionHandler {
    @Override
    public void initialize(JavaPlugin plugin) {
        plugin.getLogger().info("Initializing features for version 1.20.1");
    }

    @Override
    public void cleanup() {

    }
}
