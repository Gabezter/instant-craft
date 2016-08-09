/*    */ package com.yahoo.gabezter4.instantcraft;
/*    */ 
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.inventory.InventoryClickEvent;
/*    */ import org.bukkit.event.inventory.InventoryCloseEvent;
/*    */ import org.bukkit.inventory.Inventory;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class RecipeListener
/*    */   implements Listener
/*    */ {
/*    */   private InstantCraft plugin;
/*    */ 
/*    */   public RecipeListener(InstantCraft plugin)
/*    */   {
/* 13 */     this.plugin = plugin;
/*    */   }
/*    */   @EventHandler
/*    */   public void OnInventoryClick(InventoryClickEvent e) {
/* 17 */     if (e.getInventory() == plugin.workbench) {
/* 18 */       if (e.getCurrentItem().getType() == plugin.wood) {
/* 19 */         e.setCancelled(true);
/*    */       }
/* 21 */       if (e.getCurrentItem().getType() == Material.WORKBENCH)
/* 22 */         e.setCancelled(true);  } 
/*    */   }
/*    */ 
/* 26 */   @EventHandler
/*    */   public void onInventoryLeave(InventoryCloseEvent e) { if (e.getInventory() == plugin.workbench)
/* 27 */       plugin.workbench.clear();
/*    */   }
/*    */ }