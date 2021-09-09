package com.stanzaliving.ventaAudit.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DamageAssessed {
    MINOR_DAMAGE("Minor Damage"),
    MAJOR_DAMAGE("Major Damage"),
    ITEM_MISSING("Item Missing"),
    NO_DAMAGE("No Damage");
    private final String damageType;
}
