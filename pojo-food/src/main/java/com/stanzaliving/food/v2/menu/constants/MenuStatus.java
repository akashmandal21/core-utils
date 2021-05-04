package com.stanzaliving.food.v2.menu.constants;

import com.stanzaliving.food.v2.category.constant.CategoryStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MenuStatus {
    DRAFT("In Draft"),
    SUBMITTED("Submitted"),
    APPROVED("Approved"),
    REJECTED("Rejected");
    private final String status;

    public static boolean isEditable(MenuStatus menuStatus) {
        return menuStatus == DRAFT || menuStatus == APPROVED || menuStatus == REJECTED;
    }

}
