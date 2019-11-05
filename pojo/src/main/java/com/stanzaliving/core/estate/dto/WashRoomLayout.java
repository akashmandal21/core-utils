package com.stanzaliving.core.estate.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WashRoomLayout {

	private String type;
	
	private String size;

	private String numberOfWashRooms;
	
}
