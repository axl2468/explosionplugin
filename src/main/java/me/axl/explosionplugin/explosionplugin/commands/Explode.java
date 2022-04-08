package me.axl.explosionplugin.explosionplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class Explode implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("explosionplugin.explode")) {
                Player receiver = (Player) sender;

                if (args.length > 0) {
                    receiver = (Player) sender;
                }

                receiver.getWorld().spawnEntity(receiver.getLocation(), EntityType.PRIMED_TNT);
                player.sendMessage(ChatColor.RED + "TNT Spawned.");

            } else {
                player.sendMessage(ChatColor.RED + "Error: You do not have permission to use that command.");
            }
        }
        else {
            System.out.println("You need to be a player to execute this command.");
        }
        return true;
    }

}
