package fr.maxlego08.zauctionhouse.api.utils;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.maxlego08.zauctionhouse.zcore.utils.nms.V1_10;
import fr.maxlego08.zauctionhouse.zcore.utils.nms.V1_8;
import fr.maxlego08.zauctionhouse.zcore.utils.nms.V1_9;

public interface NMSUtils {

	ItemStack setUnbreakable(ItemStack itemStack);

	boolean isUnbreakable(ItemStack itemStack);

	static NMSUtils create() {
		double version = fr.maxlego08.zauctionhouse.zcore.utils.itemstack.NMSUtils.getNMSVersion();
		if (version == 1.8)
			return new V1_8();
		if (version == 1.9)
			return new V1_9();
		if (version == 1.10)
			return new V1_10();
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
