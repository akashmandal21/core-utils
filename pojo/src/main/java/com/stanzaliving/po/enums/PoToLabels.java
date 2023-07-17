package com.stanzaliving.po.enums;
import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.collections.ListUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public enum PoToLabels {
    ROUTINE_RNM("Routine R&M"),
    LL_DEBIT("LL Debit"),
    REFURB_FFE("Refurb/FFE"),
    RESIDENT_DAMAGE("Resident Damage"),
    MANPOWER_PO("Manpower PO"),
    AMC("AMC"),
    VENDOR_DEBIT("Vendor Debit"),
    INSURANCE_CLAIM("Insurance Claim"),
    CORPORATE_COST("Corporate Cost"),
    CLIENT_B2B_PARTNER("Client/B2B partner"),
    CAPEX("Capex"),
    NA("NA");

    private final String poToLabelText;

    public static List<PoToLabels> getAllLabels(Department department) {
        if(department == Department.OPS)
            return Arrays.asList(ROUTINE_RNM, LL_DEBIT, REFURB_FFE, RESIDENT_DAMAGE, MANPOWER_PO, AMC, VENDOR_DEBIT,
                    INSURANCE_CLAIM, CORPORATE_COST, CLIENT_B2B_PARTNER, CAPEX, NA);
        else
            return ListUtils.EMPTY_LIST;
    }
}
