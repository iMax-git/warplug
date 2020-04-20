package fr.max.warplugin.tasks;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class TimerTask extends BukkitRunnable {
	
	public int timer = 10;
	@Override
	public void run() {
		
		
		if(timer == 0) {
			cancel();
			int end = 1;
		}
		
		timer--;
	}

}
