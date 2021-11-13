package com.stanzaliving.housekeepingservice.dto;

import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * @author anudeep.alevoor
 *
 *
 */


@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AreaRoomDto {

    private String areaRoomNumber;

    private String areaRoomUuid;

    private int roomSizeInSqFt;

    private boolean attachedWashroom;

    private int bathRoomSizeInSqFt;

    private boolean balcony;

    private int balconySizeInSqFt;

    private int cleaningTimeInMin;

    private String mealReceivingUuid;

    private int garbageCollectionTimeInMin;

    private String utensilsRinsingUuid;

    private String mealServingUuid;

    private String plateCollectionUuid;

    private int deepCleaningTimeInMin;

    private int sanitizationTimeInMin;

    private String createdBy;

    private Date createdAt;

    private String residenceUuid;

    private String residenceName;

    private String categoryUuid;

    private String categoryName;

    private String areaTagUuid;

    private String areaTagName;

    private String uuid;
}