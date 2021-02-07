package fr.maxlego08.zauctionhouse.api.button.buttons;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import fr.maxlego08.zauctionhouse.api.AuctionItem;
import fr.maxlego08.zauctionhouse.api.enums.InventoryType;

public interface ShowButton extends PlaceholderButton {

	/**
	 * Get item lore with button
	 * 
	 * @param button
	 * @return lore
	 */
	public List<String> getLore(Player player, AuctionItem item, InventoryType type);

	/**
	 * 
	 * @param button
	 * @return
	 */
	public ItemStack applyLore(Player player, AuctionItem item, InventoryType type);

}
