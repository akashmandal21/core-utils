package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PropertyType {
    ALL("All"), SUITS("Suits"), SCHOLAR("Scholar"), MANAGED_APARTMENTS("Managed Apartments");

    private String name;
}
