package com.stanzaliving.core.legal.dto.request;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.legal.enums.LegalStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateLegalStatusDto {

	String uuid;

	@NotNull(message = "status is mandatory")
	LegalStatus legalStatus;

	private String estateUuid;
}
