package com.stanzaliving.qrcode.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.stanzaliving.core.base.annotation.SendExceptionToSlack;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.base.utils.StanzaUtils;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestControllerAdvice
public class QRExceptionInterceptor {
	
	@SuppressWarnings("unchecked")
	@ExceptionHandler(QRAlreadyScannedException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@SendExceptionToSlack
	public <T> ResponseDto<T> handleQRException(QRAlreadyScannedException e) {

		String exceptionId = StanzaUtils.generateUniqueId();
		log.error("Got QRAlreadyScannedException for exceptionId: " + exceptionId, e);

		String errorMessgae = e.getMessage();

		return (ResponseDto<T>) ResponseDto.failure(errorMessgae, e.getExObject());
	}

	@SuppressWarnings("unchecked")
	@ExceptionHandler(QRInvalidScannedException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@SendExceptionToSlack
	public <T> ResponseDto<T> invalidQRException(QRInvalidScannedException e) {

		String exceptionId = StanzaUtils.generateUniqueId();
		log.error("Got Invalid Qr Exception for exceptionId: " + exceptionId, e);

		String errorMessgae = e.getMessage();

		return (ResponseDto<T>) ResponseDto.failure(errorMessgae, e.getExObject());
	}
}
