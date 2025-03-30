package com.example.islandplugin.commands;

import com.example.islandplugin.IslandPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class IslandCommand implements CommandExecutor {

    private final IslandPlugin plugin;

    public IslandCommand(IslandPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (args.length > 0 && args[0].equalsIgnoreCase("생성")) {
                // 섬 생성 처리
                player.sendMessage("섬이 생성되었습니다!");
                return true;
            } else if (args.length > 0 && args[0].equalsIgnoreCase("설정")) {
                // 섬 설정 처리
                player.sendMessage("섬 설정 메뉴를 열었습니다!");
                return true;
            }
        }
        return false;
    }
}
