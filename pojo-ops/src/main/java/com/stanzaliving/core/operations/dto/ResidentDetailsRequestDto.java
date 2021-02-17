package com.stanzaliving.core.operations.dto;

import com.stanzaliving.core.operations.enums.ResidentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ResidentDetailsRequestDto {

	private String dealUuid;
	private String residenceUuid;
	private String serviceMixUuid;
	private String residentCode;
	private String residentName;
	private ResidentStatus residentStatus;
	private String lastUpdatedBy;
	private Date lastUpdatedAt;
	

}
