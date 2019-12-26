package com.stanzaliving.core.leadership.dto;

import com.stanzaliving.core.leadership.enums.LeadershipSearchType;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LeadershipSearchDto {

	private String uuid;
	
	private Long id;
	
	private String name;
	
	private String cityName;
	
	private String micromarketName;
	
	private LeadershipSearchType leadershipSearchType; 
}
