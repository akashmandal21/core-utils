package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Laundry extends BooleanService {
	private WashingService washIron;
	private WashingService washFold;
}
