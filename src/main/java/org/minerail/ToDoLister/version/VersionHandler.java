package org.minerail.ToDoLister.version;

import org.bukkit.plugin.java.JavaPlugin;

public interface VersionHandler {
    void initialize(JavaPlugin plugin);
    void cleanup();
}