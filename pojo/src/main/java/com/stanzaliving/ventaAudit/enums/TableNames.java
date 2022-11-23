package com.stanzaliving.ventaAudit.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TableNames {
    AUDIT_DETAILS("Audit Details"),
    INVENTORY_CHECKLIST("Inventory Checklist"),
    ROOM_HANDOVER_STATUS("Room Handover Status");
    private final String tableName;
}
