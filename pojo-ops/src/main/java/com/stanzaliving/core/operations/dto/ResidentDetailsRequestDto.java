package com.stanzaliving.core.operations.dto;

import java.time.LocalDateTime;

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
public class ResidentDetailsRequestDto {

	private String dealUuid;
	private String residenceUuid;
	private String residentCode;
	private ResidentStatus residentStatus;
	private String serviceMixUuid;
	private String residentName;

	private String residentUuid; 
	private String serviceMixName;
	private String serviceMixAssignedBy;
	private LocalDateTime serviceMixAssignedAt;
	

}
