/**
 * @author gaurav.likhar
 * @date 10/09/23
 * @project_name core-utils
 **/

package com.stanzaliving.ruleEngine.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum BooleanEnum {
    TRUE (true),
    FALSE (false);

    private final boolean booleanData;

    public static Map<Boolean, BooleanEnum> booleanDataMap = new HashMap<>();

    static {
        for(BooleanEnum booleanEnum : BooleanEnum.values()) {
            booleanDataMap.put(booleanEnum.booleanData, booleanEnum);
        }
    }

    public static BooleanEnum getBooleanData(Boolean booleanData) {
        return booleanDataMap.get(booleanData);
    }


}