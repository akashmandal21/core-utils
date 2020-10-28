package com.stanzaliving.campaign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferResponseDto{

	
	Long OfferId;
    String OfferUuid;
    String OfferName;
	
}
