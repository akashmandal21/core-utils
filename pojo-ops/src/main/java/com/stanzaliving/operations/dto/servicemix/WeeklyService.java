package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeeklyService extends BooleanService {
	private int daysPerWeek;
}
