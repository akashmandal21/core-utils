package com.stanzaliving.core.residenceservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResidenceSortBy {
    PRICE_LOW_TO_HIGH("order by price"),
    PRICE_HIGH_TO_LOW("order by price desc"),
    FlOOR_ASCENDING("order by a.floor"),
    FLOOR_DESCENDING("order by a.floor desc"),
    OCCUPANCY_ASCENDING("order by b.occupancy"),
    OCCUPANCY_DESCENDING("order by b.occupancy desc"),
    DEFAULT("order by a.floor, price");

    private String name;
}
