package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Meal {
	private int days;
	private boolean active;
	private String endTime;
	private String startTime;
}
