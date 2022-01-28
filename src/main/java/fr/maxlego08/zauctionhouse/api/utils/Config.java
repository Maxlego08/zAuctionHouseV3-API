package fr.maxlego08.zauctionhouse.api.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.event.inventory.ClickType;

import fr.maxlego08.zauctionhouse.api.enums.Economy;
import fr.maxlego08.zauctionhouse.api.enums.Sorting;
import fr.maxlego08.zauctionhouse.api.storage.Saveable;
import fr.maxlego08.zauctionhouse.api.storage.Storage;
import fr.maxlego08.zauctionhouse.api.tax.TaxType;

public class Config implements Saveable {

	/* Enum */
	public static Storage storage = Storage.JSON;
	public static Economy defaultEconomy = Economy.VAULT;

	/* Boolean */
	public static boolean useSellCooldown = true;
	public static boolean enablePlugin = true;
	public static boolean creativeSell = true;
	public static boolean betterPrice = true;
	public static boolean betterPriceReduction = false;
	public static boolean useNoMoneyItem = true;
	public static boolean displayErrorBuyMessage = false;
	public static boolean enableSellAnnonce = false;
	public static boolean enableBuyAnnonce = false;
	public static boolean openInventoryAfterRemoveConfirm = true;
	public static boolean openInventoryAfterBuying = false;
	public static boolean useLog = true;
	public static boolean useLogInFile = false;
	public static boolean disableCommands = false;
	public static boolean enableAutoUpdate = false;
	public static boolean enableClaimMoney = false;
	public static boolean enableClaimMoneyMessageOnJoin = true;
	public static boolean enableTransactionMessageOnJoin = true;
	public static boolean needPriceForSellInventory = true;

	public static boolean enableDebugMode = false;
	public static boolean enableCustomHelpMessage = false;

	public static boolean disableSellBreakItem = false;

	public static boolean enablePlayerPoint = false;
	public static boolean enableTokenManager = false;
	public static boolean enableMySQLToken = false;
	public static boolean enableLevel = false;
	public static boolean enableVault = false;
	public static boolean enableItem1 = false;
	public static boolean enableItem2 = false;
	public static boolean enableItem3 = false;
	public static boolean enableOptEco = false;
	public static boolean enableCustomEconomy = false;
	public static boolean displayCooldownMessage = true;
	public static boolean giveItemAfterPurchase = false;
	public static boolean sendItemToPurchaseInventoryIfIsFull = true;

	public static boolean enableInventoryPreRender = false;
	public static boolean enableCommandInventories = false;
	public static boolean enableOpenSyncInventory = false;
	
	public static boolean disablePriceErrorDefault = true;
	
	public static boolean enableMinMaxPricePerItems = false;
	public static boolean enableVersionChecker = true;
	
	public static boolean enableRedisAutoUpdateInventory = false;
	public static boolean enableRedisAutoGiveMoneyIfPlayerIsOnline = false;

	
	/* Tax */
	
	public static boolean enableDefaultTax = false;
	public static boolean enableItemsTax = false;
	public static TaxType taxType = TaxType.SELL;
	public static double taxDefaultPercent = 10.0;
	
	/* Integer */
	
	public static long removeTransactionAfterSeconds = 86400 * 15; 

	public static long maxPrice = 999999999999999999l;
	public static long minPrice = 10l;

	public static long sellTime = 48 * 3600;
	public static long expireTime = 24 * 3600 * 7;

	public static long noMoneyItemMilliSecond = 1000;
	public static long autoUpdateMilliSecond = 3000;
	public static long cooldownClaimMoneyMessageMilliSecond = 550;
	public static long cooldownInformationsMessageMilliSecond = 800;

	public static long cooldownCommandSell = 5;
	public static int transactionPageSize = 5;

	/* Strings */

	public static String transactionDateFormat = "YYYY MM dd hh:mm:ss";

	public static char betterPriceEspace = ' ';

	public static String playerPointFormat = "p";
	public static String tokenManagerFormat = "t";
	public static String tokenLevel = "l";
	public static String customEcoForm = "c";
	public static String mySqlTokenFormat = "mt";
	public static String item1Format = "i";
	public static String item2Format = "o";
	public static String item3Format = "b";
	public static String vaultFormat = "v";
	public static String optEcoFormat = "oe";

	public static String currencyVault = "$";
	public static String currencyLevel = "L";
	public static String currencyPlayerPoint = "£";
	public static String currencyTokenManager = "T";
	public static String currencyMySQLToken = "MT";
	public static String currencyItem1 = "gold nuggets";
	public static String currencyItem2 = "gold ingot";
	public static String currencyItem3 = "gold block";
	public static String currencyOptEco = "OPT";

	public static List<String> subCommands = Arrays.asList("zauction", "ah", "hdv", "zah", "zhdv");

	/* Material */

	public static Material materialItem = Material.GOLD_NUGGET;
	public static Material materialItem2 = Material.GOLD_INGOT;
	public static Material materialItem3 = Material.GOLD_BLOCK;
	
	public static ClickType showClick = ClickType.RIGHT;

	/* Other */
	public static List<String> blacklistPlayers = new ArrayList<String>();
	public static int autoSaveSecond = 60 * 15;
	public static int sortCooldownChange = 5;
	public static int maxSqlRetryAmoun = 5;
	public static Sorting defaultSort = Sorting.DECRASING_DATE;

	public void save(Persist persist) {
		persist.save(this);
	}

	public void load(Persist persist) {
		persist.loadOrSaveDefault(this, Config.class);
		if (blacklistPlayers == null)
			blacklistPlayers = new ArrayList<String>();
	}

}
