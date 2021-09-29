package com.stanzaliving.internet.response;

import com.stanzaliving.core.enums.DataUnit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopDto {
	private String topUpId;
	private Double topUpData;
	private DataUnit dataUnit;
	private double basePrice;
	private double tax;
	private double totalPrice;
}