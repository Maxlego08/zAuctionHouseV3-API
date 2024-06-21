package fr.maxlego08.zauctionhouse.api;

import fr.maxlego08.zauctionhouse.api.enums.ConvertType;
import org.bukkit.command.CommandSender;

public interface ConvertManager {

    /**
     * Converts a file based on the specified type and hour.
     *
     * @param sender the command sender who initiated the conversion.
     * @param type   the type of conversion to be performed.
     * @param hour   the hour to be considered for the conversion.
     */
    void convertFile(CommandSender sender, ConvertType type, long hour);

}

