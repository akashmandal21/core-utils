package com.stanzaliving.core.bookingservice.dto.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceQrCodeResponseDTO {

	private String qrcodeLink;
	private boolean status;
	private String message;
}
