package com.stanzaliving.core.backendlocator.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class RoomPricingResponseDTO {

	private int basePrice;

	private double mandatoryServicesPrice;

	private int attributesPrice;

	private int bufferPrice;

	private int roomPrice;

	private double cgst;

	private double sgst;

	private double igst;

	private double foodServicePrice;

	private double foodServiceCgst;

	private double foodServiceSgst;

	private double foodServiceIgst;

}
