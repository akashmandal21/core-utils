package com.stanzaliving.wanda.response;

import com.stanzaliving.core.user.enums.Gender;
import com.stanzaliving.core.user.enums.Nationality;
import com.stanzaliving.wanda.enums.AlfredStep;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Builder;

@Builder
@AllArgsConstructor
@Getter
public class LoginResponse {
	
	private String firstName;
	
	private String lastName;
	
	private String mobile;
	
	private String email;
	
	private String userId;
	
	private Gender gender;
	
	private Nationality nationality;
	
	private AlfredStep alfredStep;
}
