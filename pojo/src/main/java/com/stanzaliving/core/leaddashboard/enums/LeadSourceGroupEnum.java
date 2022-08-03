package com.stanzaliving.core.leaddashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum LeadSourceGroupEnum {

    AFFILIATE("Affiliate"),
    BROKER_EBI("Broker/EBI"),
    DATABASE("Database"),
    DIGITAL("Digital"),
    DIGITAL_ORGANIC("Digital Organic"),
    DIGITAL_PAID("Digital Paid"),
    OTHERS("Others"),
    REFERRAL("Referral"),
    RESIDENT_APP("Resident App"),
    SIGMA_APP("Sigma App");

    private String name;
}
