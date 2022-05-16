package com.stanzaliving.partner.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PartnerInvoiceStatus {

    IN_DRAFT("In Draft", "#E6E9EA","#7A7D7E"),
    PAID("Paid", "#FFEAB6","#FFB701"),
    SUBMITTED("Submitted", "#FFEAB6","#FFB701"),
    REJECTED("Rejected", "#EDFFF5","#60C3AD");

    private String statusText;

    private String bgColor;

    private String statusColor;
}
