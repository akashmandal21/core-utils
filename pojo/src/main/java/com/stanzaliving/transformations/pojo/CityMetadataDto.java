package com.stanzaliving.transformations.pojo;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CityMetadataDto implements Serializable {

    private long id;
    private long stateId;
    private long allowedVisitDays;

    private String uuid;
    private String cityName;
    private String zoneUuid;
    private String cityCode;
    private String stateUuid;

    private double latitude;
    private double longitude;
    
    private boolean medullaEligible;

}