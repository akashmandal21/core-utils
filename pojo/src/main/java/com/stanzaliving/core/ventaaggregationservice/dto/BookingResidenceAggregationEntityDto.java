package com.stanzaliving.core.ventaaggregationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

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

    Integer liveRooms;
    Float liveBeds;
    Integer deadRooms;
    Float deadBeds;
    Integer occupiedRooms;
    Float occupiedBeds;

}


