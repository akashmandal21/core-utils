package com.stanzaliving.food.v2.category.constant;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CategoryStatus {
    DRAFT("In Draft"),
    SUBMITTED("Submitted"),
    APPROVED("Approved"),
    REJECTED("Rejected");
    private final String status;

    public static boolean isEditable(CategoryStatus categoryStatus) {
        return categoryStatus == DRAFT || categoryStatus == APPROVED || categoryStatus == REJECTED;
    }

    public static boolean createNewVersion(CategoryStatus categoryStatus) {
        return categoryStatus == APPROVED;
    }
}
