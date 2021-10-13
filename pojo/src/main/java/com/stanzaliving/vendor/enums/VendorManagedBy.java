package com.stanzaliving.vendor.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum VendorManagedBy {

    STANZA("Stanza"),
    AWL("AWL");

    private String VendorManagedByText;

    private static Map<String, VendorManagedBy> VendorManagedByMap = new HashMap<>();

    static{

        VendorManagedByMap.put("Stanza", STANZA);
        VendorManagedByMap.put("AWL", AWL);
    }

    public static VendorManagedBy getVendorBelongsTo(String name) { return VendorManagedByMap.get(name);}

}
