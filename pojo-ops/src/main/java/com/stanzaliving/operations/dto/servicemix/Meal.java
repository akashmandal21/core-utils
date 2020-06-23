package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Meal extends BooleanService {
	private int days;
	private String endTime;
	private String startTime;
}
