package com.stanzaliving.wanda.response;

import com.stanzaliving.core.user.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class UserPersonalDetailsUpdateResponse {
	
	private String firstName;
	
	private String lastName;
	
	private String mobileNumber;
	
	private String email;
	
	private Gender gender;
	
}
