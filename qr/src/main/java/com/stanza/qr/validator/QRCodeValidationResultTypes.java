package com.stanza.qr.validator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum QRCodeValidationResultTypes{
    
	VALIDATION_FAILED("Unable to recognize QR code"),
    
	INVALID_QRCODE("Image doesn't belongs to the page.");
    
    private String msg;

}
