package com.stanzaliving.vms.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class EmployeeGovtIdDto extends AbstractDto {

	private static final long serialVersionUID = -7906212069083081491L;

	private String employeeId;
	
	private String govtIdNumber;
	
	private String govtIdType;
	
	private String govtIdImage;

}