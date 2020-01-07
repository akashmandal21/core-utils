package com.stanzaliving.core.projectsapprovalservice.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.estate.enums.SOWStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateEstateSOWStatusDto {

	@NotEmpty(message = "uuid is mandatory")
	private String uuid;

	@NotNull(message = "status is mandatory")
	private SOWStatus sowStatus;
}
