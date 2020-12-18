package com.stanzaliving.core.leaddashboard.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum BrokerIncentiveEnum {
    REFER_PARTNER("Refers a partner"),
    KYC_COMPLETE("Completes KYC"),
    TRAINING("Views Training Material"),
    QUIZ("Completes Quiz"),
    REFER_LEAD("Refers a lead"),
    LEAD_QUALIFIED("Lead is qualified"),
    LEAD_VISIT("Lead visits"),
    LEAD_BOOKED("Lead is booked"),
    LEAD_PRE_BOOKED("Lead Pre-books"),
    SOCIAL_MEDIA_POST("Social Media Post");

    private String incentiveDescription;
}

