package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * @author Vikas S T
 * @date 20-Nov-21
 **/

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAreaRoomRequestDto {
    @NotBlank(message = "Area room number is Mandatory.")
    private String areaRoomNumber;

    @NotBlank(message = "Area room uuid is Mandatory.")
    private String areaRoomUuid;

    @Min(value = 1, message = "Room size must be greater Zero")
    private int roomSizeInSqFt;

    @Min(value = 1, message = "Cleaning time min must be greater than zero")
    private int cleaningTimeInMin;

    @NotBlank(message = "Residence uuid is Mandatory.")
    private String residenceUuid;

    @NotBlank(message = "Area tag uuid is Mandatory.")
    private String areaTagUuid;

    @NotBlank(message = "Uuid is Mandatory.")
    private String uuid;

    private boolean roomUpdated;

    private boolean attachedWashroom;

    @Min(value = 0, message = "Bath room size cannot be blank required minimum zero value")
    private int bathRoomSizeInSqFt;

    private boolean balcony;

    @Min(value = 0, message = "Balcony size cannot be blank required minimum zero value")
    private int balconySizeInSqFt;
}
