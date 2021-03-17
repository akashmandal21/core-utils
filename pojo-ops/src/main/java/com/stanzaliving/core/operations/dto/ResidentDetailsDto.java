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
public class ResidentDetailsDto {

	private String residentUuid;
	private String residentCode;
	private String residentName;
	private String residenceUuid;
	private String residenceName;
	private String serviceMixUuid;
	private String serviceMixName;
	private String lastUpdatedBy;
	private ResidentStatus residentStatus;
	private String residentStatusDisplayName;
	private LocalDateTime lastUpdatedAt;

}
