package fr.maxlego08.zauctionhouse.api.utils;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public interface NMSUtils {

	ItemStack setUnbreakable(ItemStack itemStack);

	boolean isUnbreakable(ItemStack itemStack);

	static NMSUtils create() {	
		return new NMSUtils() {

			@Override
			public ItemStack setUnbreakable(ItemStack itemStack) {
				ItemMeta itemMeta = itemStack.getItemMeta();
				itemMeta.setUnbreakable(true);
				itemStack.setItemMeta(itemMeta);
				return itemStack;
			}

			@Override
			public boolean isUnbreakable(ItemStack itemStack) {
				ItemMeta itemMeta = itemStack.getItemMeta();
				return itemMeta.isUnbreakable();
			}

		};
	}

}
