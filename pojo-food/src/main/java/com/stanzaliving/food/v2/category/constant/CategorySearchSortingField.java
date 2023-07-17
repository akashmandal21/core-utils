package com.stanzaliving.food.v2.category.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CategorySearchSortingField {
    CATEGORY_ID("Category Id"),
    MEAL_WISE_NAME("Meal Wise Name"),
    MENU_TYPE("Menu Type"),
    FOOD_SERVE_TYPE("Food Serve Type"),
    RESIDENCE_SERVED("Residence Served"),
    CATEGORY_STATUS("Category Status"),
    APPROVAL_STATUS("Approval Status"),
    LAST_UPDATED_AT("Last Updated At"),
    APPROVAL_REQUESTED_ON("Approval Requested On"),
    COST_UPDATED("Cost Updated"),
    VENDOR_NAME("Vendor Name"),
    BUDGET_STATUS("Monthly Budget Status"),
    MONTH("Month");
    private final String field;
}
