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

	
	Long offerId;
    String offerUuid;
    String offerName;
    String whatsappMessage;
}
