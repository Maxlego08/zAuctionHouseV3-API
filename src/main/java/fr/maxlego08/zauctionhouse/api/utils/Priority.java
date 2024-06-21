package fr.maxlego08.zauctionhouse.api.utils;

import java.util.Map;

public class Priority {

	private final int priority;
	private final int limit;
	private final String permission;
	private final String text;

	/**
	 * @param priority
	 * @param limit
	 * @param permission
	 * @param text
	 */
	public Priority(int priority, int limit, String permission, String text) {
		super();
		this.priority = priority;
		this.limit = limit;
		this.permission = permission;
		this.text = text;
	}

	public Priority(Map<?, ?> map) {
		this(((Number) map.get("priority")).intValue(), ((Number) map.get("limit")).intValue(), (String) map.get("permission"), (String) map.get("text"));
	}

	public String getText() {
		return text;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @return the limit
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * @return the permission
	 */
	public String getPermission() {
		return permission;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Priority [priority=" + priority + ", limit=" + limit + ", permission=" + permission + "]";
	}

}
