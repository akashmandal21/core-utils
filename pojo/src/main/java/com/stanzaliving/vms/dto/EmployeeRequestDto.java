package com.stanzaliving.vms.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class EmployeeRequestDto {

	private long id;

	private String name;

	private String phoneNumber;

	private Date dateOfBirth;

	private Date dateOfJoining;

	private String displayPicture;

	private String employeeIdImage;

//	private GovtId idCardType;

	private String govtIdImage;

	private String govtIdNumber;

	private String biometricId;

	private String hostelName;

}