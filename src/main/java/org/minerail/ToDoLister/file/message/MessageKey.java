package org.minerail.ToDoLister.file.message;

public enum MessageKey {
    MESSAGES_INPUT_TYPE("Messages.Input-type"),
    MESSAGES_PREFIX_STRING("Messages.prefix.string"),

    TASK_OPTIONS_PRIORITY_LOW("Task-options.priority.LOW"),
    TASK_OPTIONS_PRIORITY_MEDIUM(),
    TASK_OPTIONS_PRIORITY_HIGH(),
    TASK_OPTIONS_PRIORITY_EXTREME(),
    //Reload command
    MESSAGES_COMMAND_RELOAD_SUCCESS("Messages.Command.reload.success"),
    MESSAGES_COMMAND_RELOAD_FAILED("Messages.Command.reload.failed");

    final String path;
    MessageKey(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }
}
