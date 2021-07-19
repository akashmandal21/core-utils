package com.stanzaliving.campaign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferCouponResponseDto {

	
	Long OfferCouponId;
	String OfferCouponUuid;
    String OfferCampaignUuid;
    String OfferCouponMetadataUuid;
    
}
