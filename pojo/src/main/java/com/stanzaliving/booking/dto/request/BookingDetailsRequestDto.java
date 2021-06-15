package com.stanzaliving.booking.dto.request;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.stanzaliving.booking.enums.PaymentTerm;
import com.stanzaliving.booking.enums.ReferenceType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDetailsRequestDto {

	@NotEmpty(message = "referenceId cannot be null or blank")
	private String referenceId;
	
	@Builder.Default
	private ReferenceType referenceType = ReferenceType.BOOKING;
	
	@NotNull(message = "contractStartDate cannot be null")
	private Date contractStartDate;
	
	@NotNull(message = "contractEndDate cannot be null")
	private Date contractEndDate;
	
	@Builder.Default
	private PaymentTerm paymentTerm = PaymentTerm.MONTHLY;

}
