package com.example.islandplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class IslandPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // 플러그인 활성화 시 초기화
        getLogger().info("IslandPlugin 활성화!");
        this.getCommand("섬").setExecutor(new IslandCommand(this));
    }

    @Override
    public void onDisable() {
        // 플러그인 비활성화 시 처리
        getLogger().info("IslandPlugin 비활성화!");
    }
}
