package com.stanzaliving.housekeepingservice.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.housekeepingservice.enums.HkBeatPlanStatus;
import lombok.*;

import java.time.LocalDate;
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
public class HkBeatPlanRequestDto {
	private String planningTemplateId;
	private HkBeatPlanStatus planningStatus;
	private LocalDate startDate;
	private LocalDate endDate;
	private boolean isDraft;
	private List<HkBeatPersonRequestDto> hkPersons;
}
