package com.stanzaliving.core.operations.dto;

import com.stanzaliving.core.operations.enums.ResidentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ResidentCheckoutDetailsDto {

	private String dealUuid;
	private String residentUuid;
	private String residentCode;
	private String residentName;
	private String serviceMixName;
	private ResidentStatus residentStatus;

}
