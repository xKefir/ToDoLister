package org.minerail.ToDoLister.event;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.minerail.ToDoLister.file.playerdata.PlayerData;
import org.minerail.ToDoLister.file.playerdata.PlayerDataRegistry;

import java.util.UUID;

public class EventListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        UUID uuid = event.getPlayer().getUniqueId();
        String name = event.getPlayer().getName();
        PlayerData data = PlayerDataRegistry.getPlayerData(uuid, name);
    }
}
