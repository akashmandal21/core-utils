package com.stanzaliving.housekeepingservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.generictaskservice.dto.response.GenericTaskResponseDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 23-Sep-21
 **/

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HkTaskStatusResponseDto {
    private String status;
    private int totalCount;
    private List<GenericTaskResponseDto> tasks;
    private List<HkBeatPlanTaskResponseDto> task;
}
