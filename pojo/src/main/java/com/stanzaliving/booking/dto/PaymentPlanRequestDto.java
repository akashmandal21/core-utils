package com.stanzaliving.booking.dto;

import com.stanzaliving.booking.enums.PaymentFrequency;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPlanRequestDto {
    private String referenceId;
    private String referenceType;
    private String studentId;
    private PaymentFrequency instalment;
    private Boolean isWpBooking;
    private Date contractStartDate;
    private Date contractEndDate;
    private double rentalPrice;
    private PriceRequestDto servicePrice;
    private PriceRequestDto foodServicePrice;
    private int advanceRentalMonth;
    private DiscountRequestDto discount;
    private float contractMonths;
    @Builder.Default
    private Boolean saveInvoices = true;
    @Builder.Default
    private Boolean isB2bFlow = true;
}