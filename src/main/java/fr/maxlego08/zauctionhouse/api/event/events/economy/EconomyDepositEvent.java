package fr.maxlego08.zauctionhouse.api.event.events.economy;

import org.bukkit.OfflinePlayer;

import fr.maxlego08.zauctionhouse.api.event.AuctionEvent;

@Deprecated
public class EconomyDepositEvent extends AuctionEvent {

	private final OfflinePlayer player;
	private final double money;

	public EconomyDepositEvent(OfflinePlayer player, double money) {
		super();
		this.player = player;
		this.money = money;
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
	
}
