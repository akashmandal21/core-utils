package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.wanda.DemographicsOverallResponseDto;
import com.stanzaliving.wanda.DemographicsResponseDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
