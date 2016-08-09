/*    */ package com.yahoo.gabezter4.instantcraft;
/*    */ 
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.Inventory;
/*    */ 
/*    */ public class Recipe
/*    */   implements CommandExecutor
/*    */ {
/*    */   private InstantCraft plugin;
/*    */   Player player;
/*    */ 
/*    */   public Recipe(InstantCraft plugin)
/*    */   {
/* 11 */     this.plugin = plugin;
/*    */   }
/*    */ 
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 15 */     if (cmd.getName().equalsIgnoreCase("icrecipe")) {
/* 16 */       if (args.length == 0) {
/* 17 */         sender.sendMessage(ChatColor.DARK_AQUA + "_____" + ChatColor.DARK_GREEN + "Recipes Currently Added!!" + ChatColor.DARK_AQUA + "_____");
/* 18 */         sender.sendMessage(ChatColor.DARK_BLUE + "Workbench");
/* 19 */         sender.sendMessage(ChatColor.DARK_GREEN + "More will be added soon.");
/* 20 */         return true;
/* 21 */       }if (args[0].equalsIgnoreCase("workbench")) {
/* 22 */         plugin.workbench.setItem(1, plugin.wb11);
/* 23 */         plugin.workbench.setItem(2, plugin.wb11);
/* 24 */         plugin.workbench.setItem(4, plugin.wb11);
/* 25 */         plugin.workbench.setItem(5, plugin.wb11);
/* 26 */         plugin.workbench.setItem(0, plugin.wb2);
/* 27 */         ((Player)sender).openInventory(plugin.workbench);
/* 28 */         return true;
/*    */       }
/* 30 */       return true;
/* 31 */     }return false;
/*    */   }
/*    */ }