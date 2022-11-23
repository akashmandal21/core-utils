package com.stanzaliving.core.ventaaggregationservice.dto;

import com.stanzaliving.booking.enums.ResidenceAgreementType;
import com.stanzaliving.core.enums.ResidenceType;
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
@Builder
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

    private String company;

    private String stanzaCityUuid;

    private HashMap<String, String> totalRoomInfo;

    private List<ResidenceBedCountDto> totalBedInfo;

    private List<BlendedPriceOccupancyCountDto> blendedPriceInfo;

    private String leftBorderColor;

    private String statusTextColor;

    private String statusBackgroundColor;

    private String bhkType;

    private ResidenceType residenceType;

    private boolean testHouse;

    @Builder.Default
    private Double residenceFixedRent=0.0;

    @Builder.Default
    private Double residenceManagementFeePercentage=0.0;

    @Builder.Default
    private ResidenceAgreementType residenceAgreementType = ResidenceAgreementType.LEASE_DEED;

}


