package com.stanzaliving.core.food.dto.response;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

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
public class DayWiseResponseDto implements Serializable {
	private static final long serialVersionUID = -769016461417491230L;
	private Map<LocalDate, List<MealSummaryResponseDto>> dayWiseMealPreferenceSummary;

}
