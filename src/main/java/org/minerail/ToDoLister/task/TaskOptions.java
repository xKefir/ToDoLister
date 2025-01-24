package org.minerail.ToDoLister.task;

import org.bukkit.Location;
import java.util.UUID;

public class TaskOptions {
    private final UUID taskID;
    private final String taskType;
    private final int createdAt;
    private final int endAt;
    private final String taskDescription;
    private final Location taskLocation;
    private final String taskDifficulty;
    private final String taskPriority;

    public TaskOptions(UUID taskID, String type, int createdAt, int endAt, String description, Location loc, String taskDifficulty, String taskPriority) {
        this.taskID = taskID;
        this.taskType = type;
        this.endAt = endAt;
        this.createdAt = createdAt;
        this.taskDescription = description;
        this.taskLocation = loc;
        this.taskDifficulty = taskDifficulty;
        this.taskPriority = taskPriority;
    }
    public UUID getTaskID() {
        return this.taskID;
    }
    public String getTaskType() {
        return this.taskType;
    }
    public int getCreatedAt() {
        return this.createdAt;
    }
    public int getEndAt() {
        return this.endAt;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }
    public Location getTaskLocation() {
        return this.taskLocation;
    }
    public String getTaskDifficulty() {
        return this.taskDifficulty;
    }
    public String getTaskPriority() {
        return this.taskPriority;
    }
}
