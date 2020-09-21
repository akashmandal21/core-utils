package com.stanzaliving.core.generic.validation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum GSTSlabs {

    NA("Not Applicable",null),
    ZERO("0 %",0.0),
    FIVE("05 %",5.0),
    TWELEVE("12 %",12.0),
    EIGHTEEN("18 %",18.0),
    TWENTY_EIGHT("28 %",28.0);
    private String fieldTypeText;
    private Double gstPct;


    private static List<GSTSlabs> sortedGstSlabs = new ArrayList<>();

    static {
        sortedGstSlabs.add(NA);
        sortedGstSlabs.add(ZERO);
        sortedGstSlabs.add(FIVE);
        sortedGstSlabs.add(TWELEVE);
        sortedGstSlabs.add(EIGHTEEN);
        sortedGstSlabs.add(TWENTY_EIGHT);
    }

    public static List<GSTSlabs> getSortedGstSlabs(){
        return sortedGstSlabs;
    }

}
