package com.stanzaliving.boq_service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GroundRequest {
    IN_DRAFT("In Draft"),
    SUBMITTED("Submitted"),
    DELETED("Deleted");

    private final String label;
}
