package com.stanzaliving.wanda.venta.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfirmBookingRequestDto {
	    
	    private String bookingId;

	    private String userUuid;
	    
}
