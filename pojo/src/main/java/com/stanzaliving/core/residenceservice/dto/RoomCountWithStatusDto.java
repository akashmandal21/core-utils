package com.stanzaliving.core.residenceservice.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomCountWithStatusDto {
    private Integer totalRoom;
    private Long available;
    private Long blocked;
    private Long dead;

}

