package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class EventsDemographicsDetailsDto implements Serializable {

	List<DemographicsResponseDto> applicableResidenceList;

	List<DemographicsResponseDto> nonApplicableResidenceList;

	DemographicsOverallResponseDto demographicsOverallResponseDto;

}
