package com.stanzaliving.internet.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.enums.DataUnit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TopDto {

	@JsonProperty("topupId")
	private String topUpId;

	@JsonProperty("dataVolume")
	private Double topUpData;

	private DataUnit dataUnit;

	private double basePrice;

	private double tax;

	@JsonProperty("totalMrp")
	private double totalPrice;
}
