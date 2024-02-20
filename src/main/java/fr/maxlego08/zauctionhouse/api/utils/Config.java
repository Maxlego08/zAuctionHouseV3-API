package fr.maxlego08.zauctionhouse.api.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemFlag;

import fr.maxlego08.zauctionhouse.api.enums.Sorting;
import fr.maxlego08.zauctionhouse.api.storage.Saveable;
import fr.maxlego08.zauctionhouse.api.storage.Storage;
import fr.maxlego08.zauctionhouse.api.tax.TaxType;

public class Config implements Saveable {

	public static transient boolean USE_ZMENU_INVENTORY = false;

	public static transient boolean enableBackup = true;
	public static transient boolean enableDebugMode = false;
	public static transient boolean enableDebugModeTime = false;
	public static transient boolean enablePermissionForSellingTime = false;
	public static transient boolean enablePlugin = true;
	public static transient boolean creativeSell = true;
	public static transient boolean useSellCooldown = true;
	public static transient boolean useNoMoneyItem = true;
	public static transient boolean useLog = true;
	public static transient boolean useLogInFile = false;
	public static transient boolean enableCustomHelpMessage = false;
	public static transient boolean enableCustomSellMessage = false;
	public static transient boolean enableCustomSearchMessage = false;
	public static transient boolean enableCustomOpenMessage = false;
	public static transient boolean enablePrioritySort = false;
	public static transient boolean enablePrioritySortLimit = false;
	public static transient long maxPrice = 999999999999999999l;
	public static transient long minPrice = 10l;
	public static transient long cooldownCommandSell = 5;
	public static transient long noMoneyItemTicks = 20;
	public static transient long sellTime = 48 * 3600;
	public static transient long expireTime = 24 * 3600 * 7;
	public static transient Storage storage = Storage.JSON;
	public static transient String mainCommand = "zauctionhouse";
	public static transient List<String> subCommands = Arrays.asList("zauction", "ah", "hdv", "zah", "zhdv");
	public static transient List<String> sellCommandAliases = Arrays.asList("sell", "vendre", "s");
	public static transient Sorting defaultSort = Sorting.DECREASING_DATE;
	public static transient List<NumberFormatSell> numberFormatSells = new ArrayList<>();
	public static boolean enableNumberFormatSell;

	public static transient boolean enableDefaultTax = false;
	public static transient boolean enableItemsTax = false;
	public static transient TaxType taxType = TaxType.SELL;
	public static transient double taxDefaultPercent = 10.0;
	public static transient boolean enableTaxByPassPermission = false;
	public static transient String taxBypassPermission = "zauctionhouse.bypass.tax";

	public static transient String defaultEconomy = "VAULT";
	public static transient DiscordWebhookConfig discordWebhook;

	public static transient boolean disableSaleIfPlayerIsLagging = true;
	public static transient int maxPingForSellAnItem = 600;

	public static transient boolean disableSaleIfServerIsLagging = true;
	public static transient int minTpsForSellAnItem = 16;

	public static transient String addonPermission = null;
	public static transient String versionPermission = null;

	public static transient String transactionDateFormat = "YYYY MM dd hh:mm:ss";

	public static transient long cacheItemStackMilliSeconds = 1000;
	public static transient boolean enablePapiInAuctionItemLore = true;

	public static transient boolean enableCacheItems = false;
	public static transient long cacheSeconds = 15;

	public static transient int sortCooldownChange = 5;

	public static transient int autoSaveSecond = 60 * 15;

	public static transient boolean enableLogFileSaveInformations = true;
	public static transient boolean enableOpenSyncInventory = false;
	public static transient boolean disableCommands = false;

	public static transient boolean enableAddItemFlagToAuctionItem = false;
	public static transient List<ItemFlag> itemFlags = Arrays.asList(ItemFlag.values());

	public static transient ClickType showClick = ClickType.RIGHT;

	public static transient String tablSqlPrefix = "";
	public static transient int maxSqlRetryAmount = 5;

	public static transient long removeTransactionAfterSeconds = 86400 * 7;

	public static transient String numberFormatThousand = "k ";
	public static transient String numberFormatMillion = "m ";
	public static transient String numberFormatBillion = "M ";
	public static transient String numberFormatTrillion = "T ";
    public static transient String numberFormatQuadrillion = "Q ";
    public static transient String numberFormatQuintillion = "QQ ";
    public static transient String numberFormatSextillion = "S ";
    public static transient String numberFormatSeptillion = "SS ";
    public static transient String numberFormatOctillion = "O ";
    public static transient String numberFormatNonillion = "N ";
    public static transient String numberFormatDecillion = "D ";
    public static transient String numberFormatUndecillion = "UN ";
    public static transient String numberFormatDuodecillion = "DD ";
    public static transient String numberFormatTredecillion = "TR ";
    public static transient String numberFormatQuattuordecillion = "QT ";
    public static transient String numberFormatQuindecillion = "QN ";
    public static transient String numberFormatSexdecillion = "SD ";
    public static transient String numberFormatSeptendecillion = "ST ";
    public static transient String numberFormatOctodecillion = "OC ";
    public static transient String numberFormatNovemdecillion = "NO ";
    public static transient String numberFormatVigintillion = "V ";
    public static transient String numberFormatMoreThanVigintillion = "MV ";
    public static transient String numberFormatLessThanVigintillion = "LV ";
	
