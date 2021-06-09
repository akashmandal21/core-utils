package com.stanzaliving.core.residenceservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResidenceSortBy {
    PRICE_LOW_TO_HIGH(" order by price asc"),
    PRICE_HIGH_TO_LOW(" order by price desc"),
    FlOOR_ASCENDING(""),
    FLOOR_DESCENDING(""),
    OCCUPANCY_ASCENDING(""),
    OCCUPANCY_DESCENDING("");

    private String name;
}
