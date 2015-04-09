/*    */ package com.yahoo.gabezter4.instantcraft;
/*    */ 
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ 
/*    */ public class Config
/*    */   implements CommandExecutor
/*    */ {
/*    */   private InstantCraft plugin;
/*    */ 
/*    */   public Config(InstantCraft plugin)
/*    */   {
/* 11 */     this.plugin = plugin;
/*    */   }
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 14 */     if (cmd.getName().equalsIgnoreCase("icconfig")) {
/* 15 */       if (args[0].equalsIgnoreCase("crafting")) {
/* 16 */         if (args[1].equalsIgnoreCase("true")) {
/* 17 */           plugin.getConfig().set("Allow Instant Crafting", Boolean.valueOf(true));
/* 18 */           sender.sendMessage(ChatColor.DARK_RED + "Crafting via Plugin is now allowed!!!");
/* 19 */           return true;
/*    */         }
/* 21 */         if (args[1].equalsIgnoreCase("false")) {
/* 22 */           plugin.getConfig().set("Allow Instant Crafting", Boolean.valueOf(false));
/* 23 */           sender.sendMessage(ChatColor.DARK_RED + "Crafting via Plugin is now NOT allowed!!!");
/* 24 */           return true;
/*    */         }
/*    */       }
/* 27 */       return true;
/*    */     }
/* 29 */     return false;
/*    */   }
/*    */ }