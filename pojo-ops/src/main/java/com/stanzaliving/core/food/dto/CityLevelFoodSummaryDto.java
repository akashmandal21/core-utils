package com.stanzaliving.core.food.dto;

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
public class CityLevelFoodSummaryDto {

	private String cityName;
	private String cityId;

	private List<FoodMenuApprovalSummaryDto> approvalSummaryDtos;

	private String groupId;
	private String groupName;
	private Map<String,Integer> statusWiseCount;
	//city->mm->category
	private Map<String,CityLevelFoodSummaryDto> childData;

}
