package com.stanzaliving.vms.dto;

import java.util.Date;

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
public class EmployeeDto extends AbstractDto {

	private static final long serialVersionUID = -7906212069083081491L;

	private String employeeName;

	private String identificationCode;

	private String phoneNumber;

	private Date dateOfBirth;

	private Date dateOfJoining;

	private String displayPicture;

	private String employeeIdImage;

	private String govtIdType;

	private String govtIdImage;

	private String govtIdNumber;

	private String biometricStatus;
	
	private String biometricId;

	private String vendorServiceId;

}