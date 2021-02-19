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
public class ResidentDetailsRequestDto {

	@NotBlank(message = "Deal Id is Mandatory")
	private String dealId;
	private String residenceUuid;
	private String serviceMixUuid;
	private List<ResidentStatus> residentStatus;
	private String residentUuid;
	private String residentName;
	

}
