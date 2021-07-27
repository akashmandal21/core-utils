package com.stanzaliving.core.deal.client.dto;

import java.util.Date;

import com.stanzaliving.core.deal.client.enums.UserStatusType;

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
	
	private Date expectedMoveInDate;
	
	private Date expectedMoveOutDate;
	
	private UserStatusType userStatusType;
	
	
	
}

