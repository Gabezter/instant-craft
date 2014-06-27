package com.yahoo.gabezter4.instantcraft;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Recipe implements CommandExecutor {
	private InstantCraft plugin;
	public Recipe(InstantCraft plugin){this.plugin = plugin;}
	Player player;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("icrecipe")){
			if (args.length == 0) {
			sender.sendMessage(ChatColor.DARK_AQUA + "_____" + ChatColor.DARK_GREEN + "Recipes Currently Added!!" + ChatColor.DARK_AQUA + "_____");
			sender.sendMessage(ChatColor.DARK_BLUE + "Workbench");
			sender.sendMessage(ChatColor.DARK_GREEN + "More will be added soon.");
			return true;
			}if(args[0].equalsIgnoreCase("workbench")){
				plugin.workbench.setItem(1, plugin.wb11);
				plugin.workbench.setItem(2, plugin.wb11);
				plugin.workbench.setItem(4, plugin.wb11);
				plugin.workbench.setItem(5, plugin.wb11);
				plugin.workbench.setItem(0, plugin.wb2);
				((Player) sender).openInventory(plugin.workbench);
				return true;	
			}
			return true;}
	return false;}
}
