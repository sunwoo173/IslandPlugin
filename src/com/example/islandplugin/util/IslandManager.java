package com.example.islandplugin.util;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class IslandManager {

    private final World islandWorld;

    public IslandManager(World islandWorld) {
        this.islandWorld = islandWorld;
    }

    // 섬을 생성하는 메소드
    public void createIsland(Player player) {
        Location islandLocation = new Location(islandWorld, 0, 100, 0);
        player.teleport(islandLocation);
        islandLocation.getBlock().setType(Material.GRASS_BLOCK);
    }
}
