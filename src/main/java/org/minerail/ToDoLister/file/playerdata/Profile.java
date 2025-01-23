package org.minerail.ToDoLister.file.playerdata;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Profile {
    private static final Map<UUID, String> PROFILE_MAP = new ConcurrentHashMap<>();
    private final UUID uuid;
    private final String name;

    public Profile(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;
        addToMap();
    }

    public void addToMap() {
        PROFILE_MAP.put(this.uuid, this.name);
    }

    public static String getPlayerName(UUID uuid) {
        return PROFILE_MAP.get(uuid);
    }

    public UUID getUUID() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    public static Map<UUID, String> getProfileMap() {
        return PROFILE_MAP;
    }
}