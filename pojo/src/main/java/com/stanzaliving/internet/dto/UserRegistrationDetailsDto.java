package com.stanzaliving.internet.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserRegistrationDetailsDto {
	
	@NotBlank(message = "ResidenceId cannot be blank")
	private String residenceId;
	
	@NotBlank(message = "Mobile No cannot be blank")
	private String mobileNo;

	@NotBlank(message = "User Code cannot be blank")
	private String userCode;

	@NotBlank(message = "FirstName cannot be blank")
	private String firstName;

	@NotBlank(message = "EmailId cannot be blank")
	private String emailId;

	@NotNull(message = "Check-In Date cannot be null")
	private LocalDate checkInDate;
	
}
