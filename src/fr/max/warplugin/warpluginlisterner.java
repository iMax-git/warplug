package fr.max.warplugin;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class warpluginlisterner implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		ItemStack it = event.getItem();
		/*
		System.out.println("[WARPLUGIN LOGS]"+"-----PlayerInteract-----");
		System.out.println("[WARPLUGIN LOGS]"+"Action Type: " + event.getAction().name());
		System.out.println("[WARPLUGIN LOGS]"+"Holding: " + event.getPlayer().getItemInHand().getType().name());
		System.out.println("[WARPLUGIN LOGS]"+"Cancelled: " + event.isCancelled());
		*/
		if(it == null) return;
		if(it.getType() == Material.DIAMOND_HOE) {
			if(event.getAction().name().equals("RIGHT_CLICK_AIR" ) ) {
				player.sendMessage("CLICK DIMOND HOE");
			}
		}
		if(it.getType() == Material.PAPER) {
			if(event.getAction().name().equals("RIGHT_CLICK_AIR")) {
				Inventory inv = Bukkit.createInventory(null, 54, "Menu de Guerre");
				player.openInventory(inv);
			}
		}
		
	}

}
