package com.yahoo.gabezter4.instantcraft;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Config implements CommandExecutor  {

	private InstantCraft plugin;
	public Config(InstantCraft plugin){this.plugin = plugin;}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("icconfig")){
			if(args[0].equalsIgnoreCase("crafting")){
				if(args[1].equalsIgnoreCase("true")){
					plugin.getConfig().set("Allow Instant Crafting", true);
					sender.sendMessage(ChatColor.DARK_RED + "Crafting via Plugin is now allowed!!!");
					return true;
				}
				if(args[1].equalsIgnoreCase("false")){
					plugin.getConfig().set("Allow Instant Crafting", false);
					sender.sendMessage(ChatColor.DARK_RED + "Crafting via Plugin is now NOT allowed!!!");
					return true;
				}
			}
			return true;
		}
		return false;
				}
}
