package com.stanzaliving.core.operations.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResidentDetailsUploadDto {
	private int rowNum;
	private String residentCode;
	private String reason;

}