	public static transient String decimalFormatDefault = "#.#";
	public static transient String decimalFormatThousand = "#.#";
	public static transient String decimalFormatMillion = "#.#";
	public static transient String decimalFormatBillion = "#.#";
	public static transient String decimalFormatTrillion = "#.##";
    public static transient String decimalFormatQuadrillion = "#.##";
    public static transient String decimalFormatQuintillion = "#.###";
    public static transient String decimalFormatSextillion = "#.###";
    public static transient String decimalFormatSeptillion = "#.####";
    public static transient String decimalFormatOctillion = "#.####";
    public static transient String decimalFormatNonillion = "#.#####";
    public static transient String decimalFormatDecillion = "#.#####";
    public static transient String decimalFormatUndecillion = "#.######";
    public static transient String decimalFormatDuodecillion = "#.######";
    public static transient String decimalFormatTredecillion = "#.#######";
    public static transient String decimalFormatQuattuordecillion = "#.#######";
    public static transient String decimalFormatQuindecillion = "#.########";
    public static transient String decimalFormatSexdecillion = "#.########";
    public static transient String decimalFormatSeptendecillion = "#.#########";
    public static transient String decimalFormatOctodecillion = "#.#########";
    public static transient String decimalFormatNovemdecillion = "#.##########";
    public static transient String decimalFormatVigintillion = "#.##########";
    public static transient String decimalFormatMoreThanVigintillion = "#.############";
    public static transient String decimalFormatLessThanVigintillion = "#.###########";

	public static transient boolean betterPrice = true;
	public static transient boolean betterPriceReduction = false;

	public static transient char betterPriceEspace = ' ';
	public static transient boolean enableMinMaxPricePerItems = false;
	public static transient boolean enableSellAnnonce = false;
	public static transient String permissionSellAnnonce = null;
	public static transient boolean displayErrorBuyMessage = false;
	public static transient boolean enableBuyAnnonce = false;

	public static transient boolean enableClaimMoney = false;
	public static transient boolean enableClaimMoneyMessageOnJoin = false;
	public static transient boolean enableTransactionMessageOnJoin = false;

	public static transient boolean disableSellBreakItem = false;

	public static transient boolean giveItemAfterPurchase = false;
	public static transient boolean sendItemToPurchaseInventoryIfIsFull = true;
	public static transient boolean openInventoryAfterRemoveConfirm = true;
	public static transient boolean openInventoryAfterBuying = false;
	public static transient boolean needPriceForSellInventory = true;
	public static transient boolean disablePriceErrorDefault = true;
	public static transient boolean enableCommandInventories = false;
	public static transient boolean enableVersionChecker = true;

	public static transient boolean enableRedisAutoUpdateInventory = false;
	public static transient boolean enableRedisAutoGiveMoneyIfPlayerIsOnline = false;

	public static transient boolean disableDefaultSellPriceFormatError = false;

	public static transient long cooldownClaimMoneyMessageTicks = 10;
	public static transient long cooldownClaimMoneySecond = 300;

	public static transient long cooldownInformationsMessageTicks = 15;

	public static transient int transactionPageSize = 5;

	public static transient boolean displayCooldownMessage = true;
	public static transient boolean enableCooldownClick = false;
	public static transient long cooldownClickMilliseconds = 500;

	public static transient long commandCooldownMilliSeconds = 5000;
	public static transient boolean enableCooldownCommand = true;

	public static transient boolean categoryCheckOnlyMaterial = true;
	
	public static transient boolean enableAutoUpdate = true;

	// ------
	
	public static List<String> blacklistPlayers = new ArrayList<String>();

	public static transient DupeConfig dupeConfig;

	public static boolean enableSQLScript = true;

	public static long cacheDurationCategory = 60 * 1000; // Cache de 60 secondes

	static {
		numberFormatSells.add(new NumberFormatSell("k", 1000));
		numberFormatSells.add(new NumberFormatSell("m", 1000000));
		numberFormatSells.add(new NumberFormatSell("B", 1000000000));
		numberFormatSells.add(new NumberFormatSell("T", 1000000000000l));
	}

	public void save(Persist persist) {
		persist.save(this);

	}

	public void saveConfigFile() {
		
	}

	public void load(Persist persist) {		
	}


}
