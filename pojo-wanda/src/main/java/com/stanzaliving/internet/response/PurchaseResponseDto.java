package com.stanzaliving.internet.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PurchaseResponseDto {

	private String pgResponse;

	private String txnId;
	
	private String returnUrl;
}
