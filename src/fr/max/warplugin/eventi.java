package fr.max.warplugin;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class eventi implements Listener {
	 private warplugin pluginEvent;
	   
	    public eventi(warplugin plugin)
	    {
	        this.pluginEvent = plugin;
	    }
	   
	     @EventHandler
	     public void onPlayerChat(PlayerJoinEvent event) {
	       
	        Player player = event.getPlayer();
	        player.sendMessage("-----§1[§4WARPLUGIN§1]§f-----");
	        player.sendMessage("-- WarPlugin 0.0.1    ");
	        player.sendMessage("-- Auteur: iMax       ");
	        player.sendMessage("--------------------");
	}

}
