package org.minerail.ToDoLister.task;

public class Task {
    private final String name;
    private boolean completed;
    private TaskOptions options;

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public void setOptions(TaskOptions options1) {
        this.options = new TaskOptions(
                options1.getTaskID(),
                options1.getTaskType(),
                options1.getCreatedAt(),
                options1.getEndAt(),
                options1.getTaskDescription(),
                options1.getTaskLocation(),
                options1.getTaskDifficulty(),
                options1.getTaskPriority());
    }

    public TaskOptions getOptions() {
        return this.options;
    }
    @Override
    public String toString() {
        return (completed ? "[✔] " : "[ ] ") + name;
    }
}
