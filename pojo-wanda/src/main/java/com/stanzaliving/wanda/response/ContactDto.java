package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ContactDto {

	private String fullName;
	
	private String mobileNumber;
	
	private String designation;
	
	private String profilePicture;
}