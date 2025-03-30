package com.example.islandplugin.util;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ConfigManager {

    private final JavaPlugin plugin;

    public ConfigManager(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    // 설정을 로드하는 메소드
    public void loadConfig() {
        FileConfiguration config = plugin.getConfig();
        config.addDefault("island.default-size", 25);
        plugin.saveConfig();
    }
}
