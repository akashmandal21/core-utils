package com.stanzaliving.ventaAudit.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum KeyHandOver {
    KEY_HANDED_OVER("Key handed over"),
    KEY_LOST("Key lost");
    private final String exitKeyStatus;
}
