package fr.maxlego08.zauctionhouse.api.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum HistoryType {

	BOTH, PURCHASE, SALE,

	;

	public static List<String> toList() {
		return Arrays.asList(values()).stream().map(e -> e.name().toLowerCase()).collect(Collectors.toList());
	}

	public static HistoryType form(String string) {
		if (string == null)
			return HistoryType.BOTH;
		for (HistoryType historyType : values())
			if (historyType.name().equalsIgnoreCase(string))
				return historyType;
		return HistoryType.BOTH;
	}
}
