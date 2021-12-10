package com.stanzaliving.vms.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;

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

	@NotBlank
	private String name;

	@NotBlank
	private String phoneNumber;

	@NotBlank
	private Date dateOfBirth;

	@NotBlank
	private Date dateOfJoining;

	private String displayPicture;

	private String employeeIdImage;

	private String govtIdType;
	
	private String govtIdImage;

	private String govtIdNumber;

	private String biometricId;

}