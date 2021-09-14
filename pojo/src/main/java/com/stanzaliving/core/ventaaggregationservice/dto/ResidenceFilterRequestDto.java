package com.stanzaliving.core.ventaaggregationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResidenceFilterRequestDto {

    private Set<String> cityList;

    private Set<String> entityList;

    private Set<String> microMarketList;

    private Set<String> society;

    private Set<String> stanzaCity;

    private Set<String> stanzaCluster;

    private Set<String> residenceStatus;

    private Set<String> status;

    private Set<String> gender;

    private Boolean serviceMix;

    private Boolean productMix;

    private Integer minBeds;

    private Integer maxBeds;

    private Double minPrice;

    private Double maxPrice;

    private Integer pageSize;

    private Integer pageNumber;

    private String sortBy;

    private String sortOrder;

    private String entity;

    private String type;


}
