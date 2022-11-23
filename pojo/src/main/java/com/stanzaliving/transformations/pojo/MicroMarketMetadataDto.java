package com.stanzaliving.transformations.pojo;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MicroMarketMetadataDto {

    private long cityId;
    private long microMarketId;
    private long allowedVisitDays;

    private String uuid;
    private String cityUuid;
    private String microMarketName;
    private String microMarketCode;

    private double latitude;
    private double longitude;

    private Date createdAt;

}