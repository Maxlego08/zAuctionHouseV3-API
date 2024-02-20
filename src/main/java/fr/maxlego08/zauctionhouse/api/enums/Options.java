package fr.maxlego08.zauctionhouse.api.enums;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;

import fr.maxlego08.zauctionhouse.api.utils.Config;
public enum Options {

	ENABLE_DEBUG_MODE("enableDebugMode", "Enables the debug mode of the plugin.", "You will thus be able to obtain information", "in your console."),
	ENABLE_DEBUG_MODE_TIME("enableDebugModeTime", "Enables time debugs, is used to measure plugin performance"),
	
	USE_SELL_COOLDOWN("useSellCooldown", "Added a cooldown on the command /ah sell"),

	ENABLE_PLUGIN("enablePlugin", "Allows to disable access to the plugin for players."),

	CREATIVE_SELL("creativeSell", "Allow to activate the sale in creative."),

	BETTER_PRICE("betterPrice", "Allows you to change the format of the selling price"),

	BETTER_PRICE_REDUCTION("betterPriceReduction", "Allows you to change the format of the selling price"),

	USE_NO_MONEY_ITEM("useNoMoneyItem", "Displays an item if the player does not have enough money."),
	
	DISABLE_ERROR_BUY_MESSAGE("displayErrorBuyMessage", "Displays a message if the player cannot purchase the item."),
	
	ENABLE_SELL_ANNONCE("enableSellAnnonce", "Makes an announcement when the player sells an item."),
	
	ENABLE_BUY_ANNONCE("enableBuyAnnonce", "Makes an announcement when the player buy an item."),
	
	OPEN_INVENTORY_AFTER_REMOVE_CONFIRM("openInventoryAfterRemoveConfirm", "Allows the opening of the inventory after" + "validation to remove the item from the sale."),
	
	OPEN_INVENTORY_AFTER_BUYING("openInventoryAfterBuying", "Allows the opening of the inventory after buying an item"),
	
	USE_LOG("useLog", "Allows to have logs of each action in the console."),
	
	USE_LOG_CONFIG("useLogInFile", "Allows to have logs of each action in a file."),
	
	DISABLE_COMMANDS("disableCommands", "Allows you to disable the /ah command", "useful if you want to give access to the plugin with NPCs"),
	
	ENABLE_CLAIM_MONEY("enableClaimMoney", "If this option is enabled, then the player will",
			"have to recover his money manually," , 
			"if your economy does not support offline player" ,
			"you have to enable this option."),
	
	ENABLE_CLAIM_MONEY_MESSAGE_ON_JOIN("enableClaimMoneyMessageOnJoin", "Sends a message to the player to warn",
			"him that he has to get his money back",
			"when he logs in."),
	
	ENABLE_TRANSACTION_MESSAGE_ON_JOIN("enableTransactionMessageOnJoin", "Sends a message to the gambler that he or she made",
			"transactions while he or she was away."),
	
	DISABLE_BREAK_ITEMS("disableSellBreakItem", "Allows you to disable the sale of items are broken."),
	
	ENABLE_CUSTOM_HELP_MESSAGE("enableCustomHelpMessage", "Allows you to display the message", "you have configured in the message.yml file for /ah help."),
	
	ENABLE_CUSTOM_SELL_MESSAGE("enableCustomSellMessage", "Allows you to display the message", "you have configured in the message.yml file for /ah sell."),
	
	DISPLAY_COOLDOWN_MESSAGE("displayCooldownMessage", "Displays a message if the player is in cooldown."),
	
	GIVE_ITEM_AFTER_PURCHASE("giveItemAfterPurchase", "Allows the player to directly have the purchased item","in his inventory if there is enough room."),
	
	SEND_ITEM_PURCHASE_INVENTORY_IF_IS_FULL("sendItemToPurchaseInventoryIfIsFull", "Allows to send an item to the inventory of", "purchased items if at the time of purchase the user", "is full and you have activated", "the option giveItemAfterPurchase."),
	
