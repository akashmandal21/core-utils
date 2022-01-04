package com.stanzaliving.boq_service.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ItemStatus {
    IN_DRAFT("In Draft"),
    PENDING_APPROVAL("Pending Approval"),
    PENDING_MERGER_TO_BOQ("Pending Merger to BOQ"),
    MERGED_TO_BOQ("Merged to BOQ"),
    REJECTED("Rejected");

    private final String label;
}
