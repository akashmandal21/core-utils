package com.stanzaliving.housekeepingservice.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Keshav Singh
 * @date 8/19/2021
 **/
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkBeatPersonDto {

	private String personName;

	private String pseudoPersonUuid;

	private LocalDate day;

	private String beatPlanId;

	private String shiftUuid;

	private String slotUuid;

	private List<String> taskIds;


}



