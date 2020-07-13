package com.stanzaliving.wanda.venta.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RazorPayConfirmationResponseDto {

	private String message;
	private Boolean status;
}
