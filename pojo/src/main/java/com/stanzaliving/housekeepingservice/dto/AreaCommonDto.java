package com.stanzaliving.housekeepingservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

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

    private String residenceName;

    private String categoryId;

    private String categoryName;

    private String areaCommonUuid;

    private String areaTagUuid;

    private String areaTagName;
}