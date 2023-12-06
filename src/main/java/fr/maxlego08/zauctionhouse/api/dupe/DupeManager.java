package fr.maxlego08.zauctionhouse.api.dupe;

import org.bukkit.inventory.ItemStack;

public interface DupeManager {

    /**
     * the key to determining where the item comes from
     */
    String KEY = "ZAUCTIONHOUSE-ITEM";

    /**
     * protect an item from dupe
     *
     * @param itemStack
     * @return
     */
    ItemStack protectItem(ItemStack itemStack);

    /**
     * check if an item is a result of a dupe
     *
     * @param itemStack
     * @return
     */
    boolean isDupeItem(ItemStack itemStack);

}
