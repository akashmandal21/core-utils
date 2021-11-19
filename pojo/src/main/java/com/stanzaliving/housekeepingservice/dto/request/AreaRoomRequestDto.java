package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;

import java.time.LocalTime;

/**
 * @author Vikas S T
 * @date 19-Nov-21
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AreaRoomRequestDto {

    private String areaRoomNumber;

    private String areaRoomUuid;

    private int roomSizeInSqFt;

    private boolean attachedWashroom;

    private int bathRoomSizeInSqFt;

    private String residenceUuid;

    private String categoryUuid;

    private String areaTagUuid;

    private boolean balcony;

    private int balconySizeInSqFt;

    private LocalTime cleaningTimeInMin;
}
