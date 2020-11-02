package com.stanzaliving.core.cafe.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ItemListingMethod {
    RECOMMENDED("Recommended"),
    BEST_SELLING("Best Selling"),
    ALL("All");
    private String method;
}
