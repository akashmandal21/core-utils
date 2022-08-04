package com.stanzaliving.food.v2.menu.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum MonthlyBudgetStatus {

    DRAFT("In Draft"),
    SUBMITTED("Submitted"),
    NOT_PLANNED("Not Planned"),
    UNDER_APPROVAL("Under Approval"),
    APPROVED("Approved");
    private final String budgetStatusName;

    public static boolean showOnApprovalDashboard(MonthlyBudgetStatus monthlyBudgetStatus) {
        return SUBMITTED.equals(monthlyBudgetStatus) || APPROVED.equals(monthlyBudgetStatus);
    }

    public static boolean isEditable(MonthlyBudgetStatus monthlyBudgetStatus) {
        return monthlyBudgetStatus == DRAFT || monthlyBudgetStatus == APPROVED ;
    }

    private static final List<EnumListing<MonthlyBudgetStatus>> enumListing = new ArrayList<>();

    static {
        for (MonthlyBudgetStatus curStatus : MonthlyBudgetStatus.values()) {
            enumListing.add(EnumListing.of(curStatus, curStatus.getBudgetStatusName()));
        }
    }

    public static List<EnumListing<MonthlyBudgetStatus>> getEnumListing() {
        return enumListing;
    }
    
}
