package com.stanzaliving.core.food.dto;

import javax.validation.constraints.NotBlank;

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
public class VasItemShortageDto {
	
	private String basePreference;
	
	@NotBlank(message = "item id can not be blank")
	private String itemId;
	
	@NotBlank(message = "residence food menu id can not be blank")
	private String residenceFoodMenuId;
	
	private Integer shortage;

}
