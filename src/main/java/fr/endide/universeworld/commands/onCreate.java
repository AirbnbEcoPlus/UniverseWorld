package fr.endide.universeworld.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class onCreate implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(args.length == 0) {
            player.sendMessage("§c/UniverseWorld add <name>");
            player.sendMessage("§c/UniverseWorld list");
            player.sendMessage("§c/UniverseWorld remove <name>");
        }
        if(args[0].equalsIgnoreCase("add")) {
            if(args.length == 1) {
                player.sendMessage("§c/UniverseWorld add <name>");
            }
            if(args.length == 2) {
                player.getInventory().addItem(new ItemStack(Material.WOODEN_AXE));
                player.sendMessage("Select the 4 corner of the portal");

            }
        }

        return false;
    }
}
