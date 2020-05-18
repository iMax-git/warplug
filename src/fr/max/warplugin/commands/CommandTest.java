package fr.max.warplugin.commands;


import java.io.File;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import fr.max.warplugin.warplugin;
import net.minecraft.server.v1_7_R4.EntityPlayer;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.minecraft.server.v1_7_R4.PlayerInteractManager;

public class CommandTest implements CommandExecutor {


	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			if(cmd.getName().equalsIgnoreCase("war")) {
				if(args.length == 0) {
					System.out.println("[WARPLUGIN LOGS]"+sender.getName()+" effectue la commande /war ");
					Inventory inv = Bukkit.createInventory(null, 54, "Menu de Guerre");
					/* Laine Rouge */
					ItemStack woolred = new ItemStack(Material.WOOL, 1, (byte)14);
					ItemMeta woolredM = woolred.getItemMeta();
					woolredM.setDisplayName("Laine Rouge");
					woolred.setItemMeta(woolredM);
					inv.setItem(2, woolred);
					/* Laine Bleu */
					ItemStack woolblue = new ItemStack(Material.WOOL, 1, (byte)11);
					ItemMeta woolblueM = woolblue.getItemMeta();
					woolblueM.setDisplayName("Laine Blanc");
					woolblue.setItemMeta(woolblueM);
					inv.setItem(1, woolblue);
					/* Laine Blanc */
					ItemStack woolblanc = new ItemStack(Material.WOOL, 1);
					ItemMeta woolblancM = woolblanc.getItemMeta();
					woolblancM.setDisplayName("Laine Blanc");
					woolblanc.setItemMeta(woolblancM);
					inv.setItem(3, woolblanc);
					/* Laine Orange */
					ItemStack woolorange = new ItemStack(Material.WOOL, 1, (byte)2);
					ItemMeta woolorangeM = woolorange.getItemMeta();
					woolorangeM.setDisplayName("Laine Orange");
					woolorange.setItemMeta(woolorangeM);
					inv.setItem(4, woolorange);
					/* Laine Magenta */
					ItemStack woolmagenta = new ItemStack(Material.WOOL, 1, (byte)11);
					ItemMeta woolmagentaM = woolmagenta.getItemMeta();
					woolmagentaM.setDisplayName("Laine magenta");
					woolmagenta.setItemMeta(woolmagentaM);
					inv.setItem(5, woolmagenta);
					
					player.openInventory(inv);
					//Bukkit.broadcastMessage("§1[§4WARPLUGIN§1] §e La Faction §1"+"§e entre en guerre contre la faction §4"+" §a pendant 1h");
				}
				if(args.length >= 1) {
					/*
					StringBuilder bc = new StringBuilder();
					for(String part : args) {
						bc.append(part + " ");
					}
					*/
					System.out.println("[WARPLUGIN LOGS]"+sender.getName()+" effectue la commande /war, mais il rate args.length >= 1.");
					return true;
				}
			}
			
		}
		return false;
	}

}
