package fr.maxlego08.zauctionhouse.api;

import org.bukkit.command.CommandSender;

import fr.maxlego08.zauctionhouse.api.enums.ConvertType;

public interface ConvertManager {

	/**
	 * Convert file
	 * @param sender
	 * @param type
	 * @param hour 
	 */
	public void convertFile(CommandSender sender, ConvertType type, long hour);
	
}
