package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;

/**
 * @author Vikas S T
 * @date 22-Oct-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RoomDetailsResponseDto {
    private String roomNumber;
    private int bedCount;
    private LocalTime duration;
    private int roomSizeInSqFt;
    private boolean attachedWashroom;
    private int bathRoomSizeInSqFt;
    private boolean balcony;
    private int balconySizeInSqFt;
    private int cleaningTimeInMin;
}
