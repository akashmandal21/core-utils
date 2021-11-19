package com.stanzaliving.housekeepingservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AreaCommonDto{

    private String areaName;

    private Double sizeInSqFt;

    private Integer cleaningTimeInMinutes;

    private Integer sanitizationTimeInMinutes;

    private String areaRoomId;

    private String residenceId;

    private String categoryId;

    private String areaCommonUuid;

    private String areaTagUuid;
}