package com.stanzaliving.core.leadership.enums;

import java.util.Arrays;
import java.util.List;

import com.stanzaliving.core.estate.constants.AttributeNames;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DealTermsEnum {
	

	RENTANDPAYMENTFREQUENCY("Rents and Payment Frequency", "%s paid %s", Arrays.asList(AttributeNames.FIN_MONTHLY_RENT, AttributeNames.FIN_PAYMENT_OPTION)),
	RENTESCALATION("Rent Escalation","%s percent after every %s years",Arrays.asList(AttributeNames.FIN_RENTAL_INFLATION_PERCENT,AttributeNames.FIN_RENTAL_INFLATION_IN_YEARS)),
	INTERESTFREEREFUNDABLEDEPOSIT("Interest Free Refundable Deposit","%s months of rent equivalent",Arrays.asList(AttributeNames.FIN_SECURITY_DEPOSITE_MONTHS_OF_RENT)),
	ADVANCERENT("Advance Rent","%s months",Arrays.asList(AttributeNames.FIN_ADVANCE_RENT_MONTH_COUNT)),
	ADJUSTMENTS("Adjustments","Amortized/adjusted in first %s months",Arrays.asList(AttributeNames.FIN_AMORTIZED_PERIOD_IN_MONTHS)),
	LEASETERM("Lease Term","%s years",Arrays.asList(AttributeNames.FIN_LEASE_DURATION_IN_YEARS)),
	LEASEDPREMISESHANDOVERDATE("Leased Premisis Handover Date","%s",Arrays.asList(AttributeNames.FIN_BUILDING_HANDOVER_DATE)),
	RENTFREEFITOUTPERIOD("Rent-Free Fit Out Period","%s months",Arrays.asList(AttributeNames.FIN_RENT_FREE_PERIOD_IN_MONTHS)),
	LESSELOCKINPERIOD("Lesse Lock-in Period","%s months",Arrays.asList(AttributeNames.FIN_LEASE_LOCKIN_PERIOD_IN_YEARS)),
	NOTICEPERIODFOREXIT("Notice Period For Exit by Lessee","%s months",Arrays.asList(AttributeNames.FIN_LEASE_LOCKIN_PERIOD_IN_YEARS)),
	TOKENDEPOSIT("Token Deposit","Rs. %s",Arrays.asList(AttributeNames.FIN_TOKEN_DEPOSIT_IN_RUPEES));
	
	String dealTerm;

	String value;

	List<String> attributeNames;
}
