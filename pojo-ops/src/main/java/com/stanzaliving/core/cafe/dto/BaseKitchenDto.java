package com.stanzaliving.core.cafe.dto;

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
public class BaseKitchenDto {
	private String baseKitchenName;
	
	private String baseKitchenId;
	
	private boolean primaryKitchen;
}
