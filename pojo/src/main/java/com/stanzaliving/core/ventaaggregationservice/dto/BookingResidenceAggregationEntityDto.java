package com.stanzaliving.core.ventaaggregationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
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

    private Long totalBeds;

    private Long totalRooms;

    private Long totalApartments;

    private List<String> residenceUuids;


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

}


