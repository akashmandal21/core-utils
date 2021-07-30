package com.stanzaliving.ventaAudit.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoomHandoverElements {
    KEY_HANDOVER("Key handover"),
    INVENTORY_CHECKLIST("Inventory checklist"),
    ELECTRICITY_METER("Electricity meter");
    private final String roomHandoverElements;
}
