package com.stanzaliving.housekeepingservice.dto;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

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

    @NotBlank(message = "Area room number is Mandatory.")
    private String areaRoomNumber;

    @NotBlank(message = "Area room uuid is Mandatory.")
    private String areaRoomUuid;

    @Min(value = 1, message = "Room size must be greater zero")
    private int roomSizeInSqFt;

    private boolean attachedWashroom;

    private int bathRoomSizeInSqFt;

    private boolean balcony;

    private int balconySizeInSqFt;

    @Min(value = 1, message = "Cleaning time min must be greater than zero")
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

    @NotBlank(message = "Residence uuid is Mandatory.")
    private String residenceUuid;

    private String categoryUuid;

    @NotBlank(message = "Area tag uuid is Mandatory.")
    private String areaTagUuid;

    @NotBlank(message = "Uuid is Mandatory.")
    private String uuid;

    private AreaTagsDto areaTag;

    private AreaCategoryDto areaCategory;

    private boolean roomUpdated;

    private int availableBeds;

    private int deadBeds;

    private int totalBeds;

    private int blockedBeds;

    private double occupiedBeds;
}