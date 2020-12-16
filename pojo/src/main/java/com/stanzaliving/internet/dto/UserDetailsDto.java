package com.stanzaliving.internet.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserDetailsDto {
	
	@NotBlank(message = "ResidenceId cannot be blank")
	public String residenceId;
	
	@NotBlank(message = "Mobile No cannot be blank")
	public String mobileNo;

	@NotBlank(message = "User Code cannot be blank")
	public String userCode;

	@NotBlank(message = "UserName cannot be blank")
	public String userName;

	@NotBlank(message = "EmailId cannot be blank")
	public String emailId;
}
