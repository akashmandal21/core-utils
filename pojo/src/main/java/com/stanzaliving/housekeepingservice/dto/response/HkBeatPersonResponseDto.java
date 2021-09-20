package com.stanzaliving.housekeepingservice.dto.response;

import com.stanzaliving.generictaskservice.dto.response.ShiftDetailsResponse;
import lombok.*;

import java.util.List;

/**
 * @author Vikas S T
 * @date 03-Sep-21
 **/

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkBeatPersonResponseDto {
    private String personName;
    private String uuid;
    private List<ShiftDetailsResponse> shifts;

}
