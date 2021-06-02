package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    OPEN("OPEN"),
    IN_PROGRESS("IN PROGRESS"),
    WAITING_ON_CUSTOMER("WAITING ON CUSTOMER"),
    REOPEN("REOPEN"),
    CLOSED("CLOSED"),
    RESOLVED("RESOLVED"),
    PENDING("PENDING"),
    DELAYED("DELAYED"),
    COMPLETED("COMPLETED"),
    MERGED("MERGED");

    private final String value;

}
