package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.BlanketCoverage;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Blanket extends BooleanService {
	private BlanketCoverage providedFor;
}
