package com.stanzaliving.core.leadership.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class TopViewDto {

	private String estateName;
	
	private Double buildingArea;
	
	private Integer numberOfRooms;
	
	private Integer numberOfBeds;
	
	private String pocName;
	
	private String pocMobile;
	
	private String pocEmail;
	
}
