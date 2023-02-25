package fr.maxlego08.zauctionhouse.api.event.events;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import fr.maxlego08.zauctionhouse.api.event.CancelledAuctionEvent;

public class AuctionGiveItemStackEvent extends CancelledAuctionEvent {

	private final Player player;
	private ItemStack itemStack;
	private boolean hasFullInventory;

	/**
	 * @param player
	 * @param itemStack
	 * @param hasFullInventory
	 */
	public AuctionGiveItemStackEvent(Player player, ItemStack itemStack, boolean hasFullInventory) {
		super();
		this.player = player;
		this.itemStack = itemStack;
		this.hasFullInventory = hasFullInventory;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @return the itemStack
	 */
	public ItemStack getItemStack() {
		return itemStack;
	}

	/**
	 * @return the hasFullInventory
	 */
	public boolean hasFullInventory() {
		return hasFullInventory;
	}

	/**
	 * @param itemStack
	 *            the itemStack to set
	 */
	public void setItemStack(ItemStack itemStack) {
		this.itemStack = itemStack;
	}

	/**
	 * @param hasFullInventory
	 *            the hasFullInventory to set
	 */
	public void setHasFullInventory(boolean hasFullInventory) {
		this.hasFullInventory = hasFullInventory;
	}

}
