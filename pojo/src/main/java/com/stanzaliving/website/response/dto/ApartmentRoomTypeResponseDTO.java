package com.stanzaliving.website.response.dto;

import com.stanzaliving.website.enums.ApartmentRoomType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ApartmentRoomTypeResponseDTO {

	private String name;

	private ApartmentRoomType roomType;
	
	private String imgurl;
	
	private Integer startingPrice;
	
	private Boolean soldOut;
	
	private String pricingPlan;
	
	private Integer quantity;
	
	private Integer available;
}
