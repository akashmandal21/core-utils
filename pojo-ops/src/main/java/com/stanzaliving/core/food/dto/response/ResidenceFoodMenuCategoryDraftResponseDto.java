package com.stanzaliving.core.food.dto.response;

import java.time.LocalDate;

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
public class ResidenceFoodMenuCategoryDraftResponseDto {
	
	private boolean draftAvailable;
	
	private String menuCategory;
	
	private String menuCategoryName;
	
	private LocalDate startDate;
	
	private boolean serviceMixUpdate;

}
