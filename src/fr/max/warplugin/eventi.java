package fr.max.warplugin;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.UUID;

import lotr.common.fac.LOTRFaction;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import lotr.common.LOTRPlayerData;

import lotr.common.fac.LOTRFaction;

public class eventi implements Listener {
	 private warplugin pluginEvent;
	   
	    public eventi(warplugin plugin)
	    {
	        this.pluginEvent = plugin;
	    }
	   
	     @EventHandler
	     public void onPlayerChat(PlayerJoinEvent event) {
	       
	        Player player = event.getPlayer();
	        LOTRPlayerData a = new LOTRPlayerData(player.getUniqueId());
	        float c = a.getAlignment(LOTRFaction.MORDOR);
	        System.out.println("EVENTI PEUT ETRE LA SOLUCE ?" +new LOTRPlayerData(event.getPlayer().getUniqueId()).getAlignment(LOTRFaction.MORDOR));
	        System.out.println("EVENTI = " + c);
	        System.out.println("EVENTI uuid = " + player.getUniqueId());
	        System.out.println("EVENTI de A = " + a);
	}

}
