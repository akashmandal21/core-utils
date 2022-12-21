package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommercialCardStatus {
    DRAFT("Draft",4),
    PENDING("Pending Approval",6),
    ACTIVE ("Active",1),
    USED("Used",7),
    EXPIRED("Expired",5),
    DISABLED ("Disabled",3),
    APPROVED("Approved",2);

   private String status;

   int order;

}
