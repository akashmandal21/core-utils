package com.stanzaliving.housekeepingservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vikas S T
 * @date 16-Nov-21
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ResidenceClientRoomDetailsResponseDto {
    private String roomUuid;
    private String roomNumber;
    private double availableBeds;
    private double deadBeds;
    private double totalBeds;
    private double blockedBeds;
}
