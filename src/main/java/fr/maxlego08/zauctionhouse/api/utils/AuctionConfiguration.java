package fr.maxlego08.zauctionhouse.api.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemFlag;

import fr.maxlego08.zauctionhouse.api.enums.Sorting;
import fr.maxlego08.zauctionhouse.api.sound.SoundOption;
import fr.maxlego08.zauctionhouse.api.storage.Storage;
import fr.maxlego08.zauctionhouse.api.tax.TaxType;

public class AuctionConfiguration {

    // BOOLEAN

    public static boolean betterPrice = true;
    public static boolean betterPriceReduction = false;
    public static boolean categoryCheckOnlyMaterial = true;
    public static boolean creativeSell = true;
    public static boolean disableCommands = false;
    public static boolean disableDefaultSellPriceFormatError = true;
    public static boolean disablePriceErrorDefault = false;
    public static boolean disableSaleIfPlayerIsLagging = true;
    public static boolean disableSaleIfServerIsLagging = true;
    public static boolean disableSellBreakItem = false;
    public static boolean displayCooldownMessage = true;
    public static boolean displayErrorBuyMessage = false;
    public static boolean dontGiveIfPlayerHasFullInventory = false;
    public static boolean enableAddItemFlagToAuctionItem = false;
    public static boolean enableAutoUpdate = true;
    public static boolean enableAsyncInventoryOpen = true;
    public static boolean enableBackup = true;
    public static boolean enableBuyAnnonce = false;
    public static boolean enableBuyErrorSound = false;
    public static boolean enableBuySuccessSound = false;
    public static boolean enableCacheItems = false;
    public static boolean enableClaimMoney = false;
    public static boolean enableClaimMoneyMessageOnJoin = false;
    public static boolean enableCommandInventories = false;
    public static boolean enableCooldownClick = false;
    public static boolean enableCooldownCommand = true;
    public static boolean enableCustomHelpMessage = false;
    public static boolean enableCustomOpenMessage = false;
    public static boolean enableCustomSearchMessage = false;
    public static boolean enableCustomSellMessage = false;
    public static boolean enableDebugMode = false;
    public static boolean enableDebugModeTime = false;
    public static boolean enableDefaultTax = false;
    public static boolean enableHeadDatabaseVerification = true;
    public static boolean enableItemsTax = false;
    public static boolean enableLogFileSaveInformations = true;
    public static boolean enableMinMaxPricePerItems = false;
    public static boolean enableNewBase64ItemStackMethod = false;
    public static boolean enableNumberFormatSell;
    public static boolean enableOpenSyncInventory = false;
    public static boolean enablePapiInAuctionItemLore = true;
    public static boolean enablePermissionForSellingTime = false;
    public static boolean enablePlugin = true;
    public static boolean enablePrioritySort = false;
    public static boolean enablePrioritySortLimit = false;
    public static boolean enableRedisAutoGiveMoneyIfPlayerIsOnline = false;
    public static boolean enableRedisAutoUpdateInventory = false;
    public static boolean enableSellAnnonce = false;
    public static boolean enableSellEconomyInventory = true;
    public static boolean enableTaxByPassPermission = false;
    public static boolean enableTransactionMessageOnJoin = false;
    public static boolean enableVersionChecker = true;
    public static boolean enableWhitelist = false;
    public static boolean giveItemAfterPurchase = false;
    public static boolean giveItemAfterRemove = false;
    public static boolean giveMoneyOnSellServer = true;
    public static boolean needPriceForSellInventory = true;
    public static boolean openInventoryAfterBuying = false;
    public static boolean openInventoryAfterRemoveConfirm = true;
    public static boolean useLog = true;
    public static boolean useLogInFile = false;
    public static boolean useNoMoneyItem = true;
    public static boolean useSellCooldown = true;
    public static boolean USE_ZMENU_INVENTORY = false;

    // LONG

    public static long cacheDurationCategory = 60 * 1000;
    public static long cacheItemStackMilliSeconds = 1000;
    public static long cachePlaceholderDurationMillis = 1000 * 60;
    public static long cacheSeconds = 15;
    public static long commandCooldownMilliSeconds = 5000;
    public static long cooldownClaimMoneyMessageTicks = 10;
    public static long cooldownClaimMoneySecond = 300;
    public static long cooldownCommandSell = 5;
    public static long cooldownInformationsMessageTicks = 15;
    public static long cooldownTransactions = 30000;
    public static long expireTime = 24 * 3600 * 7;
    public static long maxPrice = 999999999999999999L;
    public static long minPrice = 10L;
    public static long noMoneyItemTicks = 20;
    public static long removeTransactionAfterSeconds = 86400 * 7;
    public static long sellTime = 48 * 3600;

    // INT

    public static int autoSaveSecond = 60 * 15;
    public static int maxPingForSellAnItem = 600;
    public static int maxSqlRetryAmount = 5;
    public static int minTpsForSellAnItem = 16;
    public static int sortCooldownChange = 5;
    public static int transactionPageSize = 5;

    // STRING

    public static String addonPermission = null;
    public static String defaultEconomy = "VAULT";
    public static String defaultFormat = "%amount%";
    public static String mainCommand = "zauctionhouse";
    public static String permissionBuyAnnonce = null;
    public static String permissionSellAnnonce = null;
    public static String placeholderLoader = "Loading...";
    public static String tableSqlPrefix = "";
    public static String taxBypassPermission = "zauctionhouse.bypass.tax";
    public static String transactionDateFormat = "YYYY MM dd hh:mm";
    public static String versionPermission = null;

    // LIST

    public static List<FormatConfig> formatConfigs = new ArrayList<>();
    public static List<ItemFlag> itemFlags = Arrays.asList(ItemFlag.values());
    public static List<NumberFormatSell> numberFormatSells = new ArrayList<>();
    public static List<String> sellCommandAliases = Arrays.asList("sell", "vendre", "s");
    public static List<String> subCommands = Arrays.asList("zauction", "ah", "hdv", "zah", "zhdv");

    // OTHER

    public static ClickType showClick = ClickType.RIGHT;
    public static DiscordWebhookConfig discordWebhook;
    public static DupeConfig dupeConfig;
    public static Sorting defaultSort = Sorting.DECREASING_DATE;
    public static SoundOption soundBuyError;
    public static SoundOption soundBuySuccess;
    public static Storage storage = Storage.JSON;
    public static TaxType taxType = TaxType.SELL;
    public static double taxDefaultPercent = 10.0;
    public static char betterPriceEspace = ' ';

    static {
        numberFormatSells.add(new NumberFormatSell("k", 1000));
        numberFormatSells.add(new NumberFormatSell("m", 1000000));
        numberFormatSells.add(new NumberFormatSell("B", 1000000000));
        numberFormatSells.add(new NumberFormatSell("T", 1000000000000L));
    }
}
