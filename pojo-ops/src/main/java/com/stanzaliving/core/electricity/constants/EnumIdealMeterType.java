package com.stanzaliving.core.electricity.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum EnumIdealMeterType {

    PREPAID(1, "PREPAID"),
    POSTPAID(2, "POSTPAID");

    private Integer id;
    private String meterType;

    private static final Map<Integer, EnumIdealMeterType> byId = new HashMap<Integer, EnumIdealMeterType>();

    static {
        for (EnumIdealMeterType e : EnumIdealMeterType.values()) {
            byId.put(e.getId(), e);
        }
    }

    public static Map<Integer, EnumIdealMeterType> getByid() {
        return byId;
    }

    public static EnumIdealMeterType getById(Integer id) {
        return byId.get(id);

    }
}
