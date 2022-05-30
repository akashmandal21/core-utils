package com.stanzaliving.booking.dto.request;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.stanzaliving.booking.enums.BookingSource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExitDetailsRequestDto {

	@NotNull(message = "bookingUuid cannot be null")
	private String bookingUuid;

	@NotNull(message = "Move out date cannot be null")
	private LocalDate moveOutDate;

	@Builder.Default
	private Boolean conditionsSelected = Boolean.FALSE;

	private String reasonForLeavingUuid;
	
	 @Builder.Default
	 private BookingSource exitSource=BookingSource.ALFRED;

}
