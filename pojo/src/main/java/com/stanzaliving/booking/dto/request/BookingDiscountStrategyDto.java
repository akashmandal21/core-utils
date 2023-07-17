package com.stanzaliving.booking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDiscountStrategyDto {
	
	private String discountCode;
	private String lockIn;
	private Integer bookingType;
	private Double contractMonths;
	private Date contractStartDate;
	private Date contractEndDate;
	private boolean preBooking;
	private String residenceUuid;

}
