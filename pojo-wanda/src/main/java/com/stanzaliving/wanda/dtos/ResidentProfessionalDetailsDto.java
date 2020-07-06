package com.stanzaliving.wanda.dtos;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.wanda.enums.ResidentType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
public class ResidentProfessionalDetailsDto {

	@NotBlank(message = "User Id is Required")
	private String userId;
	
	@NotBlank(message = "Resident Type is Required")
	private ResidentType residentType;

	private String educationalInstitute;
	
	private String course;
	
	private String degree;
	
	private Integer yearOfStudy;
	
	private String companyName;
	
	private String designation;
	
}
