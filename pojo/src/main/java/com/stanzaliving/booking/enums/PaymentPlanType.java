package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PaymentPlanType {

	RENTAL("Rental"),
	SERVICE("Service"),
	FOOD_SERVICE("Food Service"),
	SECURITY_DEPOSIT("Security Deposit"),
	ONBOARDING_CHARGE("OnBoarding Charge"),
	MAINTENANCE_FEE("Maintenance Fee"),
	ANNUAL_MAINTENANCE_FEE("Annual Maintenance Fee"),
	VAS("VAS"),
	BOOKING("Booking"),
	ADVANCE_RENTAL("Advance Rental"),
	ADVANCE_MAINTENANCE_FEE("Advance Maintenance Fee"),
	ADVANCE_DISCOUNT("Advance Discount"),
	INSTALLMENT("Instalment"),
	DISCOUNT("Discount Adjusted"),
	DAMAGE("Damage"),
	CANCELLATION_CHARGE("Cancellation Charge"),

	PENALTY_WAIVE_OFF("Penalty Waive Off"),
	CREDIT_NOTE_FOR_DISCOUNT("Credit Note For Discount"),
	OTHERS_OPERATIONS("Other Operations"),
	REMITTANCE_FOR_DAMAGE_CAUSED("Remittance For Damage Caused"),
	REMITTANCE_FOR_LOSS_CAUSED("Remittance Fot Loss Caused"),
	LAUNDRY_SERVICE_OPT_OUT("Laundry Service Opt Out"),
	TRANSPORTATION_SERVICE_OPT_OUT("Transportation Service Opt Out"),
	MEAL_OPT_OUT("Meal Opt Out"),
	CREDIT_NOTE_FOR_REVENUE_REVERSAL("Credit Note For Revenue Reversal"),
	COMPENSATION_AGAINST_DAMAGE("Compensation against Damage"),
	OTHERS_PROJECTS("Other Projetcs"),
	DISCOUNT_ON_EXTENSION("Discount on Extension"),
	MISSED_DISCOUNT_AT_THE_TIME_OF_CLOSURE("Missed Discount at the time of Closure"),
	EXTRA_INVOICE_GENERATED("EXtra Invoice Generated"),
	OTHERS_SALES("Other Sales"),
	FORFEITURES("Forfeitures"),
	OTHERS_MARKETING("Other Marketing"),
	MISSING_REFERRALS("Missing Referrals"),
	INVOICE_CANCELLATION_AGAINST_INVOICE("Invoice Cancellation Against Invoice"),
	RESIDENT_AWARD_PRIZE("Resident Award Prize"),
	ROOM_CHANGE("Room Change"),
	SECURITY_CARRY_FORWARD("Security Carry Forward"),
	CONTRACT_TERMINATION("Contract Termination"),
	MODIFY_CONTRACT("Modify Contract"),
	DISCOUNT_READJUSTMENT("Discount Readjustment"),
	BOOKING_FORFEITURE("Booking Forfeiture"),
	BOOKING_CANCELLATION("Booking Cancellation"),
	CREDIT_NOTE_FOR_MODIFY_CONTRACT("Credit Note For Modify Contract"),
	ADDITIONAL_INVOICE("Additional Invoice - License Fee"),
	ADDITIONAL_INVOICE_SERVICE_FEE("Additional Invoice - Service Fee"),
	ADDITIONAL_SECURITY_DEPOSIT("Additional Security Deposit"),
	ADDITIONAL_INVOICE_ROOM_CHANGE("Additional Invoice - Room Change"),
	ACCOMMODATION_CHARGES("Accommodation Charges"),
	GST_WAIVE_OFF("Gst Waive Off"),
	TRESPASSER_ACCOMMODATION_CHARGES("Accommodation Charges for Trespassing"),
	CITY_HEAD_BUFFER("City Head Buffer"),
	UPSELL("Upsell"),
	BUMP_UP_PRICE("Bump Up Price"),
	NO_SHOW_PENALTY("No Show Penalty"),
    ONM_RENTAL("ONM Rental"),
	ONM_SERVICE("ONM Service"),

	ONM_MAINTENANCE_FEE("ONM Maintenance Fee"),

	ONM_ONBOARDING_CHARGE("ONM OnBoarding Charge"),
	MANAGEMENT_FEE("Management Fee"),
	PROCESSING_FEE("Processing Fee"),
	SUBSCRIPTION_PLAN("Subscription Plan"),
	EXIT_PROCESSING_FEE("Exit Processing Fee"),
	BREAKAGE_FEE("Breakage Fee");

	private String name;
	
	 @Override
	 public String toString() {
	   return name;
	 }
}
