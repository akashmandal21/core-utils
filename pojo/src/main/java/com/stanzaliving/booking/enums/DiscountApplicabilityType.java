package com.stanzaliving.booking.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DiscountApplicabilityType {
	
	LIFO("LIFO"), FIFO("FIFO"),FLM("First and Last Month");

    String name;
}
