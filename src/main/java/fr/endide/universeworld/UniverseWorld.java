package fr.endide.universeworld;

import fr.endide.universeworld.utils.Chat;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;


public final class UniverseWorld extends JavaPlugin {
    public List<Player> players = new ArrayList<Player>();
    @Override
    public void onEnable() {
        Chat.console("Plugin UniverseWorld is loading");
        saveDefaultConfig();


        Chat.console("Plugin UniverseWorld as successfully loaded");
    }

    @Override
    public void onDisable() {
        Chat.console("Plugin UniverseWorld as successfully unloaded");
    }
}
