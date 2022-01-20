package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 20-Jan-22
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CoverageRoomDetailsWithDayResponseDto {
    private String day;
    private boolean isPresent;
}
