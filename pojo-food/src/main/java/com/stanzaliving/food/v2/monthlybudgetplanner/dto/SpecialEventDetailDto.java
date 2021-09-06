package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.SpecialEventType;

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
	
	private LocalDate date;
	
	private String eventDescription;

	private SpecialEventType specialEventType;

	private Integer totalResidences;
	
	private Integer applicableResidences;
	
	private List<String> residenceNames;    

}
