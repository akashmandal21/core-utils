package com.stanzaliving.core.cafe.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ChargeType {
    DELIVERY_CHARGES("Delivery Charges"),
    CONVENIENCE_FEE("Convenience fee"),
    IN_ROOM_DELIVERY_CHARGES("In Room Delivery Charges");

    private String chargeTypeName;

    private static final List<EnumListing<ChargeType>> enumListing = new ArrayList<>();

    public static List<EnumListing<ChargeType>> getEnumListing() {
        return enumListing;
    }

    static {
        for (ChargeType chargeType : ChargeType.values()) {
            EnumListing<ChargeType> listing = EnumListing.of(chargeType, chargeType.getChargeTypeName());
            enumListing.add(listing);
        }
    }
}
