package com.yahoo.gabezter4.instantcraft;

import java.util.Map.Entry;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class Methods {
	
	private int amount;
	int getWood(Player player){
		amount = 0;
		PlayerInventory pi = player.getInventory();
		for(Entry<Integer, ? extends ItemStack> entry :pi.all(Material.WOOD).entrySet()){
			amount += entry.getValue().getAmount();
		}
		return amount;
	}
	int getSticks(Player player){
		amount = 0;
		PlayerInventory pi = player.getInventory();
		for(Entry<Integer, ? extends ItemStack> entry :pi.all(Material.STICK).entrySet()){
			amount += entry.getValue().getAmount();
		}
		return amount;
	}

	int getStone(Player player){
		amount = 0;
		PlayerInventory pi = player.getInventory();
		for(Entry<Integer, ? extends ItemStack> entry :pi.all(Material.COBBLESTONE).entrySet()){
			amount += entry.getValue().getAmount();
		}
		return amount;
	}
	int getIron(Player player){
		amount = 0;
		PlayerInventory pi = player.getInventory();
		for(Entry<Integer, ? extends ItemStack> entry :pi.all(Material.IRON_INGOT).entrySet()){
			amount += entry.getValue().getAmount();
		}
		return amount;
	}
	int getGold(Player player){
		amount = 0;
		PlayerInventory pi = player.getInventory();
		for(Entry<Integer, ? extends ItemStack> entry :pi.all(Material.GOLD_INGOT).entrySet()){
			amount += entry.getValue().getAmount();
		}
		return amount;
	}
	int getDiamond(Player player){
		amount = 0;
		PlayerInventory pi = player.getInventory();
		for(Entry<Integer, ? extends ItemStack> entry :pi.all(Material.DIAMOND).entrySet()){
			amount += entry.getValue().getAmount();
		}
		return amount;
	}
		
	

}
