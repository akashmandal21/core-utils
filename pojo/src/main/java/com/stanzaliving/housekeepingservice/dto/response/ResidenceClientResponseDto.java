package com.stanzaliving.housekeepingservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * @author Vikas S T
 * @date 16-Nov-21
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ResidenceClientResponseDto {
    private String residenceUuid;
    private String residenceName;
    private ArrayList<ResidenceClientRoomDetailsResponseDto> roomDetails;

}
