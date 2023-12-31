package com.stanzaliving.core.discount.dto.request;

import com.stanzaliving.booking.enums.BookingSubType;
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
	private Date stayLockInEndDate;
	private boolean preBooking;
	private String residenceUuid;
	private Integer advanceRentalFirstMonths;
	private Integer advanceRentalLastMonths;
	private Integer lastAdvanceRentalDays;
	private boolean remoteBooking;
	private BookingSubType bookingSubType;
}
