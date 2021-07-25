package com.stanzaliving.core.deal.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealUserRequestDto {
	
	private String userUuid;
	
	private String firstName;
	
	private String lastName;
	
	private String phone;
	
	private String email;
	
}

