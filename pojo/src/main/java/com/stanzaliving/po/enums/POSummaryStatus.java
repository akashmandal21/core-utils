package com.stanzaliving.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum POSummaryStatus {

    NOT_STARTED("Not Available","color"),
    PO_DETAILS_PENDING("PO Details Pending","color"),
    PO_PARTIALLY_APPROVED("PO Partially Approved","color"),
    PO_PARTIALLY_REJECTED("PO Partially Rejected","color"),
    PO_APPROVED("PO Approved","color"),
    PO_REJECTED("PO Rejected","color"),
    PO_APPROVAL_PENDING("Pending PO Approval","color");


    private String statusText;
    private String color;

}
