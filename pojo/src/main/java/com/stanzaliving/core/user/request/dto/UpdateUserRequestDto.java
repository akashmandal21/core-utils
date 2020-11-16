/**
 * 
 */
package com.stanzaliving.core.user.request.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.user.dto.Address;
import com.stanzaliving.core.user.enums.BloodGroup;
import com.stanzaliving.core.user.enums.Gender;
import com.stanzaliving.core.user.enums.Nationality;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserRequestDto {

	@NotNull(message = "User Id is mandatory to updates user")
	private String userId;
	
	private String email;

	private String firstName;

	private String lastName;

	private Gender gender;

	private String profilePicture;

	private LocalDate birthday;

	private Address address;
	
	private BloodGroup bloodGroup;
	
	private Nationality nationality;
	
	private String foriegnCountryCode;
	
	private String foriegnMobileNumber;
	
	private LocalDate dateOfArrival;
	
	private String nextDestination;
	
	private String userMobile;
}