package com.stanzaliving.taskmaster.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Builder
@Setter
@Getter
@ToString
@AllArgsConstructor
public class TaskListingCardDto {

	private String name;
	
	private String entityName;
	
	private String cityName;
	
	private String microMarketName;
	
	private String categoryName;
	
	private String categoryColor;
	
	private String dateString;
	
	private double completionPercent;
	
}
