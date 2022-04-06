package com.stanzaliving.boq_service.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
    NA("NA"); // not to be used while labeling. (only used to tag legacy boqs)

    private final String boqLabelText;

    public static List<BoqLabel> getAllLabels() {
        return Arrays.stream(BoqLabel.values())
                .filter(boqLabel -> !boqLabel.equals(BoqLabel.NA))
                .collect(Collectors.toList());
    }
}