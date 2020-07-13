package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RazorPayConfirmationResponseDto {

	private String message;
	private Boolean status;
}
