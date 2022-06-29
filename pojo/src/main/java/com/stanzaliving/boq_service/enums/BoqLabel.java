package com.stanzaliving.boq_service.enums;

import java.util.*;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableSet;

import com.google.common.collect.Sets;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BoqLabel {

    TRANSFORMATION("TRANSFORMATION"),
    STRUCTURAL_CHANGE("STRUCTURAL CHANGE"),
    MARGIN_ENHANCEMENT("MARGIN ENHANCEMENT"),
    REDENSIFICATION("REDENSIFICATION"),
    REFURBISHMENT("REFURBISHMENT"),
    VAS("VAS"),
    LL_DEBIT_LL_ASSET("LL DEBIT - LL ASSET"),
    LL_DEBIT_SL_ASSET("LL DEBIT - SL ASSET"),
    CONSULTANT_DEBIT("CONSULTANT DEBIT"),
    LL_SOW_MISALIGNMENT("LL SOW MISALIGNMENT"),
    VENDOR_DEBIT("VENDOR DEBIT"),
    B2B_DEAL_EXPENSE("B2B DEAL EXPENSE"),
    PILOT_COST("PILOT COST"),
    NA("NA"); // not to be used while labeling. (only used to tag legacy boqs)

    private final String boqLabelText;

    public static List<BoqLabel> getAllLabels() {
        return Arrays.stream(BoqLabel.values())
                .collect(Collectors.toList());
    }

    public static List<BoqLabel> getBOQLabelsForPoExpenseType(String poExpenseType) {
        if(poExpenseType.equals("Capex")) {
            return Arrays.asList(TRANSFORMATION, STRUCTURAL_CHANGE, MARGIN_ENHANCEMENT, REDENSIFICATION, REFURBISHMENT, VAS, LL_DEBIT_LL_ASSET,
                    LL_DEBIT_SL_ASSET, CONSULTANT_DEBIT, LL_SOW_MISALIGNMENT, VENDOR_DEBIT, B2B_DEAL_EXPENSE, PILOT_COST, NA);
        }else if(poExpenseType.equals("Opex")){
            return Arrays.asList(TRANSFORMATION, STRUCTURAL_CHANGE, MARGIN_ENHANCEMENT, REDENSIFICATION, REFURBISHMENT, VAS, LL_DEBIT_LL_ASSET,
                    LL_DEBIT_SL_ASSET, CONSULTANT_DEBIT, LL_SOW_MISALIGNMENT, VENDOR_DEBIT, B2B_DEAL_EXPENSE, PILOT_COST, NA);
        }
        return new ArrayList<>();
    }
}