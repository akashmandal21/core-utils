package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderType {
    ALA_CARTE("Ala-Carte"),
    BATCH("Batch");

    private final String type;
}
