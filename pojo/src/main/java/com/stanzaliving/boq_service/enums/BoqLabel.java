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

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BoqLabel {

    CAPEX_TRANSFORMATION("CAPEX-TRANSFORMATION", Arrays.asList("CAPEX", "Rental")),
    CAPEX_STRUCTURAL_CHANGE("CAPEX-STRUCTURAL CHANGE", Arrays.asList("CAPEX", "Rental")),
    CAPEX_MARGIN_ENHANCEMENT("CAPEX-MARGIN ENHANCEMENT", Arrays.asList("CAPEX", "Rental")),
    CAPEX_REDENSIFICATION("CAPEX-REDENSIFICATION", Arrays.asList("CAPEX", "Rental")),
    REFURBISHMENT("REFURBISHMENT", Arrays.asList("FFE")),
    CAPEX_VAS("CAPEX-VAS", Arrays.asList("CAPEX VAS", "Rental VAS")),
    LL_DEBIT_LL_ASSET("LL DEBIT - LL ASSET", Arrays.asList("CAPEX LL Debit", "Rental LL Debit")),
    LL_DEBIT_SL_ASSET("LL DEBIT - SL ASSET", Arrays.asList("CAPEX LL Debit", "Rental LL Debit")),
    CONSULTANT_DEBIT("CONSULTANT DEBIT", Arrays.asList("Consultant Debit")),
    CAPEX_LL_SOW_MISALIGNMENT("CAPEX - LL SOW MISALIGNMENT", Arrays.asList("CAPEX - LL SOW Misalignment")),
    NA("NA", Collections.emptyList()); // not to be used while labeling. (only used to tag legacy boqs)

    private final String boqLabelText;
    private final List<String> poExpenseType;

    private static final Map<BoqLabel, List<String>> boqLabelExpenseTypeMap = new HashMap<BoqLabel, List<String>>();
    private static final Map<String, Set<BoqLabel>> expenseTypeBoqLabelMap = new HashMap<String, Set<BoqLabel>>();

    static {
        populateBoqLabelExpenseTypeMap();
        populateExpenseTypeBoqLabelMap();
    }

    /**
     *
     */
    private static void populateBoqLabelExpenseTypeMap() {

        Arrays.stream(BoqLabel.values()).forEach(f -> boqLabelExpenseTypeMap.put(f, f.getPoExpenseType()));
    }

    /**
     *
     */
    private static void populateExpenseTypeBoqLabelMap() {

        Arrays.stream(BoqLabel.values()).forEach(f -> {
            BoqLabel boqLabel = f;
            List<String> expenseTypes = f.getPoExpenseType();

            for (String expenseType : expenseTypes) {
                if (!expenseTypeBoqLabelMap.containsKey(expenseType)) {
                    expenseTypeBoqLabelMap.put(expenseType, ImmutableSet.of(boqLabel));
                } else {
                    expenseTypeBoqLabelMap.get(expenseType).add(boqLabel);
                }
            }
        });
    }

    public static List<BoqLabel> getAllLabels() {
        return Arrays.stream(BoqLabel.values())
                .filter(boqLabel -> !boqLabel.equals(BoqLabel.NA))
                .collect(Collectors.toList());
    }

    public static Set<BoqLabel> getBoqLabelsForExpenseType(String expenseType) {

        return expenseTypeBoqLabelMap.getOrDefault(expenseType, new HashSet<BoqLabel>());
    }

    public static List<BoqLabel> getLabelsForExpenseType(String expenseType) {

        List<BoqLabel> boqLabels = getBoqLabelsForExpenseType(expenseType).stream().collect(Collectors.toList());
        boqLabels.add(BoqLabel.NA);

        return boqLabels;
    }

}