package org.minerail.ToDoLister.file.playerdata;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.minerail.ToDoLister.ToDoLister;
import org.minerail.ToDoLister.task.Task;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PlayerData extends Profile {

    private final File file;
    private final FileConfiguration config;

    public PlayerData(UUID uuid, String name) {
        super(uuid, name);
        this.file = new File("plugins/ToDoLister/playerdata", uuid + ".yml");
        this.config = YamlConfiguration.loadConfiguration(file);

        if (!file.exists()) {
            createPlayerFile();
        }
    }
    private void createPlayerFile() {
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
        } catch(Exception e) {
            ToDoLister.get().getLogger().warning("Error occurred while creating playerdata file! Message: " + e.getMessage());
        }
    }

    public List<Task> getTasks() {
        List<String> taskNames = config.getStringList("tasks");
        if (taskNames.isEmpty()) {
            return List.of(new Task("empty"));
        }
        List<Task> tasks = new ArrayList<>();
        for (String taskName : taskNames) {
            tasks.add(new Task(taskName));
        }
        return tasks;
    }

    public void addTask(Task task) {
        List<String> taskNames = config.getStringList("tasks");
        taskNames.add(task.getName());
        config.set("tasks", taskNames);
    }

    public void removeTask(Task task) {
        List<String> taskNames = config.getStringList("tasks");
        taskNames.remove(task.getName());
        config.set("tasks", taskNames);
    }

    public void clearTasks() {
        config.set("tasks", new ArrayList<>());
    }

    public void save() {
        try {
            config.save(file);
        } catch (Exception e) {
            ToDoLister.get().getLogger().warning("Error occurred while saving playerdata file! Message: " + e.getMessage());
        }
    }

}
