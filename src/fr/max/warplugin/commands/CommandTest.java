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
import lotr.client.LOTRAlignmentTicker;
import lotr.common.fac.LOTRFaction;
import net.minecraft.server.v1_7_R4.EntityPlayer;
import net.minecraft.server.v1_7_R4.PlayerInteractManager;
import lotr.common.LOTRPlayerData;
import lotr.common.LOTRLevelData;
import lotr.common.fellowship.*;
import lotr.common.item.LOTRItemBanner;

public class CommandTest implements CommandExecutor {


	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			if(cmd.getName().equalsIgnoreCase("war")) {
				if(args.length == 0) {
					System.out.println("[WARPLUGIN LOGS]"+sender.getName()+" effectue la commande /war ");
					Bukkit.broadcastMessage("§1[§4WARPLUGIN§1] §e La Faction §1"+ args[0] +"§e entre en guerre contre la faction §4"+ args[1] +" §a pendant 1h");
				}
				if(args.length >= 1) {
					
					StringBuilder bc = new StringBuilder();
					for(String part : args) {
						bc.append(part + " ");
					}
					
					System.out.println("[WARPLUGIN LOGS]"+sender.getName()+" effectue la commande /war, mais il rate args.length >= 1.");
					return true;
				}
			}
			
		}
		return false;
	}

}
