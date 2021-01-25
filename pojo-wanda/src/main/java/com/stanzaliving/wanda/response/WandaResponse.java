package com.stanzaliving.wanda.response;

import com.stanzaliving.core.base.common.dto.ResponseDto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class WandaResponse<T> extends ResponseDto<T> {

	public WandaResponse(boolean status, String message, T t) {
		super(status, message, t);
	}
}
