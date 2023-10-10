package com.stanzaliving.partner.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PartnerInvoiceStatus {

    IN_DRAFT("In Draft", "#E6E9EA","#7A7D7E"),
    PAID("Paid", "#EDFFF5","#60C3AD"),
    PARTIALLY_PAID("Partially Paid", "#EDF4FF","#5FC4F5"),
    SUBMITTED("Submitted", "#FFEAB6","#FFB701"),
    REJECTED("Rejected", "#FFE5E1","#FF5238");

    private String statusText;

    private String bgColor;

    private String statusColor;
}
