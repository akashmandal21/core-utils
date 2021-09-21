package com.stanzaliving.housekeepingservice.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.generictaskservice.dto.GenericTaskDto;
import lombok.*;

import java.util.List;

/**
 * @author Vikas S T
 * @date 14-Sep-21
 **/

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CheckingSlotRequestDto {
    private String slotUuid;
    private List<GenericTaskDto> tasks;
}
