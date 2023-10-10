package com.stanzaliving.core.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingAmountRealisationResponseDto {

    private boolean showWaiveOffRealisation = Boolean.FALSE;

    private double realisationAmount;

    private double maximumWaiveOffPercentage;

    private int bookingAutoForfeitureDurationInDays;

    private Date bookingAutoForfeitureDate;
}