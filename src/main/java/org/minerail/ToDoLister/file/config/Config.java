package org.minerail.ToDoLister.file.config;

import org.bukkit.configuration.file.YamlConfiguration;
import org.minerail.ToDoLister.ToDoLister;
import java.io.File;

public class Config {
    private static YamlConfiguration config;

    public static void reload() {
        File cnf = new File(ToDoLister.get().getDataFolder().toPath() + "/config.yml");
        if (!cnf.exists()) {
            ToDoLister.get().saveResource("config.yml", false);
        }
        config = YamlConfiguration.loadConfiguration(cnf);
    }
    public static YamlConfiguration getConfig() {
        return config;
    }
}
