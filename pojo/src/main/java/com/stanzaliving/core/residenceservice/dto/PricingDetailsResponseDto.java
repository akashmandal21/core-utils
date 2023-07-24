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
    // without city buffer
    private double gst;
    private double underWritten;
    private double cityBuffer;
    // with city buffer
    private double total;
    private double totalIncGst;
    private double underWrittenIncGst;
    private boolean isRoomConverted;
    private double priceImpact;
}
