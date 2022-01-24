package com.stanzaliving.productmix.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TemplateStatus {
    IN_DRAFT("In Draft", "#E6E9EA", "#7A7D7E"),
    PENDING_APPROVAL("Pending Approval", "#FFEAB6", "#FFB701"),
    APPROVED("Approved", "#EDFFF5", "#60C3AD"),
    REJECTED("Rejected", "#FFE5E1", "#FF5238"),
    ACTIVE("Active", "#EDFFF5", "#60C3AD"),
    INACTIVE("Inactive", "#FFE5E1", "#FF5238");

    private final String label;
    private final String bgColor;
    private final String textColor;
}
