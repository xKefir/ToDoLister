package org.minerail.ToDoLister.file.message;

import org.bukkit.configuration.file.YamlConfiguration;
import org.minerail.ToDoLister.ToDoLister;
import java.io.File;

public class MessageProviderLoader {
    private static YamlConfiguration messages;

    public static void reload() {
        File cnf = new File(ToDoLister.get().getDataFolder().toPath() + "/messages.yml");
        if (!cnf.exists()) {
            ToDoLister.get().saveResource("messages.yml", false);
        }
        messages = YamlConfiguration.loadConfiguration(cnf);
    }
    public static YamlConfiguration getLoader() {
        return messages;
    }
}
