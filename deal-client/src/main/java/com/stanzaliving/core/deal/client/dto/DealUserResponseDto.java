package com.stanzaliving.core.deal.client.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealUserResponseDto {
	
	private String userUuid;
	
	private String firstName;
	
	private String lastName;
	
	private String phone;
	
	private String email;
	
	private Date expectedMoveInDAte;
	
	private Date expectedMoveOutDAte;
	
	private Date moveInDate;

	private String userCode;

}
