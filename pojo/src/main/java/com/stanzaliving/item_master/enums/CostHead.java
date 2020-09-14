package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum CostHead {

    BRANDING("Branding"),
    LEAD_GEN("Lead Gen"),
    CAPEX("Capex"),
    OPEX("Opex");

    
    private String costHeadText;

    public static Map<String, CostHead> costHeadByNameMap = new HashMap<>();

    static {

        for (CostHead costHead : CostHead.values()) {
            costHeadByNameMap.put(costHead.getCostHeadText(), costHead);
        }
    }

    public static CostHead getCostHeadByName(String costHeadName) {
        return costHeadByNameMap.get(costHeadName);
    }

}
