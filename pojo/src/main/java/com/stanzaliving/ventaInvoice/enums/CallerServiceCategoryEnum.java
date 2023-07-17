package com.stanzaliving.ventaInvoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CallerServiceCategoryEnum {
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
    BOOKING_CANCELLATION("Booking Cancellation");
    private final String values;

}
