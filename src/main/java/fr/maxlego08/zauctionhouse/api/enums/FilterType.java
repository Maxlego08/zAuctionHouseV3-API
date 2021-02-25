package fr.maxlego08.zauctionhouse.api.enums;

public enum FilterType {

	CONTAINS(":="), 
	EQUALS("::"), 
	EQUALSIGNORECASE(":>"),

	;

	private final String type;

	/**
	 * @param type
	 */
	private FilterType(String type) {
		this.type = type;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

}
