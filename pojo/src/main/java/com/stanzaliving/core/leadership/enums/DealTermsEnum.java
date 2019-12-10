package com.stanzaliving.core.leadership.enums;

import java.util.Arrays;
import java.util.List;

import com.stanzaliving.core.estate.constants.AttributeNames;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DealTermsEnum {
	
	/*
	 * 	public static final String FIN_MONTHLY_RENT = "monthlyRent";
	public static final String FIN_LEASE_DURATION_IN_YEARS = "leaseDurationInYears";
	public static final String FIN_SECURITY_DEPOSITE_MONTHS_OF_RENT = "securityDepositMonthsOfRent";
	public static final String FIN_RENTAL_INFLATION_IN_YEARS = "rentalInflationInYears";
	public static final String FIN_RENTAL_INFLATION_PERCENT = "rentalInflationPercent";
	public static final String FIN_ADVANCE_RENT_MONTH_COUNT = "advanceRentMonthCount";
	public static final String FIN_AMORTIZED_PERIOD_IN_MONTHS = "amortizedPeriodInMonths";
	public static final String FIN_LEASE_LOCKIN_PERIOD_IN_YEARS = "leaseLockInPeriodInYears";
	public static final String FIN_TOKEN_DEPOSIT_IN_RUPEES = "tokenDepositInRupees";
	public static final String FIN_RENT_FREE_PERIOD_IN_MONTHS = "rentFreePeriodInMonths";
	public static final String FIN_FINANCIAL_COMMENTS = "financialCommets";
	public static final String FIN_BUILDING_HANDOVER_DATE = "buildingHandoverDate";
	public static final String FIN_RENT_START_DATE = "rentStartDate";
	public static final String FIN_PAYMENT_OPTION = "paymentOption";
*/

	RENTANDPAYMENTFREQUENCY("Rents and Payment Frequency", "%s paid %s", Arrays.asList(AttributeNames.FIN_MONTHLY_RENT, AttributeNames.FIN_PAYMENT_OPTION)),
	RENTESCALATION("Rent Escalation","%s% after every %s years",Arrays.asList(AttributeNames.FIN_RENTAL_INFLATION_PERCENT,AttributeNames.FIN_RENTAL_INFLATION_IN_YEARS)),
	INTERESTFREEREFUNDABLEDEPOSIT("Interest Free Refundable Deposit","%s Of Rent Equivalent",Arrays.asList(AttributeNames.FIN_SECURITY_DEPOSITE_MONTHS_OF_RENT));
	
	String dealTerm;

	String value;

	List<String> attributeNames;
}