	ENABLE_COMMAND_INVENTORIES("enableCommandInventories", "Enable commands /ah items, /ah category, /ah selling and /ah buying"),
	
	ENABLE_OPEN_SYNC_INVENTORY("enableOpenSyncInventory", "Allows to open the inventory with the items in a synchronized way"),
	
	NEED_PRICE_FOR_SELL_INVENTORY("needPriceForSellInventory", "Activate the fact that the price for", "the command /ah sellinventory is obligatory.", "Need to restart your server after enable this option !"),
	
	ENABLE_DEFAULT_TAX("enableDefaultTax", "Activate the default tax system", "A percentage fee will be charged for all items."),
	ENABLE_ITEMS_TAX("enableItemsTax", "Activate the tax system by item", "A percentage of tax will be charged according to the item"),
	
	DISABLE_PRICE_ERRORS_DEFAULT("disablePriceErrorDefault", "Disables the sale if the price and saving is not found."),
	
	ENABLE_MIN_MAX_PRICE_PER_ITEMS("enableMinMaxPricePerItems", "Allows you to activate the minimum and maximum","price according to the item"),
	
	ENABLE_VERSION_CHECKER("enableVersionChecker", "Enable plugin version checker"),
	
	ENABLE_REDIS_AUTO_UPDATE_INVENTORY("enableRedisAutoUpdateInventory", "Allows you to activate the inventory update automatically.", "You must have the Redis addon."),
	
	ENABLE_REDIS_AUTO_UPDATE_MONEY("enableRedisAutoGiveMoneyIfPlayerIsOnline", "Allows you to automatically give money to a player.", "You must have the Redis addon."),
	
	ENABLE_CLICK_COOLDOWN("enableCooldownClick", "Added a cooldown on the click in the inventory to avoid action spam."),
	
	ENABLE_ADD_ITEMFLAG("enableAddItemFlagToAuctionItem", "Add itemflag for auction item"),
	
	ENABLE_LOG_FILE_INFORMATIONS("enableLogFileSaveInformations", "Add log when file is saving"),
	
	DISABLE_SALE_IF_PLAYER_IS_LAGGING("disableSaleIfPlayerIsLagging", "Disable the sale if the player has too high ping"),
	DISABLE_SALE_IF_SERVER_IS_LAGGING("disableSaleIfServerIsLagging", "Disables the sale if the server does not have enough tps"),
	
	ENABLE_SHULKER_PACKS("enableShulkerPacks", "Enable the shulkerpack plugin"),
	
	ENABLE_TAB_BYPASS_PERMISSION("enableTaxByPassPermission", "Enable tax bypass permission"),
	ENABLE_PAPI_IN_AUCTION_ITEM_LORE("enablePapiInAuctionItemLore", "Enable the use of PlaceholderAPI in the item lore.", "Disable the option to gain performance"),
	
	ENABLE_PRIORITY_SORT("enablePrioritySort", "Activates the priority system"),
	ENABLE_PRIORITY_SORT_LIMIT("enablePrioritySortLimit", "Activates the priority limit, so all priority items will not be displayed"),
	ENABLE_PERMISSION_FOR_SELLING("enablePermissionForSellingTime", "Enables expiration time by permissions"),
	;

	private final String fieldName;
	private final List<String> descriptions;
	private final Material material;

	/**
	 * @param name
	 * @param material
	 * @param descriptions
	 */
	private Options(String name, String... strings) {
		this.fieldName = name;
		this.material = Material.PAPER;
		this.descriptions = Arrays.asList(strings);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return fieldName;
	}

	/**
	 * @return the material
	 */
	public Material getMaterial() {
		return material;
	}

	/**
	 * @return the descriptions
	 */
	public List<String> getDescriptions() {
		return descriptions;
	}

	public boolean toggle() {

		try {
			Class<Config> classz = Config.class;
			Field field = classz.getDeclaredField(fieldName);
			field.set(classz, !(Boolean) field.get(classz));					
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean isToggle() {

		try {
			Class<Config> classz = Config.class;
			Field field = classz.getDeclaredField(fieldName);
			return (Boolean) field.get(classz);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
