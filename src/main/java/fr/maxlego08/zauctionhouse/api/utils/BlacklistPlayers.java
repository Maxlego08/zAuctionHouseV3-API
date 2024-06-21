package fr.maxlego08.zauctionhouse.api.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BlacklistPlayers {

    public static List<UUID> blacklistPlayers = new ArrayList<>();

    public void save(Persist persist) {
        persist.save(this);
    }

    public void load(Persist persist) {
        persist.loadOrSaveDefault(this, BlacklistPlayers.class);
    }
}
