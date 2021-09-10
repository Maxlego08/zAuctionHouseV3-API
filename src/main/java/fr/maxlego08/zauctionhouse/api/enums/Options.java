package fr.maxlego08.zauctionhouse.api.enums;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;

import fr.maxlego08.zauctionhouse.api.utils.Config;
public enum Options {

	ENABLE_DEBUG_MODE("enableDebugMode", "Enables the debug mode of the plugin.", "You will thus be able to obtain information", "in your console."),
	
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
	
	ENABLE_PLAYER_POINT("enablePlayerPoint", "Enables economy with PlayerPoint"),
	ENABLE_MYSQL_TOKEN("enableMySQLToken", "Enables economy with MySQLToken"),
	ENABLE_TOKEN_MANAGER("enableTokenManager", "Enables v TokenManager"),
	ENABLE_LEVEL("enableLevel", "Enables economy Level"),
	ENABLE_VAULT("enableVault", "Enables economy Vault"),
	ENABLE_ITEM_1("enableItem2", "Enables economy with Item1"),
	ENABLE_ITEM_2("enableItem2", "Enables economy with Item2"),
	ENABLE_ITEM_3("enableItem3", "Enables economy with Item3"),
	ENABLE_OPT_ECO("enableOptEco", "Enables economy with OptEco"),
	ENABLE_CUSTOM("enableCustomEconomy", "Enables economy with Custom plugin"),
	
	ENABLE_AUTO_UPDATE("enableAutoUpdate", "Enables automatic inventory updating"),
	
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
	
	ENABLE_CUSTOM_HELP_MESSAGE("enableCustomHelpMessage", "Allows you to display the message", "you have configured in the message.yml file."),
	
	DISPLAY_COOLDOWN_MESSAGE("displayCooldownMessage", "Displays a message if the player is in cooldown."),
	
	GIVE_ITEM_AFTER_PURCHASE("giveItemAfterPurchase", "Allows the player to directly have the purchased item","in his inventory if there is enough room."),
	
	ENABLE_INVENTORY_PRE_RENDER("enableInventoryPreRender", "Allows you to make items that are permanent."),
	
	ENABLE_COMMAND_INVENTORIES("enableCommandInventories", "Enable commands /ah items, /ah category, /ah selling and /ah buying"),
	
	ENABLE_OPEN_SYNC_INVENTORY("enableOpenSyncInventory", "Allows to open the inventory with the items in a synchronized way"),
	
	NEED_PRICE_FOR_SELL_INVENTORY("needPriceForSellInventory", "Activate the fact that the price for", "the command /ah sellinventory is obligatory."),
	
	ENABLE_DEFAULT_TAX("enableDefaultTax", "Activate the default tax system", "A percentage fee will be charged for all items."),
	ENABLE_ITEMS_TAX("enableItemsTax", "Activate the tax system by item", "A percentage of tax will be charged according to the item"),
	
	DISABLE_PRICE_ERRORS_DEFAULT("disablePriceErrorDefault", "Disables the sale if the price and saving is not found."),
	
	ENABLE_MIN_MAX_PRICE_PER_ITEMS("enableMinMaxPricePerItems", "Allows you to activate the minimum and maximum","price according to the item"),
	
	ENABLE_VERSION_CHECKER("enableVersionChecker", "Enable plugin version checker"),

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
