package com.stanzaliving.core.generic.po.enums;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public enum GrnPercentageCompletion {
    RANGE_EQ_0(0,0,"=","=","0%"),
    RANGE_0_25(0,25,">","<=","0% - 25%"),
    RANGE_25_50(25,50,">","<=","25% - 50%"),
    RANGE_50_75(50,75,">","<=","50% - 75%"),
    RANGE_75_85(75,85,">","<=","75% - 85%"),
    RANGE_85_90(85,90,">","<=","85% - 90%"),
    RANGE_90_95(90,95,">","<=","90% - 95%"),
    RANGE_95_100(95,100,">","<=","95% - 100%"),
    RANGE_GT_100(100,100,">",">",">100%");

    private int lowerBound;
    private int upperBound;
    private String gtOperation;
    private String ltOperation;
    private String displayText;
    //private boolean to;
    private static List<UIKeyValue> grnStatusOptions;
    static {
        grnStatusOptions = EnumSet.allOf(GrnPercentageCompletion.class).stream().map(range->UIKeyValue.builder().label(range.getDisplayText()).value(range.toString()).build()).collect(Collectors.toList());
    }
    public static List<UIKeyValue> getListOfGrnCompletionRange(){
        return grnStatusOptions;
    }
}
