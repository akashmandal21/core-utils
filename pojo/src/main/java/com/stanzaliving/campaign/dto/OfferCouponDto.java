package com.stanzaliving.campaign.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferCouponDto {

	@NotNull(message = "Offer Campaign Uuid is mandatory")
	 String OfferCampaignUuid;
	
	@NotNull(message = "Coupon Metadata Uuid is mandatory")
    String CouponMetadataUuid;
	
	 
}
