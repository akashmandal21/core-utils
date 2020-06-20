package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Security extends BooleanService {
	private BooleanService bioMetric;
	private BooleanService cardAccess;
	private NightCurfew nightCurfew;
	private Blanket blanket;
}
