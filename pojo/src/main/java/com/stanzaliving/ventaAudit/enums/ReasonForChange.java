package com.stanzaliving.ventaAudit.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ReasonForChange {
    ITEM_NEEDS_REPAIR("Item needs repair"),
    ITEM_NEEDS_REPLACEMENT_NOT_REPAIR("Item needs replacement not repair"),
    DAMAGE_AMOUNT_WONT_COMPENSATE_FOR_THE_DAMAGE_ASSESSED("Damage amount won't compensate for the damage assessed");
    private final String reasonName;
}
