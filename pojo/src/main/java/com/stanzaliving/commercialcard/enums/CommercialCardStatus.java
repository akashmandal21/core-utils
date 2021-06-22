package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommercialCardStatus {
    DRAFT("Draft"),
    PENDING("Pending"),
    ACTIVE ("Active"),
    USED("Used"),
    EXPIRED("Expired"),
    DISABLED ("Disabled"),
    APPROVED("Approved");

   private String status;

}
