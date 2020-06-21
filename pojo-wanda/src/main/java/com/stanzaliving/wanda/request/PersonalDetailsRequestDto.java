package com.stanzaliving.wanda.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.user.enums.Gender;
import com.stanzaliving.core.utilservice.annotations.EnsureNumber;
import com.stanzaliving.wanda.enums.BloodGroup;

import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
public class PersonalDetailsRequestDto {

	@NotBlank(message = "Mobile Number is Mandatory")
	@EnsureNumber(message = "Mobile must contain only numbers", fieldName = "mobile")
	private String mobileNumber;
	
	@NotBlank(message = "Please enter first name!!")
	private String firstName;
	@NotBlank(message = "Please enter last name!!")
	private String lastName;
	
	@Email(message = "You’ve entered an incorrect email format. Please try again!")
	@NotBlank(message = "Please enter Email")
	private String email;
	
	@NotBlank(message = "Please select Gender")
	private Gender gender;

	@NotBlank(message = "Please provide blood group")
	private BloodGroup bloodGroup;
}