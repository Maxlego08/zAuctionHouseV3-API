package fr.maxlego08.zauctionhouse.api.tax;

import org.bukkit.inventory.ItemStack;

public interface Tax {

	/**
	 * Gets the item stack associated with this tax.
	 *
	 * @return the {@link ItemStack} associated with this tax.
	 */
	ItemStack getItemStack();

	/**
	 * Gets the tax percentage.
	 *
	 * @return the tax percentage as a double.
	 */
	double getPercent();
}

