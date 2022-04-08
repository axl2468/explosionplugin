package me.axl.explosionplugin.explosionplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GiveTNT implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if(player.hasPermission("explosionplugin.givetnt")) {
                ItemStack tnt = new ItemStack(Material.TNT, 20);

                player.getInventory().addItem(tnt);
                player.sendMessage(ChatColor.RED + "20 TNT blocks given.");
            }
            else {
                player.sendMessage(ChatColor.RED + "Error: You do not have permission to use that command.");
            }

        }

        return true;
    }

}
