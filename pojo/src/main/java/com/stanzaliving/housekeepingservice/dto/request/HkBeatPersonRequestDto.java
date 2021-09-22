package com.stanzaliving.housekeepingservice.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.generictaskservice.dto.GenericTaskDto;
import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * @author Keshav Singh
 * @date 9/2/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HkBeatPersonRequestDto {
	private String personName;
	private Date day;
	private String beatPlanUuid;
	private List<GenericTaskDto> tasks;
	private String shiftUuid;
	private String slotUuid;
	private List<CheckingShiftRequestDto> shifts;
}
