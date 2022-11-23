package com.stanzaliving.core.operations.dto;

import com.stanzaliving.core.operations.enums.ResidentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ResidentRequestDto {

	@NotBlank(message = "Deal is Mandatory")
	private String dealUuid;
	private String residenceUuid;
	private String serviceMixUuid;
	private List<ResidentStatus> residentStatus;
	private String residentCode;
	private String residentName;
}
