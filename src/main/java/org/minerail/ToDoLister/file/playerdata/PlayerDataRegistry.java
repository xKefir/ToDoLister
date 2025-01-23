package org.minerail.ToDoLister.file.playerdata;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PlayerDataRegistry {
    private static final Map<UUID, PlayerData> PLAYER_DATA_MAP = new ConcurrentHashMap<>();

    public static PlayerData getPlayerData(UUID uuid, String name) {
        return PLAYER_DATA_MAP.computeIfAbsent(uuid, id -> new PlayerData(id, name));
    }

    public static void saveAll() {
        PLAYER_DATA_MAP.values().forEach(PlayerData::save);
    }
}