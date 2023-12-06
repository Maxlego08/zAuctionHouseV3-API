package fr.maxlego08.zauctionhouse.api.utils;

import org.bukkit.configuration.file.YamlConfiguration;

public class DupeConfig {

	private final boolean enable;
	private final boolean enableWebhook;
	private final boolean enableLog;
	private final String discordWebhookUrl;
	private final String discordWebhookContent;
	private final String logContent;

	public DupeConfig(YamlConfiguration configuration) {
		this.enable = configuration.getBoolean("antiDupe.enable", true);
		this.enableWebhook = configuration.getBoolean("antiDupe.discordWebhook.enable", true);
		this.enableLog = configuration.getBoolean("antiDupe.consoleLog.enable", true);
		this.discordWebhookUrl = configuration.getString("antiDupe.discordWebhook.url", "");
		this.discordWebhookContent = configuration.getString("antiDupe.discordWebhook.content", "");
		this.logContent = configuration.getString("antiDupe.consoleLog.content", "");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DupeConfig [enable=" + enable + ", enableWebhook=" + enableWebhook + ", enableLog=" + enableLog
				+ ", discordWebhookUrl=" + discordWebhookUrl + ", discordWebhookContent=" + discordWebhookContent
				+ ", logContent=" + logContent + "]";
	}

	/**
	 * @return the enable
	 */
	public boolean isEnable() {
		return enable;
	}

	/**
	 * @return the enableWebhook
	 */
	public boolean isEnableWebhook() {
		return enableWebhook;
	}

	/**
	 * @return the enableLog
	 */
	public boolean isEnableLog() {
		return enableLog;
	}

	/**
	 * @return the discordWebhookUrl
	 */
	public String getDiscordWebhookUrl() {
		return discordWebhookUrl;
	}

	/**
	 * @return the discordWebhookContent
	 */
	public String getDiscordWebhookContent() {
		return discordWebhookContent;
	}

	/**
	 * @return the logContent
	 */
	public String getLogContent() {
		return logContent;
	}

}
