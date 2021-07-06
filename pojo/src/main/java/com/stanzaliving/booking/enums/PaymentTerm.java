package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PaymentTerm {

	MONTHLY("MONTHLY"),
	ONE_INSTALMENT("ONE INSTALMENT"),
	TWO_INSTALMENT("TWO INSTALMENT"),
	THREE_INSTALMENT("THREE INSTALMENT"),
	FOUR_INSTALMENT("FOUR INSTALMENT");

	private String name;

}
