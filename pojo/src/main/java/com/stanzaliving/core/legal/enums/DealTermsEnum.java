package com.stanzaliving.core.legal.enums;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import com.stanzaliving.core.estate.constants.AttributeNames;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DealTermsEnum {

    //	TODO- create generic indian currency separator in core

    START_YEAR("Start Year","%s",Arrays.asList(AttributeNames.BUILDING_TYPE)),
    END_YEAR("End Year","%s",Arrays.asList(AttributeNames.BUILDING_TYPE)),
    BUILT_TYPE("Building Type","%s",Arrays.asList(AttributeNames.BUILDING_TYPE)),
    LEASE_TERM("Lease term", "%s years", Arrays.asList(AttributeNames.FIN_LEASE_DURATION_IN_YEARS)),
    SECURITY_DEPOSIT("Security Deposit", "%s months", Arrays.asList(AttributeNames.FIN_SECURITY_DEPOSITE_MONTHS_OF_RENT)),
    ADVANCE_RENT_MONTH("Advance rent (months)","%s months", Arrays.asList(AttributeNames.FIN_ADVANCE_RENT_MONTH_COUNT)),
    LESSEE_LOCK_IN("Lessee lock-in", "%s months", Arrays.asList(AttributeNames.FIN_LEASE_LOCKIN_PERIOD_IN_YEARS)),
    LANDLORD_HANDOVER_DATE("Landlord handover date", "%s", Arrays.asList(AttributeNames.FIN_BUILDING_HANDOVER_DATE)),
    RENT_START_DATE("Rent start date", "%s", Arrays.asList(AttributeNames.FIN_RENT_START_DATE)),
    RENT_PER_MONTH("Rent per month", "₹ %s", Arrays.asList(AttributeNames.FIN_MONTHLY_RENT)),
    RENT_ESCALATION("Rent escalation", "%s%% every %s year", Arrays.asList(AttributeNames.FIN_RENTAL_INFLATION_PERCENT, AttributeNames.FIN_RENTAL_INFLATION_IN_YEARS)),
    TOKEN_DEPOSIT("Token Deposit", "₹ %s", Arrays.asList(AttributeNames.FIN_TOKEN_DEPOSIT_IN_RUPEES)),
    PAYMENT_FREQUENCY("Payment frequency", "%s", Arrays.asList(AttributeNames.FIN_PAYMENT_OPTION)),
    RENT_FREE_PERIOD("Rent free period", "%s days", Arrays.asList(AttributeNames.FIN_RENT_FREE_PERIOD_IN_MONTHS)),
    STAMP_DUTY_BORNE_BY("Stamp duty borne by", "%s", Arrays.asList(AttributeNames.STAMP_DUTY_BORNE_BY));



	
    String dealTerm;

    String valueFormat;

    List<String> attributeNames;

    public static TreeSet<String> estateAttributeTreeSet = new TreeSet<>();

    static {
        for (DealTermsEnum dealTermsEnum : DealTermsEnum.values()) {
            estateAttributeTreeSet.addAll(dealTermsEnum.getAttributeNames());
        }
    }
}
