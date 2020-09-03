package com.stanzaliving.core.generic.validation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CompanyType {
    INDIVIDUAL("Sole proprietorship"),
    PARTNERSHIP("Partnership firm"),
    LTD_LIABILITY_PARTNERSHIP("Limited Liability Partnership"),
    PVT_LTD("Private Limited Company"),
    PUB_LTD("Public Limited Company");

    private String companyTypeText;
}
