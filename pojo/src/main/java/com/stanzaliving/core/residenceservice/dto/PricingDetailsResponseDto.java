package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PricingDetailsResponseDto {
    private String serviceMixUuid;
    private Date fromDate;
    private Date toDate;
    private int occupancy;
    private double basePrice;
    private double onmServiceFee;
    private double packagedServiceFee;
    private double foodService;
    private double gst;
    private double underWritten;
    private double cityBuffer;
    private double total;
    private double underWrittenIncGst;
    private boolean isRoomConverted;
    private double priceImpact;
}
