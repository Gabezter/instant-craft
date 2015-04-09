/*     */ package com.yahoo.gabezter4.instantcraft;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.util.logging.Logger;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.Server;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.command.PluginCommand;
/*     */ import org.bukkit.configuration.file.FileConfiguration;
/*     */ import org.bukkit.configuration.file.FileConfigurationOptions;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.inventory.InventoryType;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.PlayerInventory;
/*     */ import org.bukkit.plugin.PluginManager;
/*     */ import org.bukkit.plugin.java.JavaPlugin;
/*     */ 
/*     */ public class InstantCraft extends JavaPlugin
/*     */ {
/*     */   public Inventory workbench;
/*  20 */   public final Methods m = new Methods();
/*     */ 
/*  22 */   RecipeListener rl = new RecipeListener(this);
/*     */ 
/*  41 */   public Material wood = Material.WOOD;
/*  42 */   public Material stick = Material.STICK;
/*  43 */   public Material iron = Material.IRON_INGOT;
/*  44 */   public Material stone = Material.COBBLESTONE;
/*  45 */   public Material gold = Material.GOLD_INGOT;
/*  46 */   public Material diamond = Material.DIAMOND;
/*     */ 
/*  48 */   public ItemStack wb1 = new ItemStack(wood, 4);
/*  49 */   public ItemStack wb11 = new ItemStack(wood, 1);
/*  50 */   public ItemStack wb2 = new ItemStack(Material.WORKBENCH, 1);
/*  51 */   public ItemStack chest1 = new ItemStack(wood, 8);
/*  52 */   public ItemStack chest2 = new ItemStack(Material.CHEST, 1);
/*  53 */   public ItemStack sign1 = new ItemStack(wood, 6);
/*  54 */   public ItemStack sign2 = new ItemStack(stick, 1);
/*  55 */   public ItemStack sign3 = new ItemStack(Material.SIGN, 3);
/*  56 */   public ItemStack wdoor1 = new ItemStack(wood, 6);
/*  57 */   public ItemStack wdoor2 = new ItemStack(Material.WOODEN_DOOR, 1);
/*  58 */   public ItemStack idoor1 = new ItemStack(iron, 6);
/*  59 */   public ItemStack idoor2 = new ItemStack(Material.IRON_DOOR, 1);
/*  60 */   public ItemStack tool = new ItemStack(stick, 2);
/*  61 */   public ItemStack axe1 = new ItemStack(wood, 1);
/*  62 */   public ItemStack axe2 = new ItemStack(Material.COBBLESTONE, 3);
/*  63 */   public ItemStack axe3 = new ItemStack(iron, 3);
/*  64 */   public ItemStack axe4 = new ItemStack(Material.GOLD_INGOT, 3);
/*  65 */   public ItemStack axe5 = new ItemStack(Material.DIAMOND, 3);
/*  66 */   public ItemStack axe_1 = new ItemStack(Material.WOOD_AXE, 1);
/*  67 */   public ItemStack axe_2 = new ItemStack(Material.STONE_AXE, 1);
/*  68 */   public ItemStack axe_3 = new ItemStack(Material.IRON_AXE, 1);
/*  69 */   public ItemStack axe_4 = new ItemStack(Material.GOLD_AXE, 1);
/*  70 */   public ItemStack axe_5 = new ItemStack(Material.DIAMOND_AXE, 1);
/*  71 */   public ItemStack pick1 = new ItemStack(wood, 3);
/*  72 */   public ItemStack pick2 = new ItemStack(Material.COBBLESTONE, 3);
/*  73 */   public ItemStack pick3 = new ItemStack(iron, 3);
/*  74 */   public ItemStack pick4 = new ItemStack(Material.GOLD_INGOT, 3);
/*  75 */   public ItemStack pick5 = new ItemStack(Material.DIAMOND, 3);
/*  76 */   public ItemStack pick_1 = new ItemStack(Material.WOOD_PICKAXE, 1);
/*  77 */   public ItemStack pick_2 = new ItemStack(Material.STONE_PICKAXE, 1);
/*  78 */   public ItemStack pick_3 = new ItemStack(Material.IRON_PICKAXE, 1);
/*  79 */   public ItemStack pick_4 = new ItemStack(Material.GOLD_PICKAXE, 1);
/*  80 */   public ItemStack pick_5 = new ItemStack(Material.DIAMOND_PICKAXE, 1);
/*  81 */   public ItemStack sword = new ItemStack(stick, 1);
/*  82 */   public ItemStack sword1 = new ItemStack(wood, 2);
/*  83 */   public ItemStack sword2 = new ItemStack(Material.COBBLESTONE, 2);
/*  84 */   public ItemStack sword3 = new ItemStack(iron, 2);
/*  85 */   public ItemStack sword4 = new ItemStack(Material.GOLD_INGOT, 2);
/*  86 */   public ItemStack sword5 = new ItemStack(Material.DIAMOND, 2);
/*  87 */   public ItemStack sword_1 = new ItemStack(Material.WOOD_SWORD, 1);
/*  88 */   public ItemStack sword_2 = new ItemStack(Material.STONE_SWORD, 1);
/*  89 */   public ItemStack sword_3 = new ItemStack(Material.IRON_SWORD, 1);
/*  90 */   public ItemStack sword_4 = new ItemStack(Material.GOLD_SWORD, 1);
/*  91 */   public ItemStack sword_5 = new ItemStack(Material.DIAMOND_SWORD, 1);
/*  92 */   public ItemStack hoe1 = new ItemStack(wood, 2);
/*  93 */   public ItemStack hoe2 = new ItemStack(Material.COBBLESTONE, 2);
/*  94 */   public ItemStack hoe3 = new ItemStack(iron, 2);
/*  95 */   public ItemStack hoe4 = new ItemStack(Material.GOLD_INGOT, 2);
/*  96 */   public ItemStack hoe5 = new ItemStack(Material.DIAMOND, 2);
/*  97 */   public ItemStack hoe_1 = new ItemStack(Material.WOOD_HOE, 1);
/*  98 */   public ItemStack hoe_2 = new ItemStack(Material.STONE_HOE, 1);
/*  99 */   public ItemStack hoe_3 = new ItemStack(Material.IRON_HOE, 1);
/* 100 */   public ItemStack hoe_4 = new ItemStack(Material.GOLD_HOE, 1);
/* 101 */   public ItemStack hoe_5 = new ItemStack(Material.DIAMOND_HOE, 1);
/* 102 */   public ItemStack shovel1 = new ItemStack(wood, 1);
/* 103 */   public ItemStack shovel2 = new ItemStack(Material.COBBLESTONE, 1);
/* 104 */   public ItemStack shovel3 = new ItemStack(iron, 1);
/* 105 */   public ItemStack shovel4 = new ItemStack(Material.GOLD_INGOT, 1);
/* 106 */   public ItemStack shovel5 = new ItemStack(Material.DIAMOND, 1);
/* 107 */   public ItemStack shovel_1 = new ItemStack(Material.WOOD_SPADE, 1);
/* 108 */   public ItemStack shovel_2 = new ItemStack(Material.STONE_SPADE, 1);
/* 109 */   public ItemStack shovel_3 = new ItemStack(Material.IRON_SPADE, 1);
/* 110 */   public ItemStack shovel_4 = new ItemStack(Material.GOLD_SPADE, 1);
/* 111 */   public ItemStack shovel_5 = new ItemStack(Material.DIAMOND_SPADE, 1);
/*     */ 
/*     */   public void onEnable()
/*     */   {
/*  25 */     getServer().getPluginManager().registerEvents(rl, this);
/*  26 */     getCommand("icrecipe").setExecutor(new Recipe(this));
/*  27 */     getCommand("icconfig").setExecutor(new Config(this));
/*  28 */     workbench = Bukkit.createInventory(null, InventoryType.WORKBENCH);
/*  29 */     File config = new File(getDataFolder() + File.separator + "config.yml");
/*  30 */     if (!config.exists()) {
/*  31 */       getLogger().info("Creating the config.yml file...");
/*  32 */       getConfig().options().copyDefaults(true);
/*  33 */       saveConfig();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void onDisable()
/*     */   {
/*     */   }
/*     */ 
/*     */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*     */   {
/* 115 */     Player player = (Player)sender;
/* 116 */     PlayerInventory inventory = player.getInventory();
/* 117 */     if (cmd.getName().equalsIgnoreCase("ic")) {
/* 118 */       sender.sendMessage(ChatColor.DARK_GREEN + 
/* 119 */         "This is the Main Command. Do /iccraft for the crafting. do /icrecipe for recipes.");
/* 120 */       sender.sendMessage(ChatColor.GREEN + "Version 1.0.0");
/* 121 */       sender.sendMessage(ChatColor.RED + 
/* 122 */         "Website: dev.bukkit.org/bukkit-plugins/instantcraft");
/* 123 */       sender.sendMessage(ChatColor.DARK_BLUE + "Possible Commands: " + 
/* 124 */         ChatColor.DARK_GREEN + "/iccraft" + ChatColor.DARK_BLUE + 
/* 125 */         "and" + ChatColor.DARK_GREEN + "/icrecipe");
/* 126 */       return true;
/*     */     }
/* 128 */     if (cmd.getName().equalsIgnoreCase("iccraft")) {
/* 129 */       if (getConfig().getBoolean("Allow Instant Crafting", true)) {
/* 130 */         if (args.length == 0) {
/* 131 */           sender.sendMessage(ChatColor.DARK_AQUA + "_____" + 
/* 132 */             ChatColor.DARK_GREEN + 
/* 133 */             "Crafts Currently Allowed!!" + 
/* 134 */             ChatColor.DARK_AQUA + "_____");
/* 135 */           sender.sendMessage(ChatColor.DARK_BLUE + 
/* 136 */             "|Commmand Usage: " + ChatColor.AQUA + 
/* 137 */             "/iccraft [item/block name] (type)");
/* 138 */           sender.sendMessage(ChatColor.DARK_BLUE + 
/* 139 */             "|The (type) part of the command is not required, but it is the type of oject. The (type) of a wooden door would be wood. ");
/* 140 */           sender.sendMessage(ChatColor.DARK_BLUE + "|- Workbench");
/* 141 */           sender.sendMessage(ChatColor.DARK_BLUE + "|- Sign");
/* 142 */           sender.sendMessage(ChatColor.DARK_BLUE + "|- Chest");
/* 143 */           sender.sendMessage(ChatColor.DARK_BLUE + "|- Wood Door");
/* 144 */           sender.sendMessage(ChatColor.DARK_BLUE + "|- Iron Door");
/* 145 */           sender.sendMessage(ChatColor.DARK_GREEN + 
/* 146 */             "For more possible items do /iccraft list 2");
/* 147 */           return true;
/*     */         }
/* 149 */         if (args[0].equalsIgnoreCase("list")) {
/* 150 */           sender.sendMessage(ChatColor.DARK_AQUA + "_____" + 
/* 151 */             ChatColor.DARK_GREEN + 
/* 152 */             "Crafts Currently Allowed!!" + 
/* 153 */             ChatColor.DARK_AQUA + "_____");
/* 154 */           sender.sendMessage(ChatColor.DARK_BLUE + 
/* 155 */             "|Commmand Usage: " + ChatColor.AQUA + 
/* 156 */             "/iccraft [item/block name] (type)");
/* 157 */           sender.sendMessage(ChatColor.DARK_BLUE + 
/* 158 */             "|The (type) part of the command is not required, but it is the type of oject. The (type) of a wooden door would be wood. ");
/* 159 */           sender.sendMessage(ChatColor.DARK_BLUE + "|- Workbench");
/* 160 */           sender.sendMessage(ChatColor.DARK_BLUE + "|- Sign");
/* 161 */           sender.sendMessage(ChatColor.DARK_BLUE + "|- Chest");
/* 162 */           sender.sendMessage(ChatColor.DARK_BLUE + "|- Wood Door");
/* 163 */           sender.sendMessage(ChatColor.DARK_BLUE + "|- Iron Door");
/* 164 */           sender.sendMessage(ChatColor.DARK_GREEN + 
/* 165 */             "For more possible items do /iccraft list 2");
/* 166 */           if (args[1].equalsIgnoreCase("2")) {
/* 167 */             sender.sendMessage(ChatColor.DARK_AQUA + "_____" + 
/* 168 */               ChatColor.DARK_GREEN + 
/* 169 */               "Crafts Currently Allowed!! Page:2" + 
/* 170 */               ChatColor.DARK_AQUA + "_____");
/* 171 */             sender.sendMessage(ChatColor.DARK_BLUE + "|- All Tools");
/* 172 */             sender.sendMessage(ChatColor.DARK_GREEN + 
/* 173 */               "More will come soon.");
/* 174 */             return true;
/*     */           }
/* 176 */           return true;
/*     */         }
/* 178 */         if (args[0].equalsIgnoreCase("workbench")) {
/* 179 */           if ((sender.hasPermission("ic.workbench")) && 
/* 180 */             (sender.hasPermission("ic.all")) && 
/* 181 */             (sender.hasPermission("ic.admin"))) {
/* 182 */             if (inventory.contains(wood)) {
/* 183 */               if (m.getWood(player) >= 4) {
/* 184 */                 inventory.removeItem(new ItemStack[] { wb1 });
/* 185 */                 inventory.addItem(new ItemStack[] { wb2 });
/* 186 */                 sender.sendMessage(ChatColor.DARK_AQUA + 
/* 187 */                   "You now have a" + 
/* 188 */                   ChatColor.RESET + 
/* 189 */                   ChatColor.BLUE + "Workbench");
/*     */               }
/*     */             }
/* 192 */             else sender.sendMessage(ChatColor.DARK_RED + 
/* 193 */                 "You need more Wood!!");
/*     */           }
/* 195 */           return true;
/*     */         }
/* 197 */         if ((args[0].equalsIgnoreCase("chest")) && 
/* 198 */           (sender.hasPermission("ic.chest")) && 
/* 199 */           (sender.hasPermission("ic.all")) && 
/* 200 */           (sender.hasPermission("ic.admin"))) {
/* 201 */           if (inventory.contains(wood)) {
/* 202 */             if (m.getWood(player) >= 8) {
/* 203 */               inventory.removeItem(new ItemStack[] { chest1 });
/* 204 */               inventory.addItem(new ItemStack[] { chest2 });
/* 205 */               sender.sendMessage(ChatColor.DARK_AQUA + 
/* 206 */                 "You now have a" + 
/* 207 */                 ChatColor.RESET + 
/* 208 */                 ChatColor.BLUE + "Chest");
/*     */             }
/*     */           } else {
/* 211 */             sender.sendMessage(ChatColor.DARK_RED + 
/* 212 */               "You need more Wood!!");
/* 213 */             return true;
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/* 219 */         if (args[0].equalsIgnoreCase("sign")) {
/* 220 */           if ((sender.hasPermission("ic.sign")) && 
/* 221 */             (sender.hasPermission("ic.all")) && 
/* 222 */             (sender.hasPermission("ic.admin"))) {
/* 223 */             if (inventory.contains(wood)) {
/* 224 */               if (m.getWood(player) >= 8) {
/* 225 */                 if (inventory.contains(stick)) {
/* 226 */                   if (m.getSticks(player) >= 1) {
/* 227 */                     inventory.removeItem(new ItemStack[] { sign2 });
/* 228 */                     inventory.removeItem(new ItemStack[] { sign1 });
/* 229 */                     inventory.addItem(new ItemStack[] { sign3 });
/* 230 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 231 */                       "You now have a" + 
/* 232 */                       ChatColor.RESET + 
/* 233 */                       ChatColor.BLUE + 
/* 234 */                       "Sign");
/*     */                   }
/*     */                 }
/* 237 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 238 */                     "You need Stick!!");
/*     */               }
/*     */             }
/*     */             else
/* 242 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 243 */                 "You need more Wood!!");
/*     */           }
/* 245 */           return true;
/*     */         }
/* 247 */         if (args[0].equalsIgnoreCase("door")) {
/* 248 */           if (args[1].equalsIgnoreCase("wood")) {
/* 249 */             if ((sender.hasPermission("ic.wdoor")) && 
/* 250 */               (sender.hasPermission("ic.all")) && 
/* 251 */               (sender.hasPermission("ic.admin"))) {
/* 252 */               if (inventory.contains(wood)) {
/* 253 */                 if (m.getWood(player) >= 6) {
/* 254 */                   inventory.removeItem(new ItemStack[] { wdoor1 });
/* 255 */                   inventory.addItem(new ItemStack[] { wdoor2 });
/* 256 */                   sender.sendMessage(ChatColor.DARK_AQUA + 
/* 257 */                     "You now have a" + 
/* 258 */                     ChatColor.RESET + 
/* 259 */                     ChatColor.BLUE + "WDoor");
/*     */                 }
/*     */               }
/* 262 */               else sender.sendMessage(ChatColor.DARK_RED + 
/* 263 */                   "You need more Wood!!");
/*     */             }
/* 265 */             return true;
/*     */           }
/* 267 */           if ((args[1].equalsIgnoreCase("iron")) && 
/* 268 */             (sender.hasPermission("ic.idoor")) && 
/* 269 */             (sender.hasPermission("ic.all")) && 
/* 270 */             (sender.hasPermission("ic.admin"))) {
/* 271 */             if (inventory.contains(iron)) {
/* 272 */               if (m.getIron(player) >= 6) {
/* 273 */                 inventory.removeItem(new ItemStack[] { idoor1 });
/* 274 */                 inventory.addItem(new ItemStack[] { idoor2 });
/* 275 */                 sender.sendMessage(ChatColor.DARK_AQUA + 
/* 276 */                   "You now have an" + 
/* 277 */                   ChatColor.RESET + 
/* 278 */                   ChatColor.BLUE + 
/* 279 */                   " Iron Door");
/*     */               }
/*     */             }
/* 282 */             else sender.sendMessage(ChatColor.DARK_RED + 
/* 283 */                 "You need more Iron!!");
/*     */           }
/*     */ 
/* 286 */           return true;
/*     */         }
/* 288 */         if (args[0].equalsIgnoreCase("axe")) {
/* 289 */           if ((sender.hasPermission("ic.axe")) && 
/* 290 */             (sender.hasPermission("ic.all")) && 
/* 291 */             (sender.hasPermission("ic.admin")) && 
/* 292 */             (args[1].equalsIgnoreCase("wood"))) {
/* 293 */             if (m.getWood(player) >= 3) {
/* 294 */               if (inventory.contains(tool)) {
/* 295 */                 if (m.getSticks(player) >= 2) {
/* 296 */                   if (inventory.contains(wood)) {
/* 297 */                     inventory.removeItem(new ItemStack[] { tool });
/* 298 */                     inventory.removeItem(new ItemStack[] { axe1 });
/* 299 */                     inventory.addItem(new ItemStack[] { axe_1 });
/* 300 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 301 */                       "You now have a" + 
/* 302 */                       ChatColor.RESET + 
/* 303 */                       ChatColor.BLUE + 
/* 304 */                       "Wood Axe");
/*     */                   }
/*     */                 }
/* 307 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 308 */                     "You need more Wood!!");
/*     */               }
/*     */             }
/*     */             else {
/* 312 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 313 */                 "You need more Sticks!!");
/*     */             }
/* 315 */             return true;
/*     */           }
/* 317 */           if (args[1].equalsIgnoreCase("stone")) {
/* 318 */             if (inventory.contains(tool)) {
/* 319 */               if (m.getSticks(player) >= 2) {
/* 320 */                 if (inventory.contains(stone)) {
/* 321 */                   if (m.getStone(player) >= 3) {
/* 322 */                     inventory.removeItem(new ItemStack[] { tool });
/* 323 */                     inventory.removeItem(new ItemStack[] { axe2 });
/* 324 */                     inventory.addItem(new ItemStack[] { axe_2 });
/* 325 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 326 */                       "You now have a" + 
/* 327 */                       ChatColor.RESET + 
/* 328 */                       ChatColor.BLUE + "Stone Axe");
/*     */                   }
/*     */                 }
/* 331 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 332 */                     "You need more Stone!!");
/*     */               }
/*     */             }
/*     */             else {
/* 336 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 337 */                 "You need more Sticks!!");
/*     */             }
/* 339 */             return true;
/*     */           }
/* 341 */           if (args[1].equalsIgnoreCase("iron")) {
/* 342 */             if (inventory.contains(tool)) {
/* 343 */               if (m.getSticks(player) >= 2) {
/* 344 */                 if (inventory.contains(iron)) {
/* 345 */                   if (m.getIron(player) >= 3) {
/* 346 */                     inventory.removeItem(new ItemStack[] { tool });
/* 347 */                     inventory.removeItem(new ItemStack[] { axe3 });
/* 348 */                     inventory.addItem(new ItemStack[] { axe_3 });
/* 349 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 350 */                       "You now have a" + 
/* 351 */                       ChatColor.RESET + 
/* 352 */                       ChatColor.BLUE + "Iron Axe");
/*     */                   }
/*     */                 }
/* 355 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 356 */                     "You need more Iron!!");
/*     */               }
/*     */             }
/*     */             else {
/* 360 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 361 */                 "You need more Sticks!!");
/*     */             }
/* 363 */             return true;
/*     */           }
/* 365 */           if (args[1].equalsIgnoreCase("gold")) {
/* 366 */             if (inventory.contains(tool)) {
/* 367 */               if (m.getSticks(player) >= 2) {
/* 368 */                 if (inventory.contains(gold)) {
/* 369 */                   if (m.getGold(player) >= 3) {
/* 370 */                     inventory.removeItem(new ItemStack[] { tool });
/* 371 */                     inventory.removeItem(new ItemStack[] { axe4 });
/* 372 */                     inventory.addItem(new ItemStack[] { axe_4 });
/* 373 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 374 */                       "You now have a" + 
/* 375 */                       ChatColor.RESET + 
/* 376 */                       ChatColor.BLUE + "Gold Axe");
/*     */                   }
/*     */                 }
/* 379 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 380 */                     "You need more Gold!!");
/*     */               }
/*     */             }
/*     */             else {
/* 384 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 385 */                 "You need more Sticks!!");
/*     */             }
/* 387 */             return true;
/*     */           }
/* 389 */           if (args[1].equalsIgnoreCase("diamond")) {
/* 390 */             if (inventory.contains(tool)) {
/* 391 */               if (m.getSticks(player) >= 2) {
/* 392 */                 if (inventory.contains(diamond)) {
/* 393 */                   if (m.getDiamond(player) >= 3) {
/* 394 */                     inventory.removeItem(new ItemStack[] { tool });
/* 395 */                     inventory.removeItem(new ItemStack[] { axe5 });
/* 396 */                     inventory.addItem(new ItemStack[] { axe_5 });
/* 397 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 398 */                       "You now have a" + 
/* 399 */                       ChatColor.RESET + 
/* 400 */                       ChatColor.BLUE + 
/* 401 */                       "Diamond Axe");
/*     */                   }
/*     */                 }
/* 404 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 405 */                     "You need more Diamonds!!");
/*     */               }
/*     */             }
/*     */             else {
/* 409 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 410 */                 "You need more Sticks!!");
/*     */             }
/* 412 */             return true;
/*     */           }
/* 414 */           return true;
/*     */         }
/* 416 */         if (args[0].equalsIgnoreCase("pickaxe")) {
/* 417 */           if ((sender.hasPermission("ic.pickaxe")) && 
/* 418 */             (sender.hasPermission("ic.all")) && 
/* 419 */             (sender.hasPermission("ic.admin")) && 
/* 420 */             (args[1].equalsIgnoreCase("wood"))) {
/* 421 */             if (inventory.contains(tool)) {
/* 422 */               if (m.getSticks(player) >= 3) {
/* 423 */                 if (inventory.contains(wood)) {
/* 424 */                   if (m.getWood(player) >= 3) {
/* 425 */                     inventory.removeItem(new ItemStack[] { tool });
/* 426 */                     inventory.removeItem(new ItemStack[] { pick1 });
/* 427 */                     inventory.addItem(new ItemStack[] { pick_1 });
/* 428 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 429 */                       "You now have a" + 
/* 430 */                       ChatColor.RESET + 
/* 431 */                       ChatColor.BLUE + 
/* 432 */                       "Wood Pickaxe");
/*     */                   }
/*     */                 }
/* 435 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 436 */                     "You need more Wood!!");
/*     */               }
/*     */             }
/*     */             else {
/* 440 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 441 */                 "You need more Sticks!!");
/*     */             }
/* 443 */             return true;
/*     */           }
/* 445 */           if (args[1].equalsIgnoreCase("stone")) {
/* 446 */             if (inventory.contains(tool)) {
/* 447 */               if (m.getSticks(player) >= 2) {
/* 448 */                 if (inventory.contains(stone)) {
/* 449 */                   if (m.getStone(player) >= 3) {
/* 450 */                     inventory.removeItem(new ItemStack[] { tool });
/* 451 */                     inventory.removeItem(new ItemStack[] { pick2 });
/* 452 */                     inventory.addItem(new ItemStack[] { pick_2 });
/* 453 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 454 */                       "You now have a" + 
/* 455 */                       ChatColor.RESET + 
/* 456 */                       ChatColor.BLUE + 
/* 457 */                       "Stone Pickaxe");
/*     */                   }
/*     */                 }
/* 460 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 461 */                     "You need more Stone!!");
/*     */               }
/*     */             }
/*     */             else {
/* 465 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 466 */                 "You need more Sticks!!");
/*     */             }
/* 468 */             return true;
/*     */           }
/* 470 */           if (args[1].equalsIgnoreCase("iron")) {
/* 471 */             if (inventory.contains(tool)) {
/* 472 */               if (m.getSticks(player) >= 2) {
/* 473 */                 if (inventory.contains(iron)) {
/* 474 */                   if (m.getIron(player) >= 3) {
/* 475 */                     inventory.removeItem(new ItemStack[] { tool });
/* 476 */                     inventory.removeItem(new ItemStack[] { pick3 });
/* 477 */                     inventory.addItem(new ItemStack[] { pick_3 });
/* 478 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 479 */                       "You now have a" + 
/* 480 */                       ChatColor.RESET + 
/* 481 */                       ChatColor.BLUE + 
/* 482 */                       "Iron Pickaxe");
/*     */                   }
/*     */                 }
/* 485 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 486 */                     "You need more Iron!!");
/*     */               }
/*     */             }
/*     */             else {
/* 490 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 491 */                 "You need more Sticks!!");
/*     */             }
/* 493 */             return true;
/*     */           }
/* 495 */           if (args[1].equalsIgnoreCase("gold")) {
/* 496 */             if (inventory.contains(tool)) {
/* 497 */               if (m.getSticks(player) >= 2) {
/* 498 */                 if (inventory.contains(gold)) {
/* 499 */                   if (m.getGold(player) >= 3) {
/* 500 */                     inventory.removeItem(new ItemStack[] { tool });
/* 501 */                     inventory.removeItem(new ItemStack[] { pick4 });
/* 502 */                     inventory.addItem(new ItemStack[] { pick_4 });
/* 503 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 504 */                       "You now have a" + 
/* 505 */                       ChatColor.RESET + 
/* 506 */                       ChatColor.BLUE + 
/* 507 */                       "Gold Pickaxe");
/*     */                   }
/*     */                 }
/* 510 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 511 */                     "You need more Gold!!");
/*     */               }
/*     */             }
/*     */             else {
/* 515 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 516 */                 "You need more Sticks!!");
/*     */             }
/* 518 */             return true;
/*     */           }
/* 520 */           if (args[1].equalsIgnoreCase("diamond")) {
/* 521 */             if (inventory.contains(tool)) {
/* 522 */               if (m.getWood(player) >= 2) {
/* 523 */                 if (inventory.contains(diamond)) {
/* 524 */                   if (m.getDiamond(player) >= 3) {
/* 525 */                     inventory.removeItem(new ItemStack[] { tool });
/* 526 */                     inventory.removeItem(new ItemStack[] { pick5 });
/* 527 */                     inventory.addItem(new ItemStack[] { pick_5 });
/* 528 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 529 */                       "You now have a" + 
/* 530 */                       ChatColor.RESET + 
/* 531 */                       ChatColor.BLUE + 
/* 532 */                       "Diamond Pickaxe");
/*     */                   }
/*     */                 }
/* 535 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 536 */                     "You need more Diamonds!!");
/*     */               }
/*     */             }
/*     */             else {
/* 540 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 541 */                 "You need more Sticks!!");
/*     */             }
/* 543 */             return true;
/*     */           }
/* 545 */           return true;
/*     */         }
/* 547 */         if (args[0].equalsIgnoreCase("hoe")) {
/* 548 */           if ((sender.hasPermission("ic.hoe")) && 
/* 549 */             (sender.hasPermission("ic.all")) && 
/* 550 */             (sender.hasPermission("ic.admin")) && 
/* 551 */             (args[1].equalsIgnoreCase("wood"))) {
/* 552 */             if (inventory.contains(tool)) {
/* 553 */               if (m.getSticks(player) >= 2) {
/* 554 */                 if (inventory.contains(wood)) {
/* 555 */                   if (m.getWood(player) >= 2) {
/* 556 */                     inventory.removeItem(new ItemStack[] { tool });
/* 557 */                     inventory.removeItem(new ItemStack[] { hoe1 });
/* 558 */                     inventory.addItem(new ItemStack[] { hoe_1 });
/* 559 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 560 */                       "You now have a" + 
/* 561 */                       ChatColor.RESET + 
/* 562 */                       ChatColor.BLUE + 
/* 563 */                       "Wood Hoe");
/*     */                   }
/*     */                 }
/* 566 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 567 */                     "You need more Wood!!");
/*     */               }
/*     */             }
/*     */             else {
/* 571 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 572 */                 "You need more Sticks!!");
/*     */             }
/* 574 */             return true;
/*     */           }
/* 576 */           if (args[1].equalsIgnoreCase("stone")) {
/* 577 */             if (inventory.contains(tool)) {
/* 578 */               if (m.getSticks(player) >= 2) {
/* 579 */                 if (inventory.contains(stone)) {
/* 580 */                   if (m.getStone(player) >= 2) {
/* 581 */                     inventory.removeItem(new ItemStack[] { tool });
/* 582 */                     inventory.removeItem(new ItemStack[] { hoe2 });
/* 583 */                     inventory.addItem(new ItemStack[] { hoe_2 });
/* 584 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 585 */                       "You now have a" + 
/* 586 */                       ChatColor.RESET + 
/* 587 */                       ChatColor.BLUE + "Stone Hoe");
/*     */                   }
/*     */                 }
/* 590 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 591 */                     "You need more Stone!!");
/*     */               }
/*     */             }
/*     */             else {
/* 595 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 596 */                 "You need more Sticks!!");
/*     */             }
/* 598 */             return true;
/*     */           }
/* 600 */           if (args[1].equalsIgnoreCase("iron")) {
/* 601 */             if (inventory.contains(tool)) {
/* 602 */               if (m.getSticks(player) >= 2) {
/* 603 */                 if (inventory.contains(iron)) {
/* 604 */                   if (m.getIron(player) >= 2) {
/* 605 */                     inventory.removeItem(new ItemStack[] { tool });
/* 606 */                     inventory.removeItem(new ItemStack[] { hoe3 });
/* 607 */                     inventory.addItem(new ItemStack[] { hoe_3 });
/* 608 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 609 */                       "You now have a" + 
/* 610 */                       ChatColor.RESET + 
/* 611 */                       ChatColor.BLUE + "Iron Hoe");
/*     */                   }
/*     */                 }
/* 614 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 615 */                     "You need more Iron!!");
/*     */               }
/*     */             }
/*     */             else {
/* 619 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 620 */                 "You need more Sticks!!");
/*     */             }
/* 622 */             return true;
/*     */           }
/* 624 */           if (args[1].equalsIgnoreCase("gold")) {
/* 625 */             if (inventory.contains(tool)) {
/* 626 */               if (m.getSticks(player) >= 2) {
/* 627 */                 if (inventory.contains(gold)) {
/* 628 */                   if (m.getGold(player) >= 2) {
/* 629 */                     inventory.removeItem(new ItemStack[] { tool });
/* 630 */                     inventory.removeItem(new ItemStack[] { hoe4 });
/* 631 */                     inventory.addItem(new ItemStack[] { hoe_4 });
/* 632 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 633 */                       "You now have a" + 
/* 634 */                       ChatColor.RESET + 
/* 635 */                       ChatColor.BLUE + "Gold Hoe");
/*     */                   }
/*     */                 }
/* 638 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 639 */                     "You need more Gold!!");
/*     */               }
/*     */             }
/*     */             else {
/* 643 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 644 */                 "You need more Sticks!!");
/*     */             }
/* 646 */             return true;
/*     */           }
/* 648 */           if (args[1].equalsIgnoreCase("diamond")) {
/* 649 */             if (inventory.contains(tool)) {
/* 650 */               if (m.getSticks(player) >= 2) {
/* 651 */                 if (inventory.contains(diamond)) {
/* 652 */                   if (m.getDiamond(player) >= 2) {
/* 653 */                     inventory.removeItem(new ItemStack[] { tool });
/* 654 */                     inventory.removeItem(new ItemStack[] { hoe5 });
/* 655 */                     inventory.addItem(new ItemStack[] { hoe_5 });
/* 656 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 657 */                       "You now have a" + 
/* 658 */                       ChatColor.RESET + 
/* 659 */                       ChatColor.BLUE + 
/* 660 */                       "Diamond Hoe");
/*     */                   }
/*     */                 }
/* 663 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 664 */                     "You need more Diamonds!!");
/*     */               }
/*     */             }
/*     */             else {
/* 668 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 669 */                 "You need more Sticks!!");
/*     */             }
/* 671 */             return true;
/*     */           }
/*     */         }
/* 674 */         if (args[0].equalsIgnoreCase("shovel")) {
/* 675 */           if ((sender.hasPermission("ic.shovel")) && 
/* 676 */             (sender.hasPermission("ic.all")) && 
/* 677 */             (sender.hasPermission("ic.admin")) && 
/* 678 */             (args[1].equalsIgnoreCase("wood"))) {
/* 679 */             if (inventory.contains(tool)) {
/* 680 */               if (m.getSticks(player) >= 2) {
/* 681 */                 if (inventory.contains(wood)) {
/* 682 */                   if (m.getWood(player) >= 1) {
/* 683 */                     inventory.removeItem(new ItemStack[] { tool });
/* 684 */                     inventory
/* 685 */                       .removeItem(new ItemStack[] { 
/* 685 */                       shovel1 });
/* 686 */                     inventory.addItem(new ItemStack[] { shovel_1 });
/* 687 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 688 */                       "You now have a" + 
/* 689 */                       ChatColor.RESET + 
/* 690 */                       ChatColor.BLUE + 
/* 691 */                       "Wood Shovel");
/*     */                   }
/*     */                 }
/* 694 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 695 */                     "You need more Wood!!");
/*     */               }
/*     */             }
/*     */             else {
/* 699 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 700 */                 "You need more Sticks!!");
/*     */             }
/* 702 */             return true;
/*     */           }
/* 704 */           if (args[1].equalsIgnoreCase("stone")) {
/* 705 */             if (inventory.contains(tool)) {
/* 706 */               if (m.getSticks(player) >= 2) {
/* 707 */                 if (inventory.contains(stone)) {
/* 708 */                   if (m.getStone(player) >= 1) {
/* 709 */                     inventory.removeItem(new ItemStack[] { tool });
/* 710 */                     inventory.removeItem(new ItemStack[] { shovel2 });
/* 711 */                     inventory.addItem(new ItemStack[] { shovel_2 });
/* 712 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 713 */                       "You now have a" + 
/* 714 */                       ChatColor.RESET + 
/* 715 */                       ChatColor.BLUE + 
/* 716 */                       "Stone Shovel");
/*     */                   }
/*     */                 }
/* 719 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 720 */                     "You need more Stone!!");
/*     */               }
/*     */             }
/*     */             else {
/* 724 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 725 */                 "You need more Sticks!!");
/*     */             }
/* 727 */             return true;
/*     */           }
/* 729 */           if (args[1].equalsIgnoreCase("iron")) {
/* 730 */             if (inventory.contains(tool)) {
/* 731 */               if (m.getSticks(player) >= 2) {
/* 732 */                 if (inventory.contains(iron)) {
/* 733 */                   if (m.getIron(player) >= 1) {
/* 734 */                     inventory.removeItem(new ItemStack[] { tool });
/* 735 */                     inventory.removeItem(new ItemStack[] { shovel3 });
/* 736 */                     inventory.addItem(new ItemStack[] { shovel_3 });
/* 737 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 738 */                       "You now have a" + 
/* 739 */                       ChatColor.RESET + 
/* 740 */                       ChatColor.BLUE + 
/* 741 */                       "Iron Shovel");
/*     */                   }
/*     */                 }
/* 744 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 745 */                     "You need more Iron!!");
/*     */               }
/*     */             }
/*     */             else {
/* 749 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 750 */                 "You need more Sticks!!");
/*     */             }
/* 752 */             return true;
/*     */           }
/* 754 */           if (args[1].equalsIgnoreCase("gold")) {
/* 755 */             if (inventory.contains(tool)) {
/* 756 */               if (m.getSticks(player) >= 2) {
/* 757 */                 if (inventory.contains(gold)) {
/* 758 */                   if (m.getGold(player) >= 1) {
/* 759 */                     inventory.removeItem(new ItemStack[] { tool });
/* 760 */                     inventory.removeItem(new ItemStack[] { shovel4 });
/* 761 */                     inventory.addItem(new ItemStack[] { shovel_4 });
/* 762 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 763 */                       "You now have a" + 
/* 764 */                       ChatColor.RESET + 
/* 765 */                       ChatColor.BLUE + 
/* 766 */                       "Gold Shovel");
/*     */                   }
/*     */                 }
/* 769 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 770 */                     "You need more Gold!!");
/*     */               }
/*     */             }
/*     */             else {
/* 774 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 775 */                 "You need more Sticks!!");
/*     */             }
/* 777 */             return true;
/*     */           }
/* 779 */           if (args[1].equalsIgnoreCase("diamond")) {
/* 780 */             if (inventory.contains(tool)) {
/* 781 */               if (m.getSticks(player) >= 2) {
/* 782 */                 if (inventory.contains(diamond)) {
/* 783 */                   if (m.getDiamond(player) >= 1) {
/* 784 */                     inventory.removeItem(new ItemStack[] { tool });
/* 785 */                     inventory.removeItem(new ItemStack[] { shovel5 });
/* 786 */                     inventory.addItem(new ItemStack[] { shovel_5 });
/* 787 */                     sender.sendMessage(ChatColor.DARK_AQUA + 
/* 788 */                       "You now have a" + 
/* 789 */                       ChatColor.RESET + 
/* 790 */                       ChatColor.BLUE + 
/* 791 */                       "Diamond Shovel");
/*     */                   }
/*     */                 }
/* 794 */                 else sender.sendMessage(ChatColor.DARK_RED + 
/* 795 */                     "You need more Diamonds!!");
/*     */               }
/*     */             }
/*     */             else {
/* 799 */               sender.sendMessage(ChatColor.DARK_RED + 
/* 800 */                 "You need more Sticks!!");
/*     */             }
/* 802 */             return true;
/*     */           }
/* 804 */           return true;
/*     */         }
/* 806 */         return true;
/*     */       }
/* 808 */       sender.sendMessage(ChatColor.DARK_RED + 
/* 809 */         "Crafting this way is not allowed!!");
/*     */ 
/* 811 */       return true;
/*     */     }
/* 813 */     return false;
/*     */   }
/*     */ }