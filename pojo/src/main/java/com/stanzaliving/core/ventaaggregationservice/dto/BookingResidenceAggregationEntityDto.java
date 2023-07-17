package com.stanzaliving.core.ventaaggregationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.booking.enums.ResidenceAgreementType;
import lombok.*;

import java.util.List;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include. NON_NULL)
public class BookingResidenceAggregationEntityDto {

    private String residenceUuid;

    private String code;

    private String city;

    private String microMarket;

    private String microMarketId;

    private Integer cityId;

    private String entity;

    private String gender;

    private List<String> residenceUuids;

    @Builder.Default
    private Long totalBeds=0L;
    @Builder.Default
    private Long totalRooms=0L;
    @Builder.Default
    private Long totalApartments=0L;

    @Builder.Default
    private Integer liveRooms=0;
    @Builder.Default
    private Float liveBeds=0F;
    @Builder.Default
    private Integer deadRooms=0;
    @Builder.Default
    private Float deadBeds=0F;
    @Builder.Default
    private Integer occupiedRooms=0;
    @Builder.Default
    private Float occupiedBeds=0F;
    @Builder.Default
    private Integer blockedRoom=0;
    @Builder.Default
    private Float blockedBeds=0F;

    private boolean testHouse;
    @Builder.Default
    private Double residenceFixedRent=0.0;
    @Builder.Default
    private Double residenceManagementFeePercentage=0.0;
    @Builder.Default
    private ResidenceAgreementType residenceAgreementType = ResidenceAgreementType.LEASE_DEED;
}


