package fr.maxlego08.zauctionhouse.api.storage;

public enum Storage {

    MYSQL("jdbc:mysql://"), SQLITE(""), JSON, REDIS,

    CUSTOM,

    ;

    private final String urlBase;

    Storage(String urlBase) {
        this.urlBase = urlBase;
    }

    Storage() {
        this(null);
    }

    public String getUrlBase() {
        return urlBase;
    }

    public boolean isNotDatabase() {
        switch (this) {
            case CUSTOM:
            case REDIS:
            case JSON:
                return true;
            case SQLITE:
            case MYSQL:
            default:
                return false;
        }
    }

    public boolean isDefault() {
        switch (this) {
            case CUSTOM:
            case REDIS:
                return false;
            case SQLITE:
            case JSON:
            case MYSQL:
            default:
                return true;
        }
    }

}
