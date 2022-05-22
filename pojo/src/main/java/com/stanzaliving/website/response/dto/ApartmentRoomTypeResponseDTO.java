package com.stanzaliving.website.response.dto;

import java.util.List;

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

	private String roomId;

	private Integer apartmentId;

	private List<Integer> featureIds;

	private String name;

	private ApartmentRoomType roomType;

	private String imgurl;

	private Integer startingPrice;

	private Boolean soldOut;

	private String pricingPlan;

	private Integer quantity;

	private Integer available;

	private Integer discountPercentage;

	private Integer discountedPrice;

	private Long roomTypeId;
	
	private List<FeatureResponseDTO> features;
	
	private boolean isDeleted;
}
