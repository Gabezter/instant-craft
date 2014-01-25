package com.yahoo.gabezter4.instantcraft;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public class InstantCraft extends JavaPlugin implements Listener {
		
	public static Inventory workbench;
		@Override
		public void onEnable() {
			workbench = Bukkit.createInventory(null, InventoryType.WORKBENCH);
			File config = new File(getDataFolder() + File.separator + "config.yml");
			if (!config.exists()){
				this.getLogger().info("Creating the config.yml file...");
				this.getConfig().options().copyDefaults(true);
				this.saveConfig();
				}}

		@Override
		public void onDisable() {}
		
		Material wood = Material.WOOD;
		Material stick = Material.STICK;
		Material iron = Material.IRON_INGOT;
		Material stone = Material.COBBLESTONE;
		Material gold = Material.GOLD_INGOT;
		Material diamond = Material.DIAMOND;
		
		ItemStack wb1 = new ItemStack(wood, 4);
		ItemStack wb11 = new ItemStack(wood, 1);
		ItemStack wb2 = new ItemStack(Material.WORKBENCH, 1);
		ItemStack chest1 = new ItemStack(wood, 8);
		ItemStack chest2 = new ItemStack(Material.CHEST, 1);
		ItemStack sign1 = new ItemStack(wood, 6);
		ItemStack sign2 = new ItemStack(stick, 1);
		ItemStack sign3 = new ItemStack(Material.SIGN, 3);
		ItemStack wdoor1 = new ItemStack(wood, 6);
		ItemStack wdoor2 = new ItemStack(Material.WOODEN_DOOR, 1);
		ItemStack idoor1 = new ItemStack(iron, 6);
		ItemStack idoor2 = new ItemStack(Material.IRON_DOOR, 1);
		ItemStack tool = new ItemStack(stick, 2);
		ItemStack axe1 = new ItemStack(wood, 1);
		ItemStack axe2 = new ItemStack(Material.COBBLESTONE, 3);
		ItemStack axe3 = new ItemStack(iron, 3);
		ItemStack axe4 = new ItemStack(Material.GOLD_INGOT,3);
		ItemStack axe5 = new ItemStack(Material.DIAMOND, 3);
		ItemStack axe_1 = new ItemStack(Material.WOOD_AXE, 1);
		ItemStack axe_2 = new ItemStack(Material.STONE_AXE, 1);
		ItemStack axe_3 = new ItemStack(Material.IRON_AXE, 1);
		ItemStack axe_4 = new ItemStack(Material.GOLD_AXE, 1);
		ItemStack axe_5 = new ItemStack(Material.DIAMOND_AXE, 1);
		ItemStack pick1 = new ItemStack(wood, 3);
		ItemStack pick2 = new ItemStack(Material.COBBLESTONE, 3);
		ItemStack pick3 = new ItemStack(iron, 3);
		ItemStack pick4 = new ItemStack(Material.GOLD_INGOT,3);
		ItemStack pick5 = new ItemStack(Material.DIAMOND, 3);
		ItemStack pick_1 = new ItemStack(Material.WOOD_PICKAXE, 1);
		ItemStack pick_2 = new ItemStack(Material.STONE_PICKAXE, 1);
		ItemStack pick_3 = new ItemStack(Material.IRON_PICKAXE, 1);
		ItemStack pick_4 = new ItemStack(Material.GOLD_PICKAXE, 1);
		ItemStack pick_5 = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemStack sword = new ItemStack(stick, 1);
		ItemStack sword1 = new ItemStack(wood, 2);
		ItemStack sword2 = new ItemStack(Material.COBBLESTONE, 2);
		ItemStack sword3 = new ItemStack(iron, 2);
		ItemStack sword4 = new ItemStack(Material.GOLD_INGOT,2);
		ItemStack sword5 = new ItemStack(Material.DIAMOND, 2);
		ItemStack sword_1 = new ItemStack(Material.WOOD_SWORD, 1);
		ItemStack sword_2 = new ItemStack(Material.STONE_SWORD, 1);
		ItemStack sword_3 = new ItemStack(Material.IRON_SWORD, 1);
		ItemStack sword_4 = new ItemStack(Material.GOLD_SWORD, 1);
		ItemStack sword_5 = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemStack hoe1 = new ItemStack(wood, 2);
		ItemStack hoe2 = new ItemStack(Material.COBBLESTONE, 2);
		ItemStack hoe3 = new ItemStack(iron, 2);
		ItemStack hoe4 = new ItemStack(Material.GOLD_INGOT, 2);
		ItemStack hoe5 = new ItemStack(Material.DIAMOND, 2);
		ItemStack hoe_1 = new ItemStack(Material.WOOD_HOE, 1);
		ItemStack hoe_2 = new ItemStack(Material.STONE_HOE, 1);
		ItemStack hoe_3 = new ItemStack(Material.IRON_HOE, 1);
		ItemStack hoe_4 = new ItemStack(Material.GOLD_HOE, 1);
		ItemStack hoe_5 = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemStack shovel1 = new ItemStack(wood, 1);
		ItemStack shovel2 = new ItemStack(Material.COBBLESTONE, 1);
		ItemStack shovel3 = new ItemStack(iron, 1);
		ItemStack shovel4 = new ItemStack(Material.GOLD_INGOT,1);
		ItemStack shovel5 = new ItemStack(Material.DIAMOND, 1);
		ItemStack shovel_1 = new ItemStack(Material.WOOD_SPADE, 1);
		ItemStack shovel_2 = new ItemStack(Material.STONE_SPADE, 1);
		ItemStack shovel_3 = new ItemStack(Material.IRON_SPADE, 1);
		ItemStack shovel_4 = new ItemStack(Material.GOLD_SPADE, 1);
		ItemStack shovel_5 = new ItemStack(Material.DIAMOND_SPADE, 1);
		
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
				Player player = (Player) sender;
				PlayerInventory inventory = player.getInventory();
				ItemStack[] inv = inventory.getContents();
		if(cmd.getName().equalsIgnoreCase("ic")){
		    sender.sendMessage(ChatColor.DARK_GREEN + "This is the Main Command. Do /iccraft for the crafting. do /icrecipe for recipes.");
		    sender.sendMessage(ChatColor.GREEN + "Version 1.0.0");
		    sender.sendMessage(ChatColor.RED + "Website: dev.bukkit.org/bukkit-plugins/instantcraft");
		    sender.sendMessage(ChatColor.DARK_BLUE + "Possible Commands: "+ ChatColor.DARK_GREEN + "/iccraft" + ChatColor.DARK_BLUE + "and" + ChatColor.DARK_GREEN + "/icrecipe");
		    return true;
		}
		if(cmd.getName().equalsIgnoreCase("iccraft")){ 
			if(this.getConfig().getBoolean("Allow Instant Crafting", true)){
				if(args[0].equalsIgnoreCase("list")){
					sender.sendMessage(ChatColor.DARK_AQUA + "_____" + ChatColor.DARK_GREEN + "Crafts Currently Allowed!!" + ChatColor.DARK_AQUA + "_____");
					sender.sendMessage(ChatColor.DARK_BLUE + "|Commmand Usage: " + ChatColor.AQUA + "/iccraft [item/block name] (type)");
					sender.sendMessage(ChatColor.DARK_BLUE + "|The (type) part of the command is not required, but it is the type of oject. The (type) of a wooden door would be wood. ");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Workbench");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Sign");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Chest");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Wood Door");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Iron Door");
					sender.sendMessage(ChatColor.DARK_GREEN + "For more possible items do /iccraft list 2");
					if(args[1].equalsIgnoreCase("2")){
						sender.sendMessage(ChatColor.DARK_AQUA + "_____" + ChatColor.DARK_GREEN + "Crafts Currently Allowed!! Page:2" + ChatColor.DARK_AQUA + "_____");
						sender.sendMessage(ChatColor.DARK_BLUE + "|- All Tools");
						sender.sendMessage(ChatColor.DARK_BLUE + "|- All Swords");
						sender.sendMessage(ChatColor.DARK_GREEN + "More will come soon.");
					}}
				if(args[0].equalsIgnoreCase("workbench")){
						if(sender.hasPermission("ic.workbench"))
							if(sender.hasPermission("ic.all"))
								if(sender.hasPermission("ic.admin"))
									if(inventory.contains(wood)){
										if(((ItemStack) player).getAmount() >= 4){
											inventory.removeItem(wb1);
											inventory.addItem(wb2);
											sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Workbench");
										}}else{sender.sendMessage(ChatColor.DARK_RED + "You need more Wood!!");}return true;} 
				if(args[0].equalsIgnoreCase("chest")){
					if(sender.hasPermission("ic.chest"))
						if(sender.hasPermission("ic.all"))
							if(sender.hasPermission("ic.admin"))
								if(inventory.contains(wood)){
								for(int i = 0; 1< inv.length; i++){
									if(inv[i] !=null){
										if(inv[i].getAmount() >= 8){
											inventory.removeItem(chest1);
											inventory.addItem(chest2);
											sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Chest");
											}}}}else{
										sender.sendMessage(ChatColor.DARK_RED + "You need more Wood!!");
										}} 
				if(args[0].equalsIgnoreCase("sign")){
					if(sender.hasPermission("ic.sign"))
						if(sender.hasPermission("ic.all"))
							if(sender.hasPermission("ic.admin"))
								if(inventory.contains(wood)){
										for(int iii = 0; 1< inv.length; iii++){
											if(inv[iii] !=null){
												if(inv[iii].getAmount() >=2){
													if(inventory.contains(stick)){
														for(int i = 0; 1< inv.length; i++){
															if(inv[i] !=null){
																if(inv[i].getAmount() >= 1){
																	inventory.removeItem(sign2);
																	inventory.removeItem(sign1);
																	inventory.addItem(sign3);
																	sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Sign");			
															}}}}else{
																sender.sendMessage(ChatColor.DARK_RED + "You need Stick!!");
															}
												}}}}else{
													sender.sendMessage(ChatColor.DARK_RED + "You need more Wood!!");
												}return true;
				}
				if(args[0].equalsIgnoreCase("door")){
					if(args[1].equalsIgnoreCase("wood")){
						if(sender.hasPermission("ic.wdoor"))
							if(sender.hasPermission("ic.all"))
								if(sender.hasPermission("ic.admin"))
									if(inventory.contains(wood)){
										for(int i = 0; 1< inv.length; i++){
											if(inv[i] !=null){
												if(inv[i].getAmount() >= 6){
													inventory.removeItem(wdoor1);
													inventory.addItem(wdoor2);
													sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Door");			
												}}}}else{
													sender.sendMessage(ChatColor.DARK_RED + "You need more Wood!!");
												}
					return true;}
					if(args[1].equalsIgnoreCase("iron")){
						if(sender.hasPermission("ic.idoor"))
							if(sender.hasPermission("ic.all"))
								if(sender.hasPermission("ic.admin"))
									if(inventory.contains(iron)){
										for(int i = 0; 1< inv.length; i++){
											if(inv[i] !=null){
												if(inv[i].getAmount() >= 6){
														inventory.removeItem(idoor1);
														inventory.addItem(idoor2);
														sender.sendMessage(ChatColor.DARK_AQUA + "You now have an" + ChatColor.RESET + ChatColor.BLUE + " Iron Door");			
												}}}}else{
														sender.sendMessage(ChatColor.DARK_RED + "You need more Iron!!");
													}
					}return true;
				}
					if(args[0].equalsIgnoreCase("axe")){
						if(sender.hasPermission("ic.axe"))
							if(sender.hasPermission("ic.all"))
								if(sender.hasPermission("ic.admin"))
									if(args[1].equalsIgnoreCase("wood")){
										if(inventory.contains(tool)){
											for(int i = 0; 1< inv.length; i++){
												if(inv[i] !=null){
													if(inv[i].getAmount() >= 2){
														if(inventory.contains(wood)){
															for(int ii = 0; 1< inv.length; ii++){
																if(inv[ii] !=null){
																	if(inv[ii].getAmount() >= 2){
																		inventory.removeItem(tool);
																		inventory.removeItem(axe1);
																		inventory.addItem(axe_1);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Wood Axe");			
																	}}}}else{
																		sender.sendMessage(ChatColor.DARK_RED + "You need more Wood!!");
																	}
																	}}}}else{
																	sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");	
																}return true;
									}
									if(args[1].equalsIgnoreCase("stone")){
										if(inventory.contains(tool)){
											for(int i = 0; 1< inv.length; i++){
												if(inv[i] !=null){
													if(inv[i].getAmount() >= 2){
														if(inventory.contains(stone)){
															for(int ii = 0; 1< inv.length; ii++){
																if(inv[ii] !=null){
																	if(inv[ii].getAmount() >= 3){
																		inventory.removeItem(tool);
																		inventory.removeItem(axe2);
																		inventory.addItem(axe_2);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Stone Axe");			
																	}}}}else{
																		sender.sendMessage(ChatColor.DARK_RED + "You need more Stone!!");
																	}
													}}}}else{
														sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
										}return true;
									}
									if(args[1].equalsIgnoreCase("iron")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >= 3){
														if(inventory.contains(iron)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >= 3){
																		inventory.removeItem(tool);
																		inventory.removeItem(axe3);
																		inventory.addItem(axe_3);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Iron Axe");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Iron!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}
									if(args[1].equalsIgnoreCase("gold")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >= 2){
														if(inventory.contains(gold)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >= 3){
																		inventory.removeItem(tool);
																		inventory.removeItem(axe4);
																		inventory.addItem(axe_4);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Gold Axe");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Gold!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}
									if(args[1].equalsIgnoreCase("diamond")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >= 2){
														if(inventory.contains(diamond)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >= 3){
																		inventory.removeItem(tool);
																		inventory.removeItem(axe5);
																		inventory.addItem(axe_5);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Diamond Axe");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Diamonds!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}return true;
					}	
					if(args[0].equalsIgnoreCase("pickaxe")){
						if(sender.hasPermission("ic.pickaxe"))
							if(sender.hasPermission("ic.all"))
								if(sender.hasPermission("ic.admin"))
									if(args[1].equalsIgnoreCase("wood")){
										if(inventory.contains(tool)){
											if(inventory.contains(wood)){
												for(int i = 0; 1< inv.length; i++){
													if(inv[i] !=null){
														if(inv[i].getAmount() >= 2){
															inventory.removeItem(tool);
															inventory.removeItem(pick1);
															inventory.addItem(pick_1);
															sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Wood Pickaxe");			
														}}}}else{
															sender.sendMessage(ChatColor.DARK_RED + "You need more Wood!!");
														}
													}else{
														sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");	
													}return true;
									}
									if(args[1].equalsIgnoreCase("stone")){
										if(inventory.contains(tool)){
											for(int i = 0; 1< inv.length; i++){
												if(inv[i] !=null){
													if(inv[i].getAmount() >= 2){
														if(inventory.contains(stone)){
															for(int ii = 0; 1< inv.length; ii++){
																if(inv[ii] !=null){
																	if(inv[ii].getAmount() >= 2){
																		inventory.removeItem(tool);
																		inventory.removeItem(pick2);
																		inventory.addItem(pick_2);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Stone Pickaxe");			
																	}}}}else{
																		sender.sendMessage(ChatColor.DARK_RED + "You need more Stone!!");
																	}
													}}}}else{
														sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
										}return true;
									}
									if(args[1].equalsIgnoreCase("iron")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >=2){
														if(inventory.contains(iron)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >=3){
																		inventory.removeItem(tool);
																		inventory.removeItem(pick3);
																		inventory.addItem(pick_3);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Iron Pickaxe");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Iron!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}
									if(args[1].equalsIgnoreCase("gold")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >=2){
														if(inventory.contains(gold)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >=3){
																		inventory.removeItem(tool);
																		inventory.removeItem(pick4);
																		inventory.addItem(pick_4);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Gold Pickaxe");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Gold!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}
									if(args[1].equalsIgnoreCase("diamond")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >=2){
														if(inventory.contains(diamond)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >=3){
																		inventory.removeItem(tool);
																		inventory.removeItem(pick5);
																		inventory.addItem(pick_5);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Diamond Pickaxe");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Diamonds!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}return true;
					}
					if(args[0].equalsIgnoreCase("hoe")){
						if(sender.hasPermission("ic.hoe"))
							if(sender.hasPermission("ic.all"))
								if(sender.hasPermission("ic.admin"))
									if(args[1].equalsIgnoreCase("wood")){
										if(inventory.contains(tool)){
											if(inventory.contains(wood)){
												for(int i = 0; 1< inv.length; i++){
													if(inv[i] !=null){
														if(inv[i].getAmount() >= 2){
															inventory.removeItem(tool);
															inventory.removeItem(hoe1);
															inventory.addItem(hoe_1);
															sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Wood Hoe");			
														}}}}else{
															sender.sendMessage(ChatColor.DARK_RED + "You need more Wood!!");
														}
													}else{
														sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");	
													}return true;
									}
									if(args[1].equalsIgnoreCase("stone")){
										if(inventory.contains(tool)){
											for(int i = 0; 1< inv.length; i++){
												if(inv[i] !=null){
													if(inv[i].getAmount() >= 2){
														if(inventory.contains(stone)){
															for(int ii = 0; 1< inv.length; ii++){
																if(inv[ii] !=null){
																	if(inv[ii].getAmount() >= 2){
																		inventory.removeItem(tool);
																		inventory.removeItem(hoe2);
																		inventory.addItem(hoe_2);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Stone Hoe");			
																	}}}}else{
																		sender.sendMessage(ChatColor.DARK_RED + "You need more Stone!!");
																	}
													}}}}else{
														sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
										}return true;
									}
									if(args[1].equalsIgnoreCase("iron")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >=2){
														if(inventory.contains(iron)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >=2){
																		inventory.removeItem(tool);
																		inventory.removeItem(hoe3);
																		inventory.addItem(hoe_3);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Iron Hoe");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Iron!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}
									if(args[1].equalsIgnoreCase("gold")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >=2){
														if(inventory.contains(gold)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >=2){
																		inventory.removeItem(tool);
																		inventory.removeItem(hoe4);
																		inventory.addItem(hoe_4);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Gold Hoe");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Gold!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}
									if(args[1].equalsIgnoreCase("diamond")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >=2){
														if(inventory.contains(diamond)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >=2){
																		inventory.removeItem(tool);
																		inventory.removeItem(hoe5);
																		inventory.addItem(hoe_5);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Diamond Hoe");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Diamonds!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}}
					if(args[0].equalsIgnoreCase("shovel")){
						if(sender.hasPermission("ic.shovel"))
							if(sender.hasPermission("ic.all"))
								if(sender.hasPermission("ic.admin"))
									if(args[1].equalsIgnoreCase("wood")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >=2){
														if(inventory.contains(wood)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >=1){
																		inventory.removeItem(tool);
																		inventory.removeItem(shovel1);
																		inventory.addItem(shovel_1);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Wood Shovel");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Wood!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}
									if(args[1].equalsIgnoreCase("stone")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >=2){
														if(inventory.contains(stone)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >= 4){
																		inventory.removeItem(tool);
																		inventory.removeItem(shovel2);
																		inventory.addItem(shovel_2);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Stone Shovel");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Stone!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}
									if(args[1].equalsIgnoreCase("iron")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >= 4){
														if(inventory.contains(iron)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >= 4){
																		inventory.removeItem(tool);
																		inventory.removeItem(shovel3);
																		inventory.addItem(shovel_3);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Iron Shovel");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Iron!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}
									if(args[1].equalsIgnoreCase("gold")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >= 4){
														if(inventory.contains(gold)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >= 4){
																		inventory.removeItem(tool);
																		inventory.removeItem(shovel4);
																		inventory.addItem(shovel_4);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Gold Shovel");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Gold!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}
									if(args[1].equalsIgnoreCase("daimond")){
										if(inventory.contains(tool)){
											for(int iii = 0; 1< inv.length; iii++){
												if(inv[iii] !=null){
													if(inv[iii].getAmount() >= 4){
														if(inventory.contains(diamond)){
															for(int iiii = 0; 1< inv.length; iiii++){
																if(inv[iiii] !=null){
																	if(inv[iiii].getAmount() >= 4){
																		inventory.removeItem(tool);
																		inventory.removeItem(shovel5);
																		inventory.addItem(shovel_5);
																		sender.sendMessage(ChatColor.DARK_AQUA + "You now have a" + ChatColor.RESET + ChatColor.BLUE + "Diamond Shovel");			
																	}}}}else{
												sender.sendMessage(ChatColor.DARK_RED + "You need more Diamonds!!");
											}
													}}}}else{
											sender.sendMessage(ChatColor.DARK_RED + "You need more Sticks!!");
											}return true;
									}
								}

					sender.sendMessage(ChatColor.DARK_AQUA + "_____" + ChatColor.DARK_GREEN + "Crafts Currently Allowed!!" + ChatColor.DARK_AQUA + "_____");
					sender.sendMessage(ChatColor.DARK_BLUE + "|Commmand Usage: " + ChatColor.AQUA + "/iccraft [item/block name] (type)");
					sender.sendMessage(ChatColor.DARK_BLUE + "|The (type) part of the command is not required, but it is the type of oject. The (type) of a wooden door would be wood. ");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Workbench");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Sign");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Chest");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Wood Door");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Iron Door");
					sender.sendMessage(ChatColor.DARK_GREEN + "For more possible items do /iccraft list 2");
						}else{
						sender.sendMessage(ChatColor.DARK_RED + "Crafting this way is not allowed!!");
					}
				return true;
		}if(cmd.getName().equalsIgnoreCase("icrecipe")){
			sender.sendMessage(ChatColor.DARK_AQUA + "_____" + ChatColor.DARK_GREEN + "Recipes Currently Added!!" + ChatColor.DARK_AQUA + "_____");
			sender.sendMessage(ChatColor.DARK_BLUE + "Workbench");
			sender.sendMessage(ChatColor.DARK_GREEN + "More will be added soon.");
			if(args[0].equalsIgnoreCase("workbench")){
				workbench.setItem(1, wb11);
				workbench.setItem(2, wb11);
				workbench.setItem(3, wb11);
				workbench.setItem(5, wb11);
				workbench.setItem(10, wb2);
				player.openInventory(workbench);
				return true;	
			}
			return true;
		}return false;}
	


	@EventHandler
	public void OnInventoryClick(InventoryClickEvent event){
		if(event.getInventory() == workbench){
			if(event.getCurrentItem().getType() == wood){
				event.setCancelled(true);
			}
			if(event.getCurrentItem().getType() == Material.WORKBENCH){
				event.setCancelled(true);
			}}}
	@EventHandler
	public void onInventoryLeave(InventoryCloseEvent event){
		if(event.getInventory() == workbench){
			workbench.clear();
		}}}