package com.stanzaliving.wanda.response;

import com.stanzaliving.wanda.enums.AlfredStep;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Builder;

@Builder
@AllArgsConstructor
@Getter
public class LoginResponse<T> {

	T t;
	
	private String firstName;
	
	private String lastName;
	
	private String mobile;
	
	private String email;
	
	private AlfredStep alfredStep;
}
