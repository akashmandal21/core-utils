package com.stanzaliving.po.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public enum PoToLabelOps {
    ROUTINE_RNM("Routine R&M"),
    LL_DEBIT("LL Debit"),
    REFURB_FFE("Refurb/FFE"),
    RESIDENT_DAMAGE("Resident Damage"),
    MANPOWER_PO("Manpower PO"),
    AMC("AMC"),
    VENDOR_DEBIT("Vendor Debit"),
    INSURANCE_CLAIM("Insurance Claim"),
    CORPORATE_COST("Corporate Cost"),
    CLIENT_B2B_PARTNER("Client / B2B partner"),
    CAPEX("Capex");

    private final String poToLabelOpsText;

    public static List<PoToLabelOps> getAllLabels() {
        return Arrays.stream(PoToLabelOps.values())
                .collect(Collectors.toList());
    }
}
