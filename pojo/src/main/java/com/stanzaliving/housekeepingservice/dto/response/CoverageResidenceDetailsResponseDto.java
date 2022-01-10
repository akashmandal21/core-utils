package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 07-Jan-22
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CoverageResidenceDetailsResponseDto {
    private String residenceId;
    private String residenceName;
    private List<CoverageRoomWiseStatusResponseDto> roomWise;
}
