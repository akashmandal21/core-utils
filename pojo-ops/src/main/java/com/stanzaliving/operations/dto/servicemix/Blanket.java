package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.BlanketCoverage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Blanket extends BooleanService {
	private BlanketCoverage providedFor;
}
