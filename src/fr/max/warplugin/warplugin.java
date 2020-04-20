package fr.max.warplugin;

import java.awt.Desktop.Action;
import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import fr.max.warplugin.commands.CommandTest;
import fr.max.warplugin.tasks.TimerTask;
public class warplugin extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("[WARPLUGIN | 0.0.1a] Status : ON"
				+ "[WARPLUGIN | CREDIT] Created by iMax");
		getCommand("war").setExecutor(new CommandTest());
		getServer().getPluginManager().registerEvents(new warpluginlisterner(), this);
		getServer().getPluginManager().registerEvents(new eventi(this), this);
		TimerTask task = new TimerTask();
		task.runTaskTimer(this, 1/2, 20);
		
	
	}
	
	public int i = 10;
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equalsIgnoreCase("door")){
			System.out.println("[WARPLUGIN LOGS]"+sender.getName()+" effectue la commande /door.");
			sender.sendMessage("§1[§4WARPLUGIN§1]§e Tu toi attendre une minute sans te fait attaquer pour pourvoir utilisé l'outil de déstruction.");
			this.getServer().getScheduler().scheduleAsyncRepeatingTask(this, new Runnable() {
				public void run(){
					if(i != -1) {
						if(i != 0){
							sender.sendMessage("§1[§4WARPLUGIN§1] §e Plus que "+i+"§e seconde(s)");
							i--;
						}else {
							Player player = (Player)sender;
							sender.sendMessage("§1[§4WARPLUGIN§1]§e Tu possède maintenant la pioche de déstruction");
							System.out.println("[WARPLUGIN LOGS]"+sender.getName()+" possede maintenant la pioche de la commande /door.");
							ItemStack warpickaxe = new ItemStack(Material.IRON_PICKAXE, 1);
							ItemMeta warpickaxem = warpickaxe.getItemMeta();
							warpickaxem.setDisplayName(ChatColor.BLUE + "Piche de Guerre");
							warpickaxem.setLore(Arrays.asList("Utiliser cet item pour détruire les portes " , "des factions ennemies après avoir fait le /war"));
							warpickaxe.setItemMeta(warpickaxem);
							warpickaxe.setDurability((short) (warpickaxe.getDurability() + 249));
							player.getInventory().addItem(warpickaxe);
							player.updateInventory();
							i--;
								
						}
					}
				}
			}, 0L, 20L);
		}
		return false;
	}
	
	
	@Override
	public void onDisable() {
		System.out.println("[WARPLUGIN | 0.0.1a] Status : OFF");
	}
	
}
