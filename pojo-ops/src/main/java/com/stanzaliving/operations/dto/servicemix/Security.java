package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Security extends BooleanService {
	private BooleanService bioMetric = new BooleanService();
	private BooleanService cardAccess = new BooleanService();
	private NightCurfew nightCurfew = new NightCurfew();
	private Blanket blanket = new Blanket();
}
