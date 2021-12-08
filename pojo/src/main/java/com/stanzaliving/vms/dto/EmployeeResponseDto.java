package com.stanzaliving.vms.dto;

import java.util.Date;

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
public class EmployeeResponseDto {

	private long id;

	private String name;

	private String identificationCode;

	private String phoneNumber;

	private Date dateOfBirth;

	private Date dateOfJoining;

	private String displayPicture;

	private String employeeIdImage;

	//private GovtId idCardType;

	private String govtIdImage;

	private String govtIdNumber;

	private String biometricId;

	private String status;

	private String biometricStatus;

}