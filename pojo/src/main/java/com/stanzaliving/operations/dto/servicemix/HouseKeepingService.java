package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HouseKeepingService {
	private boolean active;
	private HouseKeeping room;
	private HouseKeeping bathroom;
	private HouseKeeping commonBathroom;
	private HouseKeeping common_area;
	private HouseKeeping linen_change;
}
