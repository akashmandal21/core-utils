package com.stanzaliving.core.food.dto;

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
public class ShortageCountDto {
	
	private String item;
	
	@Builder.Default
	private Integer shortageCount=0;
	
	@Builder.Default
	private Integer nonShortageCount=0;

}
