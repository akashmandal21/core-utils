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
public class OrderQuantitiesDto {
	
	@Builder.Default
	private Integer vegPax=0;
	
	@Builder.Default
	private Integer nonVegPax=0;
	
	private Integer stanzaStaffVegPax;
	
	private Integer stanzaStaffNonVegPax;
	
	private Integer nonStanzaStaffVegPax;
	
	private Integer nonStanzaStaffNonVegPax;
	
	private String micromarket;
	

}
