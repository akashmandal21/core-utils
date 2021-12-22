package com.stanzaliving.core.deal.client.dto;

import com.stanzaliving.core.deal.client.enums.UserStatusType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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

	private Date actualMovedOutDate;
	
	private UserStatusType userStatusType;
	
	private String userCode;
	
}

