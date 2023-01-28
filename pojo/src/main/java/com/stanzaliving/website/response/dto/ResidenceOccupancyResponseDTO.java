package com.stanzaliving.website.response.dto;

import java.io.Serializable;

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
public class ResidenceOccupancyResponseDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int residenceOccupancyId;
	private Integer occupancyId;
	private String occupancyName;
	private int occupancyOccupancy;
	private Integer startingPrice;
	private Integer discountedPrice;
	private Integer inventoryPrice;
	private boolean soldOut;
	private String residenceOccupancyImgUrl;
	private String pricingPlan;
}
