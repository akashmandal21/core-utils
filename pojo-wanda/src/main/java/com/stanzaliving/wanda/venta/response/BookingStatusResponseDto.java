package com.stanzaliving.wanda.venta.response;

import com.stanzaliving.wanda.enums.AlfredStep;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class BookingStatusResponseDto {
    private String houseName;
    private String bookingUuid;
    private String bookingStatus;
    private AlfredStep alfredStep;
	@Builder.Default
	private Boolean agreementSent = false;
	private String studentId;
}
