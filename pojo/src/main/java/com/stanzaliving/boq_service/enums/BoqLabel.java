package com.stanzaliving.boq_service.enums;

import javafx.scene.layout.BorderWidths;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public enum BoqLabel {
//    CAPEX("Capex", "expense1"),
//    OPEX("Opex", "expense2"),

    CAPEX_TRANSFORMATION("CAPEX-TRANSFORMATION", Arrays.asList("CAPEX","Rental")),
    CAPEX_STRUCTURAL_CHANGE("CAPEX-STRUCTURAL CHANGE",Arrays.asList("CAPEX","Rental")),
    CAPEX_MARGIN_ENHANCEMENT("CAPEX-MARGIN ENHANCEMENT",Arrays.asList("CAPEX","Rental")),
    CAPEX_REDENSIFICATION("CAPEX-REDENSIFICATION",Arrays.asList("CAPEX","Rental")),
    REFURBISHMENT("REFURBISHMENT",Arrays.asList("FFE")),
    CAPEX_VAS("CAPEX-VAS",Arrays.asList("CAPEX VAS","Rental VAS")),
    LL_DEBIT_LL_ASSET("LL DEBIT - LL ASSET",Arrays.asList("CAPEX LL Debit","Rental LL Debit")),
    LL_DEBIT_SL_ASSET("LL DEBIT - SL ASSET",Arrays.asList("CAPEX LL Debit","Rental LL Debit")),
    CONSULTANT_DEBIT("CONSULTANT DEBIT",Arrays.asList("Consultant Debit")),
    CAPEX_LL_SOW_MISALIGNMENT("CAPEX - LL SOW MISALIGNMENT",Arrays.asList("CAPEX - LL SOW Misalignment")),
    NA("NA", Arrays.asList("")); // not to be used while labeling. (only used to tag legacy boqs)

    private final String boqLabelText;
    private final List<String> poExpenseType;

    public static List<BoqLabel> getAllLabels() {
        return Arrays.stream(BoqLabel.values())
                .filter(boqLabel -> !boqLabel.equals(BoqLabel.NA))
                .collect(Collectors.toList());
    }

    public static List<BoqLabel>  getLabelsForExpenseType(String expenseType){
        List<BoqLabel> boqList=new ArrayList<BoqLabel>();
        boqList.add(BoqLabel.NA);
        for(BoqLabel bl:BoqLabel.getAllLabels()){
            if(bl.getPoExpenseType().contains(expenseType)){
                boqList.add(bl);
            }
        }
        return boqList;
    }
}
