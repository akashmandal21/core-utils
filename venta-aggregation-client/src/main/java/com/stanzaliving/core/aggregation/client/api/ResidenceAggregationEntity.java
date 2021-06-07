package com.stanzaliving.core.aggregation.client.api;

import lombok.*;

import javax.persistence.Transient;
import java.util.HashMap;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResidenceAggregationEntity{

    private String residenceUuid;

    private String code;

    private String city;

    private String stanzaCity;

    private String society;

    private String stanzaCluster;

    private String microMarket;

    private String microMarketId;

    private Integer cityId;

    private String entity;

    private String type;

    private String gender;

    private Boolean serviceMix;

    private Boolean productMix;

    private Double blendedPrice;

    private Integer totalRoom;

    private Integer totalBed;

    private String residenceStatus;

    private String stanzaClusterUuid;

    private String stanzaCityUuid;

    @Transient
    private HashMap<String, Long> totalRoomInfo;

    @Transient
    private HashMap<String, Long> totalBedInfo;

    @Transient
    private HashMap<String, Object> blendedPriceInfo;

    @Transient
    private String leftBorderColor;

    @Transient
    private String statusTextColor;

    @Transient
    private String statusBackgroundColor;
}

