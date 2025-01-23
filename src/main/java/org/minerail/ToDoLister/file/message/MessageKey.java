package org.minerail.ToDoLister.file.message;

public enum MessageKey {
    MESSAGES_INPUT_TYPE("Messages.Input-type"),
    MESSAGES_PREFIX_STRING("Messages.prefix.string");



    final String path;
    MessageKey(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }
}
