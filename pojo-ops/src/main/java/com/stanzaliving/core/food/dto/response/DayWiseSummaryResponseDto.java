package com.stanzaliving.core.food.dto.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class DayWiseSummaryResponseDto implements Serializable {
	private static final long serialVersionUID = -769016461417491230L;
	private DayWiseResponseDto dayWiseMealPreferenceGivenDto;
	private DayWiseResponseDto dayWiseSkippedPreferenceDto;
	private DayWiseResponseDto dayWiseFoodMenuAvailableDto;
}
