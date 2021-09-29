package com.stanzaliving.community.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TransactionStatus {
    SUCCESS("success"),
    PENDING("pending"),
    FAILURE("failure");

    private final String name;
}

