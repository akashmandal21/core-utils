package com.stanzaliving.core.bookingservice.dto.request;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResidenceCardDto {

    Integer totalOccupiedRooms;
    Float totalOccupiedBeds;
}