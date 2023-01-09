package com.stanzaliving.booking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingCommercialsRequestDto implements Serializable {

    @Builder.Default
    private Double licenseFee = 0.0;

    @Builder.Default
    private Double conversionPrice = 0.0;

    @Builder.Default
    private Double cityHeadBuffer = 0.0;

    @Builder.Default
    private Double upsell = 0.0;

    @Builder.Default
    private Double bumpUpPrice = 0.0;

    @Builder.Default
    private Double priceBump = 0.0;

    @Builder.Default
    private Double pricingStrategyAmount = 0.0;

    @Valid
    private ServicePriceDto packagedServicePriceDto;

    @Valid
    private ServicePriceDto foodServicePriceDto;

    @Valid
    private ServicePriceDto vasPriceDto;

    @Valid
    private ServicePriceDto accommodationPriceDto;

    @Valid
    private ServicePriceDto upsellPriceDto;

    @Valid
    private ServicePriceDto bumpUpPriceDto;

    @Valid
    private ServicePriceDto cityBufferPriceDto;

    @Valid
    private ServicePriceDto rentalONMPriceDto;

    @Valid
    private ServicePriceDto servicesONMPriceDto;

    private double withoutEscalationPrice;
    private double escalatedPrice;
    private double monthlyFlatDiscount;

}