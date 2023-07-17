package com.stanzaliving.core.security.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomMigrationDTO {

    @JsonSetter(value = "ROOM_NUMBER")
    private String roomNumber;

    @JsonSetter(value = "FLOOR")
    private String floor;

    @JsonSetter(value = "ROOM_ID")
    private String roomId;
}
