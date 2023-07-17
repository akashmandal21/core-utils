package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.SpecialEventType;
import com.stanzaliving.food.v2.common.dto.ResidenceRDto;

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
public class SpecialEventDetailDto extends AbstractDto {

	private static final long serialVersionUID = 6900097045470592571L;

	private String eventDescription;

	private SpecialEventType specialEventType;

	private String eventTypeInitial;

	private Integer totalResidences;
	
	private Integer applicableResidences;
	
	private List<ResidenceRDto> residenceRDto;
   
}
