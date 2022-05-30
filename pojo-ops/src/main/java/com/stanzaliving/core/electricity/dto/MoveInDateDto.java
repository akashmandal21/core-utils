package com.stanzaliving.core.electricity.dto;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MoveInDateDto {

	private Date moveInDate;

	private String userCode;
	
	private String userId;
	
	private String roomNumber;

	private Date oldestUserMoveInDate;

	private String oldestUserUserCode;

}
