package fr.maxlego08.zauctionhouse.api.tax;

import fr.maxlego08.zauctionhouse.api.storage.Savable;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Optional;

public interface TaxManager extends Savable {

    /**
     * Gets the tax applicable to a specific item stack.
     *
     * @param itemStack the item stack to check.
     * @return an {@link Optional} containing the {@link Tax} if applicable, or an empty {@link Optional} if no tax applies.
     */
    Optional<Tax> getTax(ItemStack itemStack);

    /**
     * Calculates the tax for a given price, item stack, and tax type.
     *
     * @param player    the player for whom the tax is being calculated.
     * @param price     the price of the item.
     * @param itemStack the item stack being taxed.
     * @param type      the type of tax.
     * @return the calculated tax amount.
     */
    double getTax(Player player, long price, ItemStack itemStack, TaxType type);

    /**
     * Reverses the tax calculation to determine the original price before tax.
     *
     * @param price     the price after tax.
     * @param itemStack the item stack being taxed.
     * @return the original price before tax.
     */
    double reverseTax(long price, ItemStack itemStack);

    /**
     * Gets the tax percentage applicable to a specific item stack and tax type.
     *
     * @param itemStack the item stack to check.
     * @param type      the type of tax.
     * @return the tax percentage.
     */
    double getTaxPercent(ItemStack itemStack, TaxType type);
}

