package com.yahoo.gabezter4.instantcraft;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class RecipeListener implements Listener {


	private InstantCraft plugin;
	public RecipeListener(InstantCraft plugin){this.plugin = plugin;}
	
	@EventHandler
	public void OnInventoryClick(InventoryClickEvent e){
		if(e.getInventory() == plugin.workbench){
			if(e.getCurrentItem().getType() == plugin.wood){
				e.setCancelled(true);
			}
			if(e.getCurrentItem().getType() == Material.WORKBENCH){
				e.setCancelled(true);
			}}}
	@EventHandler
	public void onInventoryLeave(InventoryCloseEvent e){
		if(e.getInventory() == plugin.workbench){
			plugin.workbench.clear();
		}}
}
