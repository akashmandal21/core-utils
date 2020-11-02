package com.stanzaliving.core.cafe.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class CogsPriceDto {
	
	@NotBlank(message = "Kitchen Selection is mandatory")
	private String kitchenId;
	
	private String kitchenName;
		
	private Double costPrice;
	
	private boolean primaryKitchen;

}
