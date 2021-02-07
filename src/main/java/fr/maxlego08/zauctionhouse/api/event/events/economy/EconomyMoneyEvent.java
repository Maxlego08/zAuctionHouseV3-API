package fr.maxlego08.zauctionhouse.api.event.events.economy;

import org.bukkit.OfflinePlayer;

import fr.maxlego08.zauctionhouse.api.event.AuctionEvent;

public class EconomyMoneyEvent extends AuctionEvent {

	private final OfflinePlayer player;
	private double money;

	public EconomyMoneyEvent(OfflinePlayer player) {
		super();
		this.player = player;
	}

	/**
	 * @return the player
	 */
	public OfflinePlayer getPlayer() {
		return player;
	}

	/**
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

}
