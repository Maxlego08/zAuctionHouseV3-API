package fr.maxlego08.zauctionhouse.api.event.events;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import fr.maxlego08.zauctionhouse.api.enums.Economy;
import fr.maxlego08.zauctionhouse.api.event.CancelledAuctionEvent;

public class AuctionPreSellEvent extends CancelledAuctionEvent {

	private final Player player;
	private final int amount;
	private final UUID auctionItemUniqueId;
	private long expiredAt;
	private Economy economy;
	private long price;
	private ItemStack itemStack;

	/**
	 * @param player
	 * @param amount
	 * @param auctionItemUniqueId
	 * @param expiredAt
	 * @param economy
	 * @param price
	 * @param itemStack
	 */
	public AuctionPreSellEvent(Player player, int amount, UUID auctionItemUniqueId, long expiredAt, Economy economy,
			long price, ItemStack itemStack) {
		super();
		this.player = player;
		this.amount = amount;
		this.auctionItemUniqueId = auctionItemUniqueId;
		this.expiredAt = expiredAt;
		this.economy = economy;
		this.price = price;
		this.itemStack = itemStack;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @return the auctionItemUniqueId
	 */
	public UUID getAuctionItemUniqueId() {
		return auctionItemUniqueId;
	}

	/**
	 * @return the expiredAt
	 */
	public long getExpiredAt() {
		return expiredAt;
	}

	/**
	 * @return the economy
	 */
	public Economy getEconomy() {
		return economy;
	}

	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @return the itemStack
	 */
	public ItemStack getItemStack() {
		return itemStack;
	}

	/**
	 * @param expiredAt
	 *            the expiredAt to set
	 */
	public void setExpiredAt(long expiredAt) {
		this.expiredAt = expiredAt;
	}

	/**
	 * @param economy
	 *            the economy to set
	 */
	public void setEconomy(Economy economy) {
		this.economy = economy;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}

	/**
	 * @param itemStack
	 *            the itemStack to set
	 */
	public void setItemStack(ItemStack itemStack) {
		this.itemStack = itemStack;
	}

}
