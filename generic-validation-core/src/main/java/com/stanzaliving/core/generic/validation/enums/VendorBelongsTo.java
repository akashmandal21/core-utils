package com.stanzaliving.core.generic.validation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum VendorBelongsTo {

    STANZA("stanza"),
    AWL("AWL");

    private String VendorBelongsToText;

    private static Map<String,VendorBelongsTo> VendorBelongsToMap = new HashMap<>();

    static{

        VendorBelongsToMap.put("stanza", STANZA);
        VendorBelongsToMap.put("AWL", AWL);
    }

    public static VendorBelongsTo getVendorBelongsTo(String name) { return VendorBelongsToMap.get(name);}

}
