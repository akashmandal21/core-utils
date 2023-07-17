package com.stanzaliving.core.generic.validation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum CompanyType {
    INDIVIDUAL("Sole Proprietorship"),
    PARTNERSHIP("Partnership Firm"),
    LTD_LIABILITY_PARTNERSHIP("Limited Liability Partnership"),
    PVT_LTD("Private Limited Company"),
    PUB_LTD("Public Limited Company"),
    INDUSTRY_BODY("Industry Body"),
    RWA("Residential Welfare Association"),
    AOP("Association Of Person");

    private String companyTypeText;

    private static Map<String,CompanyType> companyTypeMap = new HashMap<>();
    static {
        companyTypeMap.put("Sole Proprietorship",INDIVIDUAL);
        companyTypeMap.put("Partnership Firm",PARTNERSHIP);
        companyTypeMap.put("Limited Liability Partnership",LTD_LIABILITY_PARTNERSHIP);
        companyTypeMap.put("Private Limited Company",PVT_LTD);
        companyTypeMap.put("Public Limited Company",PUB_LTD);
        companyTypeMap.put("RWA",RWA);
        companyTypeMap.put("Association Of Person", AOP);
    }

    public static CompanyType getCompanyType(String name){
        return companyTypeMap.get(name);
    }
}
