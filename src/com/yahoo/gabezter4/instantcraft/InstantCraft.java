package com.yahoo.gabezter4.instantcraft;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public class InstantCraft extends JavaPlugin {

	public Inventory workbench;
	public final Methods m = new Methods();

	RecipeListener rl = new RecipeListener(this);
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(rl, this);
		getCommand("icrecipe").setExecutor(new Recipe(this));
		getCommand("icconfig").setExecutor(new Config(this));
		workbench = Bukkit.createInventory(null, InventoryType.WORKBENCH);
		File config = new File(getDataFolder() + File.separator + "config.yml");
		if (!config.exists()) {
			this.getLogger().info("Creating the config.yml file...");
			this.getConfig().options().copyDefaults(true);
			this.saveConfig();
		}
	}

	@Override
	public void onDisable() {
	}

	public Material wood = Material.WOOD;
	public Material stick = Material.STICK;
	public Material iron = Material.IRON_INGOT;
	public Material stone = Material.COBBLESTONE;
	public Material gold = Material.GOLD_INGOT;
	public Material diamond = Material.DIAMOND;

	public ItemStack wb1 = new ItemStack(wood, 4);
	public ItemStack wb11 = new ItemStack(wood, 1);
	public ItemStack wb2 = new ItemStack(Material.WORKBENCH, 1);
	public ItemStack chest1 = new ItemStack(wood, 8);
	public ItemStack chest2 = new ItemStack(Material.CHEST, 1);
	public ItemStack sign1 = new ItemStack(wood, 6);
	public ItemStack sign2 = new ItemStack(stick, 1);
	public ItemStack sign3 = new ItemStack(Material.SIGN, 3);
	public ItemStack wdoor1 = new ItemStack(wood, 6);
	public ItemStack wdoor2 = new ItemStack(Material.WOODEN_DOOR, 1);
	public ItemStack idoor1 = new ItemStack(iron, 6);
	public ItemStack idoor2 = new ItemStack(Material.IRON_DOOR, 1);
	public ItemStack tool = new ItemStack(stick, 2);
	public ItemStack axe1 = new ItemStack(wood, 1);
	public ItemStack axe2 = new ItemStack(Material.COBBLESTONE, 3);
	public ItemStack axe3 = new ItemStack(iron, 3);
	public ItemStack axe4 = new ItemStack(Material.GOLD_INGOT, 3);
	public ItemStack axe5 = new ItemStack(Material.DIAMOND, 3);
	public ItemStack axe_1 = new ItemStack(Material.WOOD_AXE, 1);
	public ItemStack axe_2 = new ItemStack(Material.STONE_AXE, 1);
	public ItemStack axe_3 = new ItemStack(Material.IRON_AXE, 1);
	public ItemStack axe_4 = new ItemStack(Material.GOLD_AXE, 1);
	public ItemStack axe_5 = new ItemStack(Material.DIAMOND_AXE, 1);
	public ItemStack pick1 = new ItemStack(wood, 3);
	public ItemStack pick2 = new ItemStack(Material.COBBLESTONE, 3);
	public ItemStack pick3 = new ItemStack(iron, 3);
	public ItemStack pick4 = new ItemStack(Material.GOLD_INGOT, 3);
	public ItemStack pick5 = new ItemStack(Material.DIAMOND, 3);
	public ItemStack pick_1 = new ItemStack(Material.WOOD_PICKAXE, 1);
	public ItemStack pick_2 = new ItemStack(Material.STONE_PICKAXE, 1);
	public ItemStack pick_3 = new ItemStack(Material.IRON_PICKAXE, 1);
	public ItemStack pick_4 = new ItemStack(Material.GOLD_PICKAXE, 1);
	public ItemStack pick_5 = new ItemStack(Material.DIAMOND_PICKAXE, 1);
	public ItemStack sword = new ItemStack(stick, 1);
	public ItemStack sword1 = new ItemStack(wood, 2);
	public ItemStack sword2 = new ItemStack(Material.COBBLESTONE, 2);
	public ItemStack sword3 = new ItemStack(iron, 2);
	public ItemStack sword4 = new ItemStack(Material.GOLD_INGOT, 2);
	public ItemStack sword5 = new ItemStack(Material.DIAMOND, 2);
	public ItemStack sword_1 = new ItemStack(Material.WOOD_SWORD, 1);
	public ItemStack sword_2 = new ItemStack(Material.STONE_SWORD, 1);
	public ItemStack sword_3 = new ItemStack(Material.IRON_SWORD, 1);
	public ItemStack sword_4 = new ItemStack(Material.GOLD_SWORD, 1);
	public ItemStack sword_5 = new ItemStack(Material.DIAMOND_SWORD, 1);
	public ItemStack hoe1 = new ItemStack(wood, 2);
	public ItemStack hoe2 = new ItemStack(Material.COBBLESTONE, 2);
	public ItemStack hoe3 = new ItemStack(iron, 2);
	public ItemStack hoe4 = new ItemStack(Material.GOLD_INGOT, 2);
	public ItemStack hoe5 = new ItemStack(Material.DIAMOND, 2);
	public ItemStack hoe_1 = new ItemStack(Material.WOOD_HOE, 1);
	public ItemStack hoe_2 = new ItemStack(Material.STONE_HOE, 1);
	public ItemStack hoe_3 = new ItemStack(Material.IRON_HOE, 1);
	public ItemStack hoe_4 = new ItemStack(Material.GOLD_HOE, 1);
	public ItemStack hoe_5 = new ItemStack(Material.DIAMOND_HOE, 1);
	public ItemStack shovel1 = new ItemStack(wood, 1);
	public ItemStack shovel2 = new ItemStack(Material.COBBLESTONE, 1);
	public ItemStack shovel3 = new ItemStack(iron, 1);
	public ItemStack shovel4 = new ItemStack(Material.GOLD_INGOT, 1);
	public ItemStack shovel5 = new ItemStack(Material.DIAMOND, 1);
	public ItemStack shovel_1 = new ItemStack(Material.WOOD_SPADE, 1);
	public ItemStack shovel_2 = new ItemStack(Material.STONE_SPADE, 1);
	public ItemStack shovel_3 = new ItemStack(Material.IRON_SPADE, 1);
	public ItemStack shovel_4 = new ItemStack(Material.GOLD_SPADE, 1);
	public ItemStack shovel_5 = new ItemStack(Material.DIAMOND_SPADE, 1);

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player player = (Player) sender;
		PlayerInventory inventory = player.getInventory();
		if (cmd.getName().equalsIgnoreCase("ic")) {
			sender.sendMessage(ChatColor.DARK_GREEN
					+ "This is the Main Command. Do /iccraft for the crafting. do /icrecipe for recipes.");
			sender.sendMessage(ChatColor.GREEN + "Version 1.0.0");
			sender.sendMessage(ChatColor.RED
					+ "Website: dev.bukkit.org/bukkit-plugins/instantcraft");
			sender.sendMessage(ChatColor.DARK_BLUE + "Possible Commands: "
					+ ChatColor.DARK_GREEN + "/iccraft" + ChatColor.DARK_BLUE
					+ "and" + ChatColor.DARK_GREEN + "/icrecipe");
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("iccraft")) {
			if (this.getConfig().getBoolean("Allow Instant Crafting", true)) {
				if (args.length == 0) {
					sender.sendMessage(ChatColor.DARK_AQUA + "_____"
							+ ChatColor.DARK_GREEN
							+ "Crafts Currently Allowed!!"
							+ ChatColor.DARK_AQUA + "_____");
					sender.sendMessage(ChatColor.DARK_BLUE
							+ "|Commmand Usage: " + ChatColor.AQUA
							+ "/iccraft [item/block name] (type)");
					sender.sendMessage(ChatColor.DARK_BLUE
							+ "|The (type) part of the command is not required, but it is the type of oject. The (type) of a wooden door would be wood. ");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Workbench");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Sign");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Chest");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Wood Door");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Iron Door");
					sender.sendMessage(ChatColor.DARK_GREEN
							+ "For more possible items do /iccraft list 2");
					return true;
				}
				if (args[0].equalsIgnoreCase("list")) {
					sender.sendMessage(ChatColor.DARK_AQUA + "_____"
							+ ChatColor.DARK_GREEN
							+ "Crafts Currently Allowed!!"
							+ ChatColor.DARK_AQUA + "_____");
					sender.sendMessage(ChatColor.DARK_BLUE
							+ "|Commmand Usage: " + ChatColor.AQUA
							+ "/iccraft [item/block name] (type)");
					sender.sendMessage(ChatColor.DARK_BLUE
							+ "|The (type) part of the command is not required, but it is the type of oject. The (type) of a wooden door would be wood. ");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Workbench");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Sign");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Chest");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Wood Door");
					sender.sendMessage(ChatColor.DARK_BLUE + "|- Iron Door");
					sender.sendMessage(ChatColor.DARK_GREEN
							+ "For more possible items do /iccraft list 2");
					if (args[1].equalsIgnoreCase("2")) {
						sender.sendMessage(ChatColor.DARK_AQUA + "_____"
								+ ChatColor.DARK_GREEN
								+ "Crafts Currently Allowed!! Page:2"
								+ ChatColor.DARK_AQUA + "_____");
						sender.sendMessage(ChatColor.DARK_BLUE + "|- All Tools");
						sender.sendMessage(ChatColor.DARK_GREEN
								+ "More will come soon.");
						return true;
					}
					return true;
				}
				if (args[0].equalsIgnoreCase("workbench")) {
					if (sender.hasPermission("ic.workbench"))
						if (sender.hasPermission("ic.all"))
							if (sender.hasPermission("ic.admin"))
								if (inventory.contains(wood)) {
									if (m.getWood(player) >= 4) {
										inventory.removeItem(wb1);
										inventory.addItem(wb2);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE + "Workbench");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Wood!!");
								}
					return true;
				}
				if (args[0].equalsIgnoreCase("chest")) {
					if (sender.hasPermission("ic.chest")) {
						if (sender.hasPermission("ic.all")) {
							if (sender.hasPermission("ic.admin")) {
								if (inventory.contains(wood)) {
									if (m.getWood(player) >= 8) {
										inventory.removeItem(chest1);
										inventory.addItem(chest2);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE + "Chest");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Wood!!");
									return true;
								}
							}
						}
					}
				}
				if (args[0].equalsIgnoreCase("sign")) {
					if (sender.hasPermission("ic.sign"))
						if (sender.hasPermission("ic.all"))
							if (sender.hasPermission("ic.admin"))
								if (inventory.contains(wood)) {
									if (m.getWood(player) >= 8) {
										if (inventory.contains(stick)) {
											if (m.getSticks(player) >= 1) {
												inventory.removeItem(sign2);
												inventory.removeItem(sign1);
												inventory.addItem(sign3);
												sender.sendMessage(ChatColor.DARK_AQUA
														+ "You now have a"
														+ ChatColor.RESET
														+ ChatColor.BLUE
														+ "Sign");
											}
										} else {
											sender.sendMessage(ChatColor.DARK_RED
													+ "You need Stick!!");
										}
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Wood!!");
								}
					return true;
				}
				if (args[0].equalsIgnoreCase("door")) {
					if (args[1].equalsIgnoreCase("wood")) {
						if (sender.hasPermission("ic.wdoor"))
							if (sender.hasPermission("ic.all"))
								if (sender.hasPermission("ic.admin"))
									if (inventory.contains(wood)) {
										if (m.getWood(player) >= 6) {
											inventory.removeItem(wdoor1);
											inventory.addItem(wdoor2);
											sender.sendMessage(ChatColor.DARK_AQUA
													+ "You now have a"
													+ ChatColor.RESET
													+ ChatColor.BLUE + "WDoor");
										}
									} else {
										sender.sendMessage(ChatColor.DARK_RED
												+ "You need more Wood!!");
									}
						return true;
					}
					if (args[1].equalsIgnoreCase("iron")) {
						if (sender.hasPermission("ic.idoor"))
							if (sender.hasPermission("ic.all"))
								if (sender.hasPermission("ic.admin"))
									if (inventory.contains(iron)) {
										if (m.getIron(player) >= 6) {
											inventory.removeItem(idoor1);
											inventory.addItem(idoor2);
											sender.sendMessage(ChatColor.DARK_AQUA
													+ "You now have an"
													+ ChatColor.RESET
													+ ChatColor.BLUE
													+ " Iron Door");
										}
									} else {
										sender.sendMessage(ChatColor.DARK_RED
												+ "You need more Iron!!");
									}
					}
					return true;
				}
				if (args[0].equalsIgnoreCase("axe")) {
					if (sender.hasPermission("ic.axe"))
						if (sender.hasPermission("ic.all"))
							if (sender.hasPermission("ic.admin"))
								if (args[1].equalsIgnoreCase("wood")) {
									if (m.getWood(player) >= 3) {
										if (inventory.contains(tool)) {
											if (m.getSticks(player) >= 2) {
												if (inventory.contains(wood)) {
													inventory.removeItem(tool);
													inventory.removeItem(axe1);
													inventory.addItem(axe_1);
													sender.sendMessage(ChatColor.DARK_AQUA
															+ "You now have a"
															+ ChatColor.RESET
															+ ChatColor.BLUE
															+ "Wood Axe");
												}
											} else {
												sender.sendMessage(ChatColor.DARK_RED
														+ "You need more Wood!!");
											}
										}
									} else {
										sender.sendMessage(ChatColor.DARK_RED
												+ "You need more Sticks!!");
									}
									return true;
								}
					if (args[1].equalsIgnoreCase("stone")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(stone)) {
									if (m.getStone(player) >= 3) {
										inventory.removeItem(tool);
										inventory.removeItem(axe2);
										inventory.addItem(axe_2);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE + "Stone Axe");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Stone!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					if (args[1].equalsIgnoreCase("iron")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(iron)) {
									if (m.getIron(player) >= 3) {
										inventory.removeItem(tool);
										inventory.removeItem(axe3);
										inventory.addItem(axe_3);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE + "Iron Axe");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Iron!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					if (args[1].equalsIgnoreCase("gold")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(gold)) {
									if (m.getGold(player) >= 3) {
										inventory.removeItem(tool);
										inventory.removeItem(axe4);
										inventory.addItem(axe_4);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE + "Gold Axe");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Gold!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					if (args[1].equalsIgnoreCase("diamond")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(diamond)) {
									if (m.getDiamond(player) >= 3) {
										inventory.removeItem(tool);
										inventory.removeItem(axe5);
										inventory.addItem(axe_5);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE
												+ "Diamond Axe");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Diamonds!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					return true;
				}
				if (args[0].equalsIgnoreCase("pickaxe")) {
					if (sender.hasPermission("ic.pickaxe"))
						if (sender.hasPermission("ic.all"))
							if (sender.hasPermission("ic.admin"))
								if (args[1].equalsIgnoreCase("wood")) {
									if (inventory.contains(tool)) {
										if (m.getSticks(player) >= 3) {
											if (inventory.contains(wood)) {
												if (m.getWood(player) >= 3) {
													inventory.removeItem(tool);
													inventory.removeItem(pick1);
													inventory.addItem(pick_1);
													sender.sendMessage(ChatColor.DARK_AQUA
															+ "You now have a"
															+ ChatColor.RESET
															+ ChatColor.BLUE
															+ "Wood Pickaxe");
												}
											} else {
												sender.sendMessage(ChatColor.DARK_RED
														+ "You need more Wood!!");
											}
										}
									} else {
										sender.sendMessage(ChatColor.DARK_RED
												+ "You need more Sticks!!");
									}
									return true;
								}
					if (args[1].equalsIgnoreCase("stone")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(stone)) {
									if (m.getStone(player) >= 3) {
										inventory.removeItem(tool);
										inventory.removeItem(pick2);
										inventory.addItem(pick_2);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE
												+ "Stone Pickaxe");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Stone!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					if (args[1].equalsIgnoreCase("iron")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(iron)) {
									if (m.getIron(player) >= 3) {
										inventory.removeItem(tool);
										inventory.removeItem(pick3);
										inventory.addItem(pick_3);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE
												+ "Iron Pickaxe");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Iron!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					if (args[1].equalsIgnoreCase("gold")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(gold)) {
									if (m.getGold(player) >= 3) {
										inventory.removeItem(tool);
										inventory.removeItem(pick4);
										inventory.addItem(pick_4);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE
												+ "Gold Pickaxe");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Gold!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					if (args[1].equalsIgnoreCase("diamond")) {
						if (inventory.contains(tool)) {
							if (m.getWood(player) >= 2) {
								if (inventory.contains(diamond)) {
									if (m.getDiamond(player) >= 3) {
										inventory.removeItem(tool);
										inventory.removeItem(pick5);
										inventory.addItem(pick_5);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE
												+ "Diamond Pickaxe");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Diamonds!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					return true;
				}
				if (args[0].equalsIgnoreCase("hoe")) {
					if (sender.hasPermission("ic.hoe"))
						if (sender.hasPermission("ic.all"))
							if (sender.hasPermission("ic.admin"))
								if (args[1].equalsIgnoreCase("wood")) {
									if (inventory.contains(tool)) {
										if (m.getSticks(player) >= 2) {
											if (inventory.contains(wood)) {
												if (m.getWood(player) >= 2) {
													inventory.removeItem(tool);
													inventory.removeItem(hoe1);
													inventory.addItem(hoe_1);
													sender.sendMessage(ChatColor.DARK_AQUA
															+ "You now have a"
															+ ChatColor.RESET
															+ ChatColor.BLUE
															+ "Wood Hoe");
												}
											} else {
												sender.sendMessage(ChatColor.DARK_RED
														+ "You need more Wood!!");
											}
										}
									} else {
										sender.sendMessage(ChatColor.DARK_RED
												+ "You need more Sticks!!");
									}
									return true;
								}
					if (args[1].equalsIgnoreCase("stone")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(stone)) {
									if (m.getStone(player) >= 2) {
										inventory.removeItem(tool);
										inventory.removeItem(hoe2);
										inventory.addItem(hoe_2);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE + "Stone Hoe");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Stone!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					if (args[1].equalsIgnoreCase("iron")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(iron)) {
									if (m.getIron(player) >= 2) {
										inventory.removeItem(tool);
										inventory.removeItem(hoe3);
										inventory.addItem(hoe_3);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE + "Iron Hoe");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Iron!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					if (args[1].equalsIgnoreCase("gold")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(gold)) {
									if (m.getGold(player) >= 2) {
										inventory.removeItem(tool);
										inventory.removeItem(hoe4);
										inventory.addItem(hoe_4);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE + "Gold Hoe");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Gold!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					if (args[1].equalsIgnoreCase("diamond")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(diamond)) {
									if (m.getDiamond(player) >= 2) {
										inventory.removeItem(tool);
										inventory.removeItem(hoe5);
										inventory.addItem(hoe_5);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE
												+ "Diamond Hoe");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Diamonds!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
				}
				if (args[0].equalsIgnoreCase("shovel")) {
					if (sender.hasPermission("ic.shovel"))
						if (sender.hasPermission("ic.all"))
							if (sender.hasPermission("ic.admin"))
								if (args[1].equalsIgnoreCase("wood")) {
									if (inventory.contains(tool)) {
										if (m.getSticks(player) >= 2) {
											if (inventory.contains(wood)) {
												if (m.getWood(player) >= 1) {
													inventory.removeItem(tool);
													inventory
															.removeItem(shovel1);
													inventory.addItem(shovel_1);
													sender.sendMessage(ChatColor.DARK_AQUA
															+ "You now have a"
															+ ChatColor.RESET
															+ ChatColor.BLUE
															+ "Wood Shovel");
												}
											} else {
												sender.sendMessage(ChatColor.DARK_RED
														+ "You need more Wood!!");
											}
										}
									} else {
										sender.sendMessage(ChatColor.DARK_RED
												+ "You need more Sticks!!");
									}
									return true;
								}
					if (args[1].equalsIgnoreCase("stone")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(stone)) {
									if (m.getStone(player) >= 1) {
										inventory.removeItem(tool);
										inventory.removeItem(shovel2);
										inventory.addItem(shovel_2);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE
												+ "Stone Shovel");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Stone!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					if (args[1].equalsIgnoreCase("iron")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(iron)) {
									if (m.getIron(player) >= 1) {
										inventory.removeItem(tool);
										inventory.removeItem(shovel3);
										inventory.addItem(shovel_3);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE
												+ "Iron Shovel");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Iron!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					if (args[1].equalsIgnoreCase("gold")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(gold)) {
									if (m.getGold(player) >= 1) {
										inventory.removeItem(tool);
										inventory.removeItem(shovel4);
										inventory.addItem(shovel_4);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE
												+ "Gold Shovel");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Gold!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					if (args[1].equalsIgnoreCase("diamond")) {
						if (inventory.contains(tool)) {
							if (m.getSticks(player) >= 2) {
								if (inventory.contains(diamond)) {
									if (m.getDiamond(player) >= 1) {
										inventory.removeItem(tool);
										inventory.removeItem(shovel5);
										inventory.addItem(shovel_5);
										sender.sendMessage(ChatColor.DARK_AQUA
												+ "You now have a"
												+ ChatColor.RESET
												+ ChatColor.BLUE
												+ "Diamond Shovel");
									}
								} else {
									sender.sendMessage(ChatColor.DARK_RED
											+ "You need more Diamonds!!");
								}
							}
						} else {
							sender.sendMessage(ChatColor.DARK_RED
									+ "You need more Sticks!!");
						}
						return true;
					}
					return true;
				}
				return true;
			} else {
				sender.sendMessage(ChatColor.DARK_RED
						+ "Crafting this way is not allowed!!");
			}
			return true;
		}
		return false;
	}
}