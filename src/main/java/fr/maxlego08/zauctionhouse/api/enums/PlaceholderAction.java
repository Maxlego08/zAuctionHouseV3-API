package fr.maxlego08.zauctionhouse.api.enums;

public enum PlaceholderAction {

	BOOLEAN,
	
	SUPERIOR, LOWER,

	SUPERIOR_OR_EQUAL, LOWER_OR_EQUAL,;

	public static PlaceholderAction from(String string) {
		if (string == null)
			return null;
		for (PlaceholderAction action : values())
			if (action.name().equalsIgnoreCase(string))
				return action;
		return null;
	}

}
