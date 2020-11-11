package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PackingStatus {
    PACKED("Packed"),
    PENDING_PACK("Pending");
    private final String status;
}
