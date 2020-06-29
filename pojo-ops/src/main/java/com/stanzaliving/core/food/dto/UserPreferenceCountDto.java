package com.stanzaliving.core.food.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class UserPreferenceCountDto {
	
	@Builder.Default
	private Integer totalVeg=0;
	
	@Builder.Default
	private Integer totalNonveg=0;
	
	private List<ItemTypeUserPreferenceCountDto> preferenceCountDtos;

}
