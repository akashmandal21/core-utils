package com.stanzaliving.core.ventaaggregationservice.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.HashMap;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResidenceAggregationEntityDto {


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
        private HashMap<String, String> totalRoomInfo;

        @Transient
        List<ResidenceBedCountDto> totalBedInfo;

        @Transient
        private HashMap<String, String> blendedPriceInfo;

        @Transient
        private String leftBorderColor;

        @Transient
        private String statusTextColor;

        @Transient
        private String statusBackgroundColor;
    }


